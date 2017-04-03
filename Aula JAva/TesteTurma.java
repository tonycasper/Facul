import javax.swing.JOptionPane;

public class TesteTurma{
   //cadastrar nova turma
   public static void main (String args[]){
      //coletando os dados a ser cadatrado
      String nome = JOptionPane.showInputDialog("Nome :");
      String curso = JOptionPane.showInputDialog("Curso :");
      int qtdAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos"));
      String serie = JOptionPane.showInputDialog("Serie :");
    //cria um objeto do tipo turma
    Turma turma = new Turma(nome,curso,qtdAlunos,serie);
    //montando a saida
    String msg = "Nome: " + turma.getNome() + "\nCurso: " + turma.getCurso()
    + "\nQuantidade de Alunos: " + turma.getqtdAlunos() + "\nSerie" + turma.getSerie();
    
    //mostrando o aluno
   JOptionPane.showMessageDialog(null,msg);           
    
   }
   }
