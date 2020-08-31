/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hola;

/**
 *
 * @author Electronic
 */

import java.util.Scanner;
public class Ejemplo {
    
    public static void main (String[] args){
       Scanner Leer = new Scanner(System.in);
       int n1,n2,n3, mayor, menor;
        System.out.print("ingrese primer numero: ");
        n1= Leer.nextInt();
        System.out.print("ingrese segundo numero: ");
        n2= Leer.nextInt();
        System.out.print("ingrese tercer numero: ");
        n3= Leer.nextInt();
        
        mayor = n1;
        if(n2>mayor){
            mayor = n2;
        }
        if(n3>mayor){
            mayor = n3;
        }
        
        menor = n1;
        if(n2<menor){
            menor = n2;
            
        }
         if(n3<menor){
             menor = n3;
         }

        
         System.out.println("El mayor numero es :"  + mayor);
            System.out.println("El menor numero es :"  + menor);
     
    }
    
    }
