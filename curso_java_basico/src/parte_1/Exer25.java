package parte_1;

public class Exer25 {

	static int somaVetor(int[] vetor) {
		int soma = 0;
		for(int i = 0; i < vetor.length; i++) {
			soma += vetor[i];
		}
		return soma;
	}
	
	public static void main(String[] args) {
		// Como passar um array como parâmetro para uma função em Java?

		int[] vetor = {5, 10, 15, 20, 25};
		
		int resultado = somaVetor(vetor);
		System.out.println("A soma dos elemento do vetor é: " + resultado);
	}

}
