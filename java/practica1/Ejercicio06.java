/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Programa para calcular el promedio de dos numeros enteros");
        double num1= 5,num2 = 8,num3 = 15,num4 = 67,promedio1,promedio2;
        promedio1 = (num1 + num2)/2 ;
        promedio2 = (num3 + num4)/2 ;
        System.out.print("El promedio 1 es : ");
        System.out.println(promedio1);
        System.out.print("El promedio 2 es: ");
        System.out.println(promedio2);
    JOptionPane.showMessageDialog(null,"El primer promedio es" + " " + promedio1);
    JOptionPane.showMessageDialog(null,"El segundo promedio es" + " " + +promedio2);
    }
}
