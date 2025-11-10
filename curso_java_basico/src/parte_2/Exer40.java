package parte_2;

public class Exer40 {
	public enum Estacao{
		PRIMAVERA,
		VERÃO,
		OUTONO,
		INVERNO
	}

	public static void main(String[] args) {
		// Como percorrer todos os valores de um enum usando o método values()?
		for(Estacao e: Estacao.values()) {
			System.out.println("Estação: " + e);
		}

	}

}
