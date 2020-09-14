package ejercicio08;

import javax.swing.JOptionPane;

/**
 *
 * @author renzo
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc = 0,cont = 0,auxiliar;
        int arreglo[][] = new int [5][4];
        int arraux[] = new int [50];
       
         do{
      opc = Integer.parseInt(JOptionPane.showInputDialog(null,"MENU\n1.Generar los numeros aleatoriamente en el arreglo"
              + "\n2.Mostrar los numeros\n3.Ordenar los numeros en el arreglo\n4.Finalizar"));
     
    switch(opc){
        case 1:
            for(int i = 0 ; i < 5 ; i++){
            for(int j = 0 ; j < 4 ; j++){
            arreglo[i][j] = (int) (Math.random()*40+10);
                arraux[cont]=arreglo[i][j];
                cont++;
                    }
        }
      
        JOptionPane.showMessageDialog(null,"Se genero con exito los numeros en el arreglo  aleatoriamente");
   
            break;
        case 2:
            String resultado = "";
      
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
               resultado += arreglo[i][j];
               resultado += "  ";
            }
     resultado +=  "\n" ;
        }
JOptionPane.showMessageDialog(null,"La matriz es:" + "\n" +resultado);
                
            
            break;
        case 3:
            
         for(int i=0;i<20;i++){
             for( int j=i+1;j<20;j++){
                 if(arraux[i]>arraux[j]){
                     auxiliar=arraux[i];
                     arraux[i]=arraux[j];
                     arraux[j]=auxiliar;
                 }          
             }
         }
         cont=0;
         for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
                arreglo[i][j]=arraux[cont];
                cont++;
            
            }  
        }
          String resultado2 = "";
        JOptionPane.showMessageDialog(null,"La matriz es:");
        for(int i=0;i<5;i++){
            for(int j=0;j<4;j++){
               resultado2 += arreglo[i][j];
               resultado2 += "  ";
            }
     resultado2 +=  "\n" ;
        }
JOptionPane.showMessageDialog(null,"La matriz es:" + "\n" +resultado2); 
          
            break;
        case 4:
            JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
            break;
        default: JOptionPane.showMessageDialog(null,"No Digitó una opción correcta");
       
        
    }
     
           
      
        
      }while(opc != 4); 
        
    }
    }
    