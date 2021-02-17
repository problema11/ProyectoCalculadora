package Algortimos;
import stacks.*;

/**
 *
 * @author aldahir
 * @version 1.0
 * 16 de feb 2021
 * clase con funcionalidad principal del proyecto
 */

public class Calculadora {
    
    public Calculadora(){
    }
    
    /**
     * <pre>
     * Método que verifica que la expresión no tenga errores sintácticos.
     * Posibles errores: paréntesis no balanceados((), operadores juntos(*-),
     * cambio de signo(_+) antes de un operador.
     * </pre>
     * @param expresion expresión matemática en notación infija
     * @return <ul>
     *      <li>true: la expresión no tiene errores</li>
     *      <li>false: la expresión tiene errores</li>
     *      </ul>
     */
    
    public static boolean verificaSintaxis(String expresion){
        boolean res=false;
        PilaADT <Character> p=new PilaA();
        int n=expresion.length();
        int i;
        boolean exit=true;
        char c;
        
        //primero verifica que los parentesis esten balanceados
        i=0;
        while(i<n && exit){
            c=expresion.charAt(i);
            if(c=='('){
                p.push(c);
            }
            else
                if(c==')'){
                    if(!p.isEmpty()){
                        p.pop(); 
                    }
                    else
                        exit=false;
                }
            i++;
        }
        
        if(p.isEmpty() && exit){ //si estan balanceados continua
            //despues verifica que no haya operadores juntos
            i=0;
            while(i<n && exit){
                c=expresion.charAt(i);
                if(c=='+' || c=='-' || c=='*' || c=='/' || c=='.' ){
                    if(!p.isEmpty()){
                        exit=false;     
                    }
                    else
                        p.push(c);
                }
                else{
                    if(c=='_'){// _ indica cambio de signo
                        try{
                            if(p.isEmpty()){//no puede haber un cambio de signo 
                                exit=false; //antes de un operador
                            }     
                        }
                        catch(Exception e){                    
                        } 
                    }
                    else
                        if(c!='(' && c!=')'){ //ignora los parentesis
                            try{  
                                p.pop();
                            }
                            catch(Exception e){
                            }
                    }
                }     
                i++;
            }
        }
        if(exit)
            res=true;
        
        return res;
    }
    
    public static void main(String[] args) {
        String cad="(8+9)*6-7/(4*5)*8+45.0+9";
        
        if(verificaSintaxis(cad))
            System.out.println("expresion correcta");
        else
            System.out.println("expresion no correcta");  
    }
}


