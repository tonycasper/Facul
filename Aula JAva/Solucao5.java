import javax.swing.JOptionPane;

public class Solucao5{
   public static void main (String args []){
   double peso = Double.parseDouble(JOptionPane.ShowInputDialog("digite seu peso"));
   
   JOptionPane.showMessageDialog(null, "O peso informado foi" + peso + "kg");
   }
}