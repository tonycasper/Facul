import javax.swing.JOptionPane;

public class solucao2{
   public static void main (String args []){
   String palavra = JOptionPane.showInputDialog
      ("digite um numero!");
   
   int i = Integer.parseInt(palavra);
   
   JOptionPane.showMessageDialog(null, palavra);
   }
}