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
public class practicaEjercicio18 {
    public static void main(String[] args){
           int num,pares=0,impares=0;
    double suma=0, prom=0;
    int contador=0;
   num = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos numeros quiere mostrar: "));
        int[] no = new int[num];
        
        for (int i=0 ; i< num ; i++) {
            
          no[i] = Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite los numeros: " ));  
          
          suma=suma+no[i];
          prom=(suma)/num;
          
          if(no[i]>=100){
              
              contador++;
           } 
          else{
          JOptionPane.showMessageDialog(null,"NO ES UN NUMERO MAYOR QUE 100 ");
          
          }
          
            if(no[i]%2==0){
                pares=pares+1;
            }else{
                impares=impares+1;
            }
            
           
        }
        
        int maximo,minimo;
        
        maximo=minimo=no[0];
        
        
        for(int i=0; i<num ; i++){
            if(no[i]>maximo){
                maximo = no[i];
                
            }
            if(no[i]<minimo){
                minimo = no[i];
                
            }
            
            
        }
        
        
        
        
        
        
          
           JOptionPane.showMessageDialog(null,"LA SUMA ES :"+suma);
    JOptionPane.showMessageDialog(null,"LA CANTIDAD DE PARES ES :"+pares);
    
    JOptionPane.showMessageDialog(null,"LA CANTIDAD DE IMPARES ES :"+impares);
    JOptionPane.showMessageDialog(null,"EL MAXIMO NUMERO ES :"+maximo);
    JOptionPane.showMessageDialog(null,"EL MINIMO ES:"+minimo);
    
    } 
}  
   
