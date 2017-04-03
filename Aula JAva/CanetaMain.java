public class CanetaMain {
   // main
   public static void main(String args[]) {
      // criar objetos Caneta
      String msg = "";
      Caneta c1  = new Caneta("Tinteiro", "Vermelho");

      // montar e exibir conteúdo da caneta
      msg = "Tipo: "  + c1.getTipo() +
            "\nCor: " + c1.getCor();
      System.out.println(msg);
      
      // alterar atributos
      c1.setCor("Azul");
      
      // montar e exibir conteúdo da caneta
      msg = "Tipo: "  + c1.getTipo() +
            "\nCor: " + c1.getCor();
      System.out.println(msg);
      // fim
      System.exit(0);
   }
}