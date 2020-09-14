package ejercicio17;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author renzo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int ntrabajadores = 0,opc = 0,nada = 0,nada1 = 0 ,nada2 = 0;
        double sueldoneto = 0,sueldoneto1 = 0,sueldoneto2 = 0 ;
        ntrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de trabajadores de la empresa:"));
        int sueldos [] = new int[ntrabajadores];
    
        do{
          opc = Integer.parseInt(JOptionPane.showInputDialog(null,"                            MENU\n1.Ingresar los sueldos de los trabajadores"
              + "\n2.Sueldo Bruto de los trabajadores\n3.Sueldo Neto de los trabajadores\n4.Finalizar"));
            switch(opc){
            case 1:
                for(int i = 0 ; i < ntrabajadores  ; i++){
             sueldos [i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del trabajador ["+i+"]:"));
        }
   
            break;
            case 2:
                for(int i = 0 ; i < ntrabajadores  ; i++){
                    JOptionPane.showMessageDialog(null,"El sueldo neto del trabajador ["+i+"] es:" + " " +sueldos[i]);
                }
            break;
            case 3:
                int posicion = 0;
                posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del trabajador: "));
               
               if(posicion < ntrabajadores && posicion >= 0){             
        
                if(sueldos[posicion] < 410){
                sueldoneto =    100 * sueldos[posicion]/100d + (20 * sueldos[posicion])/100d;
                NumberFormat format = new DecimalFormat("#.##");
                JOptionPane.showMessageDialog(null,"El sueldo neto del trabajador ["+posicion+"] con el 20% de aumento es:" + " " +format.format(sueldoneto));
                }
               
            
                 if(sueldos[posicion] >= 410 && sueldos[posicion] <= 1600){
                   sueldoneto1 = 100 * sueldos[posicion]/100d + (10 * sueldos[posicion])/100d;
                   NumberFormat format = new DecimalFormat("#.##");
                    JOptionPane.showMessageDialog(null,"El sueldo del trabajador ["+posicion+"] es:" + " " + format.format(sueldoneto1));
                }
              
            
                 if(sueldos[posicion] > 1600){
                   sueldoneto2 = 100 * sueldos[posicion]/100d + (5 * sueldos[posicion])/100d;
                   NumberFormat format = new DecimalFormat("#.##");
                    JOptionPane.showMessageDialog(null,"El sueldo del trabajador ["+posicion+"] es:" + " " +format.format(sueldoneto2));
                }
              
               }
                 else{
                     JOptionPane.showMessageDialog(null,"No digito una posicion correcta  ");
                 }
                
         
            break;
            case 4:
                JOptionPane.showMessageDialog(null,"Gracias por usar el menu");
            break;
            default: JOptionPane.showMessageDialog(null,"Vuelva a digitar un caso correcto");
             }
    }while(opc != 4);
    }
    
}
