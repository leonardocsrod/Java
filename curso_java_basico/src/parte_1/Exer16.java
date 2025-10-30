package parte_1;

public class Exer16 {

	public static void main(String[] args) {
		// O que acontece se tentarmos acessar `array[5]` em um array de tamanho 3?
		int[] valores = {10, 20, 30};
		for(int i = 0; i< valores.length; i++) {
			System.out.println(valores[i]);
		}
		//System.out.println(valores[5]);
		System.out.println("Ocorre um erro.");
		
	}

}
