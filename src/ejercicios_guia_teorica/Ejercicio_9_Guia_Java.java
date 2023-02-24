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
public class Ejercicio_9_Guia_Java {
    public static void main(String[] args){
     
        Scanner n= new Scanner (System.in);
        int num,cont,sum;
         sum=0;
         cont=0;
        do{
            System.out.println ("Ingrese un numero por favor");
            num=n.nextInt();
            if (num==0){
                System.out.println ("Se ha encontrado el 0");
                break;
       } else if (num>0){
             sum=sum+num; 
            }else if (num<0){
           sum=sum;
       }
        cont=cont+1;    
        }while (cont<20);
        
     System.out.println ("El resultado de la suma de los numeros ingresados es: " + sum + " Se han dejado fuera los numeros negativos en caso de que los tuviera");
    }
}
