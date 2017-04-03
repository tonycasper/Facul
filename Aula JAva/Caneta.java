public class Caneta {
   // atributos
   private String tipo, cor;
   // construtor
   public Caneta(String t, String c) {
      tipo = t;
      cor  = c;
   }
   // métodos de acesso
   public String getTipo() {
      return tipo;
   }
   public String getCor() {
      return cor;
   }
   // métodos modificadores
   public void setTipo(String t) {
      tipo = t;
   }
   public void setCor(String c) {
      cor = c;
   }
}