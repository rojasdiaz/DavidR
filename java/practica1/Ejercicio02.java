/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner ward = new Scanner(System.in);
        int matriz[][],caldet ;
        int a = 0,b = 0,c = 0,d = 0;
        
      matriz = new int[2][2];
        System.out.println("Determinante de Z: ");
        System.out.print("|[a]");
        System.out.println("[b]|");
        System.out.print("|[c]");
        System.out.println("[d]|");
            
       a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a: "));
       b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b: "));
       c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de c: "));
       d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de d: "));
        matriz [0][0] = a;
         matriz [0][1] = b;
         matriz [1][0] = c;
         matriz [1][1] = d;
        System.out.println("La matriz es: ");
        for(int i = 0 ; i < 2 ; i++ ){
         for(int j = 0 ; j < 2 ; j++){
             System.out.print(matriz[i][j] + " ");
         }
         System.out.println(" ");

         
        }
         caldet = (a * d) - (c * b);
         System.out.println("El resultado del determinante Z es: ");
         System.out.println(caldet);
       
    }
    
}
