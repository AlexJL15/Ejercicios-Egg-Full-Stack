/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_guia_teorica;
import java.util.Scanner;
/**
 *
 * @author mcnar
 */
public class Ejercicio_12_Guia_Java {
    public static void main(String[] args){
        Scanner n= new Scanner(System.in);
        int numero1,numero2;
        System.out.println ("Ingrese el primer numero");
        numero1=n.nextInt();
        System.out.println ("Ingrese el segundo numero");
        numero2=n.nextInt();
        mult(numero1,numero2);
    }
    public static void mult(int numero1, int numero2){
        if (numero1%numero2==0){
            System.out.println ("El numero "+ numero1 + " es multiplo de "+ numero2);
        }else{
            System.out.println ("El numero "+ numero1 + " no es multiplo de "+ numero2);
        }
            
    }
}
