import javax.swing.JOptionPane;

public class TamanhoString{
   public static void main (String args[])
   {
      int primeira,segunda,terceira;
      
      //pegando os dados
      String sPrimeira = JOptionPane.showInputDialog(
      "Digite a primeira palavra:");      
      
      String sSegunda = JOptionPane.showInputDialog(
      "Digite a segunda palavra:");
      
      String sTerceira = JOptionPane.showInputDialog(
      "Digite a terceira palavra:");
      
      //pegando o tamnho da string      
      
     primeira = sPrimeira.length();
     
     segunda = sSegunda.length();
     
     terceira = sTerceira.length();
     
      //exibindo os dados
      
      JOptionPane.showMessageDialog(null,
       "O comprimento da primeira é :" + primeira + "\n" +
       "O comprimento da segunda é :" + segunda + "\n" +
       "O comprimento da terceira é :" + terceira + "\n");
      
      
}
}