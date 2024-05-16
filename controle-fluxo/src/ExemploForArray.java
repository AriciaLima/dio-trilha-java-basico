public class ExemploForArray {
  //os arrays começam com índice igual a 0 (zero), iniciamos a nossa variável x também com valor zero e validamos a quantidade de repetições, a partir da quantidade de elementos do array.
  public static void main(String[] args) {
    String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
  
    for (int x=0; x<alunos.length; x++) {
      System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
    }
  
  }
  }
