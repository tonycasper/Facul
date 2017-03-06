import javax.swing.JOptionPane;

public class CalculaArea{
   public static void main (String args[])
   {
      double area;
      //pegando os dados
      String sBase = JOptionPane.showInputDialog(
      "Digite a base do triangulo:");
      
      
      String sAltura = JOptionPane.showInputDialog(
      "Digite a Altura do triangulo:");
      
      //convertendo
      
      double base = Double.parseDouble(sBase);
      
      double altura = Double.parseDouble(sAltura);
      
      area = (base*altura)/2;
      
      //exibindo os dados
      
      JOptionPane.showMessageDialog(null, "A area do triangulo é:" + area);
      
      
}
}