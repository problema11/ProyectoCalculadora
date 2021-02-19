package Algortimos;
import stacks.*;

/**
 * @author Clarissa,Roberto,aldahir
 * @version 1.0 
 * 16 de feb 2021
 * clase con funcionalidad principal del proyecto
 */
public class Calculadora {
    
    public Calculadora() {
    }

    /**
     * <pre>
     * Método que verifica que la expresión no tenga errores sintácticos.
     * Posibles errores: paréntesis no balanceados((), operadores juntos(*-),
     * cambio de signo(_+) antes de un operador.
     * </pre>
     *
     * @param expresion expresión matemática en notación infija
     * @return <ul>
     * <li>true: la expresión no tiene errores</li>
     * <li>false: la expresión tiene errores</li>
     * </ul>
     */
    
    public static boolean verificaSintaxis(String expresion) {
        boolean res = false;
        PilaADT <Character> p = new PilaA();//pila que almacena operadores
        int n = expresion.length();
        int i;
        boolean exit = true;
        char c;

        //primero verifica que los parentesis esten balanceados
        i = 0;
        while (i < n && exit) {
            c=expresion.charAt(i);
            if(c=='('){
                p.push(c);
            }
            else{
                if(c==')'){
                    if(!p.isEmpty()){
                        p.pop(); 
                    }
                    else
                        exit=false;
                }  
            }    
            i++;  
        }  
        if (exit && p.isEmpty()) { //si estan balanceados continua
            //despues verifica que no haya operadores juntos
            i = 0;
            while (i < n && exit) {
                c = expresion.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/' || c == '.') {
                    if (!p.isEmpty()) 
                        exit = false;
                    else 
                        p.push(c);
                }
                else {
                    if (c == '_') {// _ indica cambio de signo
                        if (p.isEmpty()) //no puede haber un cambio de signo 
                            exit = false; //antes de un operador
                        else{
                            //verifica que no haya 2 cambios de signo juntos
                            if(expresion.charAt(i-1)=='_')
                                exit=false;
                        }   
                    } 
                    else{
                        if (c != '(' && c != ')') { //ignora los parentesis
                            if(c=='0' && expresion.charAt(i-1)=='/'){
                                exit=false;
                            }
                            else
                                try {
                                    p.pop();
                                } 
                                catch (Exception e) {
                                }
                        }   
                    }       
                }
                i++;
            }
        }
        if (exit && p.isEmpty()) {
            res = true;
        }
        return res;
    }
    
    /**
     * @param c char que va a revisar 
     * @return operador determina si el char dado es un operador 
     */
    
    public static boolean esOperador(char c){
        boolean operador=false;
        
        if (c=='+' || c=='-' || c=='*' || c=='/'){
            operador=true;
        }
        return operador;             
    }
    
    /**
     * 
     * @param c char que va a revisar
     * @return determina si el char dado es un operando
     */
    public static boolean esOperando(char c){
        boolean operando=false;
        if (c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8'
                || c=='9' || c=='0'  || c=='_' || c=='.'){
            operando=true;
        }
        return operando;
        
    }
    
    /**
     * 
     * @param exp String de expresion a modificar 
     * @return la expresion ingresada en forma de arreglo 
     */
    public static String[] hacerArreglo(String exp){
        String[] arreExp=new String[exp.length()+1]; 
        int i=0,k;
        String aux;
        
        while (i<exp.length()){
            if (exp.charAt(i)=='(' || exp.charAt(i)==')' || esOperador(exp.charAt(i))){
                arreExp[i]=exp.charAt(i)+"";
                i++;
            }
            else{
                k=0;
                aux="";
                while (i+k<exp.length() && esOperando(exp.charAt(i+k))){
                    aux+=exp.charAt(i+k)+"";
                    k++; 
                }
                arreExp[i]=aux;
                i+=k;        
            }   
        }
        return arreExp;
    }
    
    /**
     * 
     * @param c char a revisar
     * @return el valor de la jerarquia de la operación
     */
    
    public static int checarJerarquia(char c){
        int numJer=0;
        
        if (c=='*' || c=='/')
            numJer=2;
        else if (c=='+' || c=='-' )
            numJer=1;
        return numJer;
    }
    
    /**
     * 
     * @param arreExp arreglo de la expresion dada
     * @return la modifica de expresion  infija a postfija
     */
    
    public static String [] notacionPostfija(String[] arreExp){
        PilaA<String> operadores=new PilaA();
        String[] notPost=new String[arreExp.length];
        int k=0;
        char c;
        operadores.push("(");
        arreExp[arreExp.length-1]=")";
        char negativo='-';
        char indnegativo='_';
        
        for (int i=0; i<arreExp.length; i++){
            if (arreExp[i]!=null){
                c=arreExp[i].charAt(0);
                if (esOperando(c)){
                    if (arreExp[i].charAt(0)=='_'){
                        notPost[k]=arreExp[i].replace(indnegativo, negativo);
                        k++;
                    }
                    else{
                        notPost[k]=arreExp[i];
                        k++;
                    }
                }
                if (c=='('){
                    operadores.push(arreExp[i]);
                }
                if (esOperador(c)){
                    while (operadores.peek()!=null && esOperador(operadores.peek().charAt(0)) && 
                            checarJerarquia(c)<=checarJerarquia(operadores.peek().charAt(0))){
                        notPost[k]=operadores.pop();
                        k++;        
                    }
                    operadores.push(arreExp[i]);
                }
                if(c==')'){
                    while(operadores.peek()!=null && esOperador(operadores.peek().charAt(0)) && operadores.peek().charAt(0)!='('){
                        notPost[k]=operadores.pop();
                        k++;
                    }
                    operadores.pop();
                }     
            }
        }
        return notPost;
    }
    
    /**
     * Método que asegura que lo que se tiene en el string sea un número, se utlizará en la evaluación 
     * @param cadena un string que se quiere asegurar que sea un número
     * @return <ul>
     * <li>true: la cadena sí es un número</li>
     * <li>false: la cadena no es un número</li>
     * </ul>
     */
    public static boolean esNumero(String cadena) {
        boolean resultado;
        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
    
    public static double evaluaPosfija(String[] arr){
        PilaADT<Double> p=new PilaA();
        double dato1=0;
        double dato2=0;
        double res=0;
        int n=arr.length;
        char op;
        int i=0;
        
        while(i<n && arr[i]!=null){
            if(esNumero(arr[i]))
                p.push(Double.parseDouble(arr[i]));
            else{
                op=arr[i].charAt(0);
                if(op=='+'){
                    dato2=p.pop();
                    dato1=p.pop();
                    res=dato1+dato2;
                    p.push(res);
                }
                else{
                    if(op=='-'){
                        dato2=p.pop();
                        dato1=p.pop();
                        res=dato1-dato2;
                        p.push(res);
                    }
                    else{
                        if(op=='*'){
                            dato2=p.pop();
                            dato1=p.pop();
                            res=dato1*dato2;
                            p.push(res);
                        }
                        else{
                            if(op=='/'){
                                dato2=p.pop();
                                dato1=p.pop();
                                res=dato1/dato2;
                                p.push(res);
                            }
                        }
                            
                    }
                }  
            }
            i++;
        } 
        res=p.pop();
        
        return res;
    }
    
    public static double calcula(String expresion){
        double res=-0.00021; //valor que indica expresion incorrecta
        String[] arr;
        String[] pos; 
        
        if(verificaSintaxis(expresion)){ //verifica
            arr=hacerArreglo(expresion);
            pos=notacionPostfija(arr); //convierte a posfija
            res=evaluaPosfija(pos); //evalua
        }
        
        return res;
    }

    public static void main(String[] args) {
        String cad ="(9*8)+6-99/0";
        double res;
        
        res=calcula(cad);
        if(res!=-0.00021)
            System.out.println(res);
        else
            System.out.println("no se puede calcular");
    }
}
