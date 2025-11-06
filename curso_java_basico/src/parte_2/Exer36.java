package parte_2;

public class Exer36 {
	
	public enum diaSemana{
		DOMINGO,
		SEGUNDA,
		TERÇA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO
	}

	public static void main(String[] args) {
		// Declare um enum DiaSemana com os sete dias da semana.
		diaSemana hoje = diaSemana.QUARTA;
		System.out.println("Hoje é " + hoje);


	}

}
