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
public class Ejercicio_8_Guia_Java {
    public static void main(String[] args){
        Scanner leer= new Scanner (System.in);
        
        int nota;
        System.out.println ("Ingrese una nota del 0 al 10");
        nota= leer.nextInt();
    while (nota>10 || nota<0){
        System.out.println ("Ingrese una nota valida por favor");
        nota=leer.nextInt();    
    }
    System.out.println ("La nota ingresada es valida muchas gracias");
    }
    
}
