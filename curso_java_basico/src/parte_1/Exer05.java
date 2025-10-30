package parte_1;

public class Exer05 {

	public static void main(String[] args) {
		// Qual é o resultado de `10 / 3` em Java? E se for `10.0 / 3`?
		int numero1 = 10;
		int numero2 = 3;
		int resultado = numero1 / numero2;
		double numero3 = 10;
		double resultado2 = numero3 / numero2;
		System.out.println("Resulado[int/int]: " + resultado);
		System.out.printf("Nao e permitido guardar a divisao de um numero tipo double por um numero do tipo int,%nem uma variavel do tipo int.%n");
		System.out.println("A variavel resultado deve ser do tipo double.");
		System.out.println("Resultado2[double/int]: " + resultado2);
	}

}
