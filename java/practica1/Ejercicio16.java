/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa;

import javax.swing.JOptionPane;


public class Ejercicio16 {
    public static void main(String[] args) {
            
        int opc,numbuscar,aux,nelementos;
        
       
        
       nelementos = Integer.parseInt(JOptionPane.showInputDialog("Digite cuantos alumnos hay en el aula: "));
        int codigos[] = new int[nelementos];
        
          do{
           
              
              
          opc = Integer.parseInt(JOptionPane.showInputDialog("                         MENU\n1)-Ingreso de códigos\n2)-Busqueda de códigos" + "\n3)-Mostrar códigos\n4)-Salir"));
                    
            switch(opc){
                case 1:
                    for(int i = 0; i < nelementos ; i++){
            
                   codigos[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese los códigos de los alumnos: "));
            }
                    
                    break;
                case 2:
                    
                    for(int i = 0 ; i < nelementos ; i++){
                        for(int j = i + 1 ; j < nelementos - 1 ; j++){
                            if(codigos[i] > codigos[j]){
                                aux = codigos[i];
                                codigos[i] = codigos[j];
                                codigos[j] = aux;
                            }
                            
                        }
                        
                    }
                    
                    numbuscar = Integer.parseInt(JOptionPane.showInputDialog("Digite el elemento a buscar en el arreglo: "));
                 
              
                    
                    int i = 0;
                    while(i < nelementos && codigos[i] < numbuscar ){
                        i++;
                    }
                                 
                    
                    if(i == nelementos){
                   JOptionPane.showMessageDialog(null,"\nNumero no encontrado");
               }
               else{
                   if(codigos[i] == numbuscar){
                      JOptionPane.showMessageDialog(null,"\nNumero encontrado  en la posicion:"+i);
                      
                   }
                   else{
                       JOptionPane.showMessageDialog(null,"\nNumero no encontrado");
                    
                   }
               }
               
                    break;
            case 3:
         for(int m = 0 ; m < nelementos ; m++){
                        for(int j = m + 1 ; j < nelementos; j++){
                            if(codigos[m] > codigos[j]){
                                aux = codigos[m];
                                codigos[m] = codigos[j];
                                codigos[j] = aux;
                            }
                            
                        }
                        JOptionPane.showMessageDialog(null,codigos[m]);
                    }
         
               
                break;
            case 4:    
                JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
                
        
        break;
            default: JOptionPane.showMessageDialog(null,"Digite una opción correcta");
           }
        }while(opc != 4);
        
    }
}

