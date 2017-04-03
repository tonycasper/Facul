public class Turma {
   //atributos
   private String nome,curso,serie;
   private int qtdAlunos;
   //metodo construtor
   public Turma(String n,String c, int qa, String s){
      nome = n;
      curso = c;
      qtdAlunos = qa;
      serie = s;
   }
   //metodos de acesso
   public String getNome(){
      return nome;
   }
   public String getCurso(){
      return curso;
   }
   public int getqtdAlunos(){
      return qtdAlunos;
   }
   public String getSerie(){
      return serie;
   }
   //metodos modificadores 
   public void setNome(String n){
      nome = n;
   }
   public void setCurso(String c){
      curso = c;
   }
   public void setqtdAlunos(int qa){
      qtdAlunos = qa;
   }
}