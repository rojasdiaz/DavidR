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
public class Ejercicio19 {
    public static void main(String[] args) {
        int ntrabajadores,trabajador = 0,opc = 0;
       
        double sueldoNeto;
      ntrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores de la empresa:"));
     int sueldos[] = new int[ntrabajadores];
      do{
      opc = Integer.parseInt(JOptionPane.showInputDialog(null,"                            MENU\n1.Ingresar los sueldos de los trabajadores"
              + "\n2.Sueldo Bruto de los trabajadores\n3.Sueldo Neto de los trabajadores\n4.Finalizar"));
     
    switch(opc){
        case 1:
            for(int i= 0 ; i < ntrabajadores ; i++){
           sueldos[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los sueldos de los  trabajadores:"));
           
      }
            break;
        case 2:
            for(int i = 0 ; i < ntrabajadores ; i++){
           
            JOptionPane.showMessageDialog(null,"Sueldo Bruto del trabajador ["+i+"]" + " " 
                   + "\n" + sueldos[i] );
            
            }
                
            
            break;
        case 3:
            int calculo = 0; 
            trabajador = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del numero del trabajador: "));
         
           
            if(trabajador >= ntrabajadores){
                JOptionPane.showMessageDialog(null,  "Esa posicion no existe\nIngresa una posición correcta");
            
            }
            else{
                
            calculo= calculo+sueldos[trabajador];
            sueldoNeto = calculo - 0.15 * calculo ;
                   JOptionPane.showMessageDialog(null,"El sueldo neto del trabajador ["+trabajador+"] es "+sueldoNeto);
        
                
            }
           
          
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
            break;
        default: JOptionPane.showMessageDialog(null,"No Digitó una opción correcta");
       
        
    }
     
           
      
        
      }while(opc != 4); 
      
        
  
      

    }
}