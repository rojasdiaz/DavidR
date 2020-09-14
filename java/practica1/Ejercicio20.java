/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaa;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class Ejercicio20 {
    public static void main(String[] args) {
        int nalumnos,promf = 0,opc = 0,mayor  = 0,menor = 0,intermedio = 0,sumtotal = 0;
        double  promfinal = 0;
        
        nalumnos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de alumnos:"));
            int notas[] = new int[nalumnos];
            int notas1[] = new int[nalumnos];
            int notas2 [] = new int[nalumnos];
            
            for(int i = 0 ; i< ( nalumnos)  ; i++){
                notas [i]  = Integer.parseInt(JOptionPane.showInputDialog("NOTA DE LAS 3 PRIMERAS PRACTICAS\nIngrese la primera nota del alumno "+(i+1)+":"));
               
            }
            for(int i = 0 ; i< ( nalumnos)  ; i++){
                notas1 [i]  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda nota del alumno "+(i+1)+":"));
               
            }
            for(int i = 0 ; i< ( nalumnos)  ; i++){
                notas2 [i]  = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercera nota del alumno "+(i+1)+":"));
               
            }
            
    do{
        opc = Integer.parseInt(JOptionPane.showInputDialog("                        MENU\n1.-Calcular el promedio final\n2.-Mostrar notas\n3.-Finalizar"));
        
        switch(opc){
            case 1:
               int posicion = 0;
               int promf2 = 0;
               int promf3 = 0;
               
               posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el  numero del alumno: "));
           
           if(posicion < nalumnos && posicion >= 0){
            if(notas[posicion] > notas1[posicion]){
                  if(notas[posicion] > notas2[posicion]){
                      mayor = notas[posicion];
                   }
                  else{
                      mayor = notas2[posicion];
                  }
              } 
              else if(notas1[posicion] > notas2[posicion]){
                  mayor = notas1[posicion];
              }
            else{
                mayor = notas2[posicion];
            }
            
              if(notas[posicion] < notas1[posicion]){
                  if(notas[posicion] < notas2[posicion]){
                      menor = notas[posicion];
                   }
                  else{
                      menor = notas2[posicion];
                  }
              } 
              else if(notas1[posicion] < notas2[posicion]){
                  menor = notas1[posicion];
              }
            else{
                menor = notas2[posicion];
            }
            
            sumtotal = notas2[posicion] + notas1[posicion] + notas[posicion];
            intermedio = sumtotal - mayor - menor;
            promfinal = ((mayor*2) + intermedio) / 3d ;
            NumberFormat format = new DecimalFormat("#.##");
            
            JOptionPane.showMessageDialog(null,"El promedio final del alumno ["+posicion+"] es: " + " " +    format.format(promfinal) );
           }
                else {
          
           
        JOptionPane.showMessageDialog(null,  "Esa posicion no existe\nIngrese una posición correcta");
                }

                 
                break;
         
            case 2:
                for(int i = 0 ; i < nalumnos ; i++){
                    JOptionPane.showMessageDialog(null,"Las  notas del alumno ["+i+"] es:"+notas[i] + "," + notas1[i] + "," + notas2[i]);
                }
        
                break;
                 case 3:
                JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
                break;
                default: JOptionPane.showMessageDialog(null,"Digite un caso correcto");
            
        }        
    }while(opc != 3);
    
    
    }
}
