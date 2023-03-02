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
public class Ejercicio_11_Guia_Java {
    public static void main(String[] args){
        Scanner palabra= new Scanner(System.in);
        String frase;
        
        System.out.println ("Por favor ingrese una frase");
        frase=palabra.next();
        
        String retorno=cambiar(frase);
        
        System.out.println(retorno);
    }
    
    public static String cambiar(String frase){
        String frase2;
            frase2=frase.toLowerCase();
        for (int i=0; i<frase.length() ; i++){
            char letra;
               letra=frase2.charAt(i);
               String l;
               l=Character.toString(letra);
            switch (l){
                case "a":
                    frase2=frase2.replace("a", "@");
                case "e":
                    frase2=frase2.replace("e", "#");
                case "i":
                    frase2=frase2.replace("i", "$");
                case "o":
                    frase2=frase2.replace("o", "%");
                case "u":
                    frase2=frase2.replace("u", "*");
            }
        }
        return frase2;
        
        }

    
    }
 
