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
public class Ejercicio07 {
    //@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opc = 0,numbuscar;
        int arreglo[] =  new int[3];
        
        JOptionPane.showMessageDialog(null,"Ingrese los datos del arreglo: ");
        
               for (int i = 0; i < 3; i++) {

         
                arreglo[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el arreglo " + (i + 1) + ": "));
    }  
              
            do {
            System.out.println("\n--------MENU DE OPCIONES--------");
            System.out.println("1.-Ordenar el arreglo");
            System.out.println("2.-Buscar en los elementos del arreglo");
            System.out.println("3.-Salir");
                System.out.print("Escoga una opción: ");
                opc = leer.nextInt();
            switch(opc){
                case 1:
                    int aux;
                    for(int i = 0 ; i < 3 ; i++){
                        for(int j = i + 1 ; j < 3 ; j++){
                            if(arreglo[i] > arreglo[j]){
                                aux = arreglo[i];
                                arreglo[i] = arreglo[j];
                                arreglo[j] = aux;
                            }
                            
                        }
                        
                    }
                    System.out.println("Arreglo ordenado: ");
                    for(int i = 0 ; i < 3 ; i++){
                        System.out.print(arreglo[i] + " - ");
                                 
                    }
                    System.out.print("");
                    break;
                case 2:
               
                    numbuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento a buscar en el arreglo: "));
                 
              
                    
                    int i = 0;
                    while(i < 3 && arreglo[i] < numbuscar ){
                        i++;
                    }
                                 
                    
                    if(i == 3){
                   System.out.println("\nNumero no encontrado");
               }
               else{
                   if(arreglo[i] == numbuscar){
                       System.out.println("Numero encontrado en la posicion: "+i);
                   }
                   else{
                       System.out.println("\nNumero no encontrado");
                   }
               }
                   
                            break;
                case 3:
                    System.out.println("Saliendo del  MENU");
            break;
                default:
                    System.out.println("Ingrese una opcion correcta");
            }
        }while(opc!=3);
        
        
    }
}
   

