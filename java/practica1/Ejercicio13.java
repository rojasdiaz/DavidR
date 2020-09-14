
    package ejercicio13;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author renzo
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int opc = 0;
     
       int cantidad = 0 ;
       
         cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de numeros:"));
           int array [] = new int[cantidad];
         do{
      opc = Integer.parseInt(JOptionPane.showInputDialog(null,"                                                                           MENU\n1.Ingreso  de numeros"
              + "\n2.Ordenar y mostrar los numeros de forma descendente\n3.-Visualizar los números menores al promedio de los  números almacenado en el arreglo.\n4.Finalizar"));
     
    switch(opc){
        case 1:
         
          for(int i= 0 ;i < cantidad ; i++){
            array [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los numeros en el arreglo:"));
          }
      
        JOptionPane.showMessageDialog(null,"Se guardo con exito los numeros en el arreglo  aleatoriamente");
   
            break;
        case 2:
            int aux = 0; 
           for(int i = 0; i < (cantidad - 1)  ; i++){
           for(int j = 0 ; j < (cantidad - 1)  ; j++ ){
               if(array[j] < array[j+1]){
                aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux ;
                } 
               
           }
           
       }
                     for(int i = 0; i < cantidad; i++) {
 JOptionPane.showMessageDialog(null,"Arreglo ordenado en forma decreciente:"+array[i] + " - ");  
 }
          
            
            break;
        case 3:
         String valor = "";
        int suma = 0;
        double promedio = 0;    
        for(int y = 0 ; y < cantidad ; y++){
            suma += array[y];
          
        }
          promedio = (double) suma/cantidad ;        
          for(int i = 0 ; i < cantidad ;i++){             
              if(array[i] < promedio){
             valor += array[i];
             valor += "    ";                
              }
          valor +=  "\n" ;
              }
            JOptionPane.showMessageDialog(null,"Arreglo menor al promedio de la suma total:   " +valor);         
          break;
        case 4:
            JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
            break;
        default: JOptionPane.showMessageDialog(null,"No Digitó una opción correcta");
       
        
    }        
      }while(opc != 4); 
         
    }
    
}
