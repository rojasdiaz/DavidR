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
public class Ejercicio15 {
    public static void main(String[] args) {
       
        String nombres[];
        int opc,modif,eliminar;
        nombres = new String[5];
        
          do{
           
              
              
          opc = Integer.parseInt(JOptionPane.showInputDialog("                         MENU\n1)-Ingreso de nombres\n2)-Modificar nombres"
                  + "\n3)-Eliminar nombres\n4)-Mostrar nombres\n5)-Salir"));
                    
            switch(opc){
                case 1:
                    for(int i = 0; i < 5 ; i++){
            
                   nombres[i] = (JOptionPane.showInputDialog(null,"Ingrese los nombres a guardar: "));
            }
                    
                    break;
                
                case 2:
            modif = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del nombre a modificar: "));
            if(modif >= 5 && modif < 0){
                JOptionPane.showMessageDialog(null,  "Esa posicion no existe\nIngresa una posición correcta");
            
            }
            else{
                nombres[modif] = (JOptionPane.showInputDialog("Nuevo valor en el nombre ["+modif+"] "));
            }
                    
                    
                    break;
           
            case 3:
                eliminar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición del nombre a eliminar: "));
            if(eliminar >= 5 ){
                JOptionPane.showMessageDialog(null,  "Esa posicion no existe\nIngresa una posición correcta");
            
            }
            else{
             
                nombres[eliminar] = "Sin nombre";
                JOptionPane.showMessageDialog(null,"Se eliminó el nombre en la posición ["+eliminar+"]");
            }
                break;
                        
            
            case 4:
         JOptionPane.showMessageDialog(null,"Nombre[0]="+nombres[0]+" " + "\nNombre[1]="+nombres[1]+" " + "\nNombre[2]="+nombres[2]+" " 
                 + "\nNombre[3]="+nombres[3]+" " + "\nNombre[4]="+nombres[4]+" ");
                break;
            case 5:    
                JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
                
        
        break;
        default: JOptionPane.showMessageDialog(null,"Digite una opción correcta");
           }
        }while(opc != 5);
        
    }
}
