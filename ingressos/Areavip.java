public class Areavip extends Ingressos{
   protected double valorAdicional;
   
   public Areavip(double valor, String show,double valorAdicional){
      super(valor,show);
      this.valorAdicional = valorAdicional;
   }
   
   public double calculaPreco(){
    return this.valor + valorAdicional;  
   }
   
   public void setValorAdicional(double v){
      this.valorAdicional = v;
   }
   public double getValorAdicional(){
      return valorAdicional;
   }
   public String toString(){
      return "Show: "+show+"\nValor do Ingresso: "+this.calculaPreco();
   }
}