package Algortimos;

import stacks.*;

/**
 * @author aldahir
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
     * 
     * @param c char que va a revisar 
     * @return determina si el char dado es un operador 
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
        boolean operand0=false;
        if (c=='1' || c=='2' || c=='3' || c=='4' || c=='5' || c=='6' || c=='7' || c=='8'
                || c=='9' || c=='0'  || c=='_' || c=='.'){
            operand0=true;
        }
        return operand;
        
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
                    while ( operadores.peek()!=null && esOperador(operadores.peek().charAt(0)) && 
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

    public static void main(String[] args) {
        String cad = "(8+9)*6-7/(4*5)*8+45.0+9";

        if (verificaSintaxis(cad)) {
            System.out.println("expresion correcta");
        } else {
            System.out.println("expresion no correcta");
        }
    }
}
