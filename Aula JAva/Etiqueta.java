public class Etiqueta{
   private String marca, tamanho;
   //construtor
   public Etiqueta(String ma, String tam){
      setMarca(ma);
      setTamanho(tam);
   }
   //getters e setters
   public String getMarca(){
      return this.marca;
   }
   public String getTamanho(){
      return this.tamanho;
   }
   public void setMarca(String marca){
       this.marca = marca;
   }
   public void setTamanho(String tam){
      tam = tam.toUpperCase();
       if(!tam.equals("P") && !tam.equals("M") &&
       !tam.equals("X") && !tam.equals("XG") && !tam.equals("XXG")){
       
       this.tamanho = "P"; 
   } else {
      this.tamanho = tam;
}
}
}