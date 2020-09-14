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
public class practicaEjercicio9 {
    
    
    public static void main(String[] args){
           int pares=0, suma=0,res,cnp=0;
           int num;
           num = Integer.parseInt(JOptionPane.showInputDialog("¿CUANTOS NUMEROS DESEA INGRESAR? "));
           
        int a[]= new int[num];
        
        
        for(int i=0; i <num;  i++)
            
        {
           
            a[i] = (int)(Math.random()*15+5);
            
            
            System.out.println("arreglo" +i+ "--->"+a[i]);
            suma=suma+a[i];
            res=0;
            
            
            for (int j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    res++;
                }
            }
            
            
            
            if (res == 2) {
                cnp++;
                }
   
            if(a[i]%2==0){
                pares=pares+1;
            }
            
         }
     
        JOptionPane.showMessageDialog(null,"La cantidad de numeros primos es :" + cnp);
         JOptionPane.showMessageDialog(null,"son pares " +pares);
         
       JOptionPane.showMessageDialog(null,"la suma es"+suma);
        
               
}
    
    
}
