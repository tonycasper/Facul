import javax.swing.JOptionPane;
public class TesteProduto{
   public static void main (String args[]){
      //variaveis e objetos
      String marca, tamanho;
      double preco;

      //solicita valores ao usuario
      nome = JOptionPane.showInputDialog("Qual o Nome?");
      marca = JOptionPane.showInputDialog("Qual a marca cachoro?");
      tamanho = JOptionPane.showInputDialog("Qual o tamanho?");
      preco = double.parseDouble(JOptionPane.showInputDialog("Qual o preco $$"));
      //criar etiqueta depois do produto
      Etiqueta e1 = new Etiqueta(marca,tamanho);
      Produto p1 = new Produto();
      
      p1.setNome(nome);
      p1.setMarca(marca);
      p1.setEtiq(e1);

      System.exit(0);
   }
}