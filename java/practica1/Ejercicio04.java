package ejercicio04;
import javax.swing.JOptionPane;
/**
 *
 * @author renzo
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numero,i=0,digitos=0;
        String invertido="";
        
        
            //Leo el número que quiero invertir
            numero=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número:"));
            digitos=numero;
            //Utilizo un bucle que va dividiendo por 10 y cogiendo el resto de la división
            //para componer el número invertido
            while (digitos>=1){
                invertido=invertido+digitos%10;
                digitos=digitos/10;
            }
            JOptionPane.showMessageDialog(null, "El número invertido es: "+invertido);
        }
         
     
        
    }
    