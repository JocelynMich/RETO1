
package reto1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RETO1 {

public static BufferedReader entrada = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int opcion,valor1,valor2, resultado = 0,opcion_no_valida=0;
        String tipo_operacion = "";
        System.out.println("Indica una opción  \n 1) Suma \n 2) Resta \n 3) Multiplicación \n 4) División");
        opcion = Integer.parseInt(entrada.readLine());
        System.out.println("Indica el valor 1");
        valor1= Integer.parseInt(entrada.readLine());
        System.out.println("Indica el valor 2");
        valor2=Integer.parseInt(entrada.readLine());
        switch(opcion){
            case 1 ->{
                resultado=valor1+valor2;
                tipo_operacion= "+";
            }
            case 2 ->{
                resultado=valor1-valor2;
                tipo_operacion="-";
            }
            case 3 ->{
                resultado=valor1*valor2;
                tipo_operacion="*";
            }
            case 4 ->{
                resultado=valor1/valor2;
                tipo_operacion="/";
            }
            default-> {
                    System.out.println("Opcion no valida");
                    }
        }
            System.out.println(valor1 + " " + tipo_operacion + " " + valor2 + " = " + resultado);
        
                
            
                
           
        }
    }        
                     


