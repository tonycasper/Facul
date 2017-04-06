import javax.swing.JOptionPane;
public class TesteProduto{
   public static void main (String args[]){
      //variaveis e objetos
      String nome,marca, tamanho,msg = " ", preco;
//      DecimalFormat df2 = new DecimalFormat("#,##0.00");
      //solicita valores ao usuario
      nome = JOptionPane.showInputDialog("Qual o Nome?");
      marca = JOptionPane.showInputDialog("Qual a marca cachoro?");
      tamanho = JOptionPane.showInputDialog("Qual o tamanho?");
      preco =JOptionPane.showInputDialog("Qual o preco $$");
      //criar etiqueta depois do produto
      Etiqueta e1 = new Etiqueta(marca,tamanho);
      Produto p1 = new Produto();
      //altera conteudo de produto
      p1.setNome(nome);
      p1.setMarca(marca);
      p1.setEtiq(e1);
      //cria string para exibir conteudo
      msg = "\nNome: " + p1.getNome() + 
      "\nMarca: " +  p1.getEtiq().p1.getMarca()+
      "\nPreco: " + p1.getPreco().p1.getPreco();
      
      JOptionPane.showInputDialog(null,msg);
      System.exit(0);
   }
}