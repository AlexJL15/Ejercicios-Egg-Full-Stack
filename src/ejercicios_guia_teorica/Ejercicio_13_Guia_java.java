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
public class Ejercicio_13_Guia_java {
    public static void main(String[] args){
    Scanner nom= new Scanner(System.in);
    int integrantes;
    System.out.println ("Ingrese el numero de integrantes de su equipo");
    integrantes=nom.nextInt();
    String [] Equipo= new String [integrantes];
    
  for (int i=0; i<integrantes; i++){
      System.out.println ("Ingresa el nombre del "+ (i+1) + "° integrante de tu equipo");
      Equipo[i]=nom.next();
  }
  for (int i=0; i<integrantes; i++){
      System.out.println ("El nombre del " + (i+1) + "° integrante de tu equipo es " + Equipo[i]);
  }
}
}
