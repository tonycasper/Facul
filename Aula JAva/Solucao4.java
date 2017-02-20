import javax.swing.JOptionPane;

public class Solucao4{
   public static void main (String args []){
   
   String Data;
   
   int numero1 = JOptionPane.showInputDialog
      ("digite o primeiro numero");
  
   int numero2 = JOptionPane.showInputDialog
      ("digite o segundo numero");
   
   int numero3 = JOptionPane.showInputDialog
      ("digite o terceiro numero");

     
   JOptionPane.showMessageDialog(null, "Data" numero1 + "/" + numero2 + "/" + numero3);
   }
}