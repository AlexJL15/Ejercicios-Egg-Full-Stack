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
public class Ejercicio_7_Guia_Java {
    public static void main(String[] args){
        Scanner motor= new Scanner(System.in);
        
        byte tipomotor;
             tipomotor=motor.nextByte();
    
    switch (tipomotor){
        case 1:
            System.out.println ("La bomba es una bomba de agua");
            break;
        case 2:
            System.out.println ("La bomba es una bomba de gasolina");
            break;
        case 3:
            System.out.println ("La bomba es una bomba de hormigon");
            break;
        case 4: 
            System.out.println ("La bomba es una bomba de pasta alimenticia");
            break;
        default:
            System.out.println ("El valor no existe para ninguna bomba");
                
    } 
    }
    
}
