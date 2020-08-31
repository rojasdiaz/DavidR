/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios3;

import java.util.Scanner;

/**
 *
 * @author Electronic
 */
public class Ejercicio5 {
    
      public static void main(String[] args) {

       Scanner Leer = new Scanner(System.in); 
       
      System.out.print("ingrese el radio: ");
       double r;
       double p;
       double pi;
       r = Leer.nextDouble();
    pi = (3.14);
     p = (2*pi*r);
    
   
       
       
        System.out.print("el perimetro de un circulo es: " + p );
        
}
    
}
