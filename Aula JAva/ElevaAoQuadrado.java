import javax.swing.JOptionPane;

public class ElevaAoQuadrado{
   public static void main (String args[])
   {
      double elevado;
      
      //pegando os dados
      String sBase = JOptionPane.showInputDialog(
      "Digite o numero que deseja elevar ao quadrado:");
      
      //convertendo
      
      double base = Double.parseDouble(sBase);
      
      //Elevando ao quadrado
      
      elevado = base;
      
      //exibindo os dados
      
      
      JOptionPane.showMessageDialog(null, "O numnero elevado é:" + Math.pow(elevado,2));
         
   }
}