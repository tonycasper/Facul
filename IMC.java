import javax.swing.JOptionPane;

public class IMC
{
   public static void main (String args[])
   {  
     double dQtddias;
         
      //pegando os dados
      String sIdade = JOptionPane.showInputDialog(
      "Digite a sua idade:");
         
      double dIdade = Double.parseDouble(sIdade);
      
      dQtdias = dIdade * 365;
      
      JOptionPane.showMessageDialog(null, "A quantidade de dias é:" + dQtdias);
      
   }
}