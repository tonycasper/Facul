public class Produto {
   private String nome;
   private double preco;
   private Etiqueta etiq;
  //construtor sem parametro
  public Produto(){
   setNome("");
   setPreco(0.0);
   setEtiq(null);
  }
  public String getNome(){
   return this.nome;
  }
  public double getPreco(){
   return this.preco;
  }
  public getEtiq(){
   return this.etiq;
  }
  public void setNome(String n){
   this.nome = n;
  }
  public void setPreco(double p){
   this.preco;
  }
  public void setEtiq(Etiqueta e){
   this.etiq = e;
  }
}
