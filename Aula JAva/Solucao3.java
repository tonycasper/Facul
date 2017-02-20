import javax.swing.JOptionPane;

public class Solucao3{
   public static void main (String args []){
   String numero = JOptionPane.showInputDialog
      ("digite um numero!");

   int i = Integer.parseInt(numero);  
   
   JOptionPane.showMessageDialog(null, numero);
   }
}