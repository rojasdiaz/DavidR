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
public class Ejercicio4 {
    
    
      public static void main(String[] args) {

       Scanner Leer = new Scanner(System.in); 
        double h;
       double b;
       double area;
       double volumen;
   System.out.print("ingrese el la altura : ");
   h = Leer.nextDouble();
   System.out.print("ingrese la base : ");
    b = Leer.nextDouble();
   
      area = ((4*h*b)+(2*b*b));
      
      volumen = ((2*b*b)*h);
       
  System.out.println("el Area es : " + area);
   System.out.println("el Volumen es  : " + volumen);
    
 
       
       
        
        
}
    
}
