public class Ingressos{
   protected double valor;
   protected String show;
   
   public Ingressos(double valor,String show){
      this.show = show;
      this.valor = valor;
   }
   
   public void setValor(double p){
      this.valor = p;
   }
   public void setShow(String n){
      this.show = n;
   }   
   public double getValor(){
      return valor;
   }
   public String getShow(){
      return show;
   }
   public String toString(){
      return "Show: "+show+"\nValor: "+valor;
   }
}