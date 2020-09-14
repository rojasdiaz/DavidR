/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import javax.swing.JOptionPane;

/**
 *
 * @author Electronic
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    double a;
       double b;
        double raiz ;
       
       a = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el cateto adyacente A :"));
       b = Double.parseDouble(JOptionPane.showInputDialog(" Ingrese el cateto opuesto B :"));
       
    
  raiz = Math.sqrt((a*a+b*b));
  
       
       
       JOptionPane.showMessageDialog(null,"La hipotenusa es : "+raiz);
        
}
    
    
}
