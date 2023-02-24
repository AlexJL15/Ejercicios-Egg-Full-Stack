/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_teorica;
import java.util.Scanner;
/**
 *
 * @author Narts
 */
public class Ejercicio_10_Guia_Java {
    public static void main(String[] args){
        Scanner n= new Scanner (System.in);
        int numero,contador;
        contador=0;
        do{
            System.out.println("Ingrese un numero");
            numero=n.nextInt();
            if (numero<1 || numero>20){
                do{
                    System.out.println("Ingrese un numero valido");
            numero=n.nextInt();
                }while (numero<1||numero>20);
            }else{
                System.out.print (numero);
                for (int i=0; i<numero; i++){
                    if (numero!=i){
                        System.out.print("*");
                    }else{
                        System.out.println ("*");
                    }
              
        }
            }
            
            contador++;
        }while (contador<4);
        
        
    }
    
}
