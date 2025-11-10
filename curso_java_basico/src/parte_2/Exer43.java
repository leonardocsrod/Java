package parte_2;

public class Exer43 {
	
	public enum NivelDificuldade{
		FACIL(10),
		MÉDIO(20),
		DIFÍCIL(30);
		
		private int pontos;
		
		
		NivelDificuldade(int pontos) {
			this.pontos = pontos;
		}
		
		public int getPontos() {
			return pontos;
		}
	}
	
	
	
	public static void main(String[] args) {
		// Crie um enum NivelDificuldade (FACIL, MEDIO, DIFICIL) e adicione um construtor que atribui
		//pontos a cada nível.
		NivelDificuldade nivel = NivelDificuldade.MÉDIO;
		
		System.out.println("Nível de dificuldade: " + nivel);
		System.out.println("Pontos do nível " + nivel + ": " + nivel.getPontos());

	}

}
