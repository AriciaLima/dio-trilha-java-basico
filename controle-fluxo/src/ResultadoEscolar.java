public class ResultadoEscolar {
  public static void main(String[] args) {

    int nota = 10;

    if (nota >= 7)
      System.out.println("Aprovado");

    else if (nota >= 5 && nota < 7)
      System.out.println("Recuperação");

    else
      System.out.println("Reprovado");

  }
}

//Condiçao Ternária

/* // Cenário 2

public class ResultadoEscolar {
	public static void main(String[] args) {
		int nota = 6;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
	}
}
*/