import javax.swing.JOptionPane;

public class TestaIngresso{
   public static void main (String args []){
      String show1,show2,show3;
      double valor1=0.0,valor2=0.0,valor3=0.0;
      
      show1 = "nando reis";
      valor1=10;
      
      
      show2 = "Cassia Eller";
      valor2 = 10;
      
      
      show3= "Capital Inicial";
      valor3=10;
      
      Ingressos ingresso1 = new Ingressos(valor1,show1);
      
      Areavip areavip1  = new Areavip(valor2, show2,20);
      
      Camarote camarote1 = new Camarote(valor3,show3,20,20);
      
      System.out.println(ingresso1.toString());
      System.out.println(areavip1.toString());
      System.out.println(camarote1.toString());
   }
}