public class Camarote extends Areavip{
   private double valorVip;
   
   public Camarote(double valor, String show,double valorAdicional,double valorVip){
      super(valor,show,valorAdicional);
      this.valorVip = valorVip;
   }
      
   public double calculaPreco(){
    return this.valor + valorAdicional+valorVip;  
   }
   
   public void setValorVip(double v){
      this.valorVip = v;
   }
   public double getValorVip(){
      return valorVip;
   }
   public double getValorAdicional(){
      return valorAdicional+valorVip;
   }
   public String toString(){
      return "Show :" +show +"\nPreco do Camarote: "+calculaPreco();
   }
}  