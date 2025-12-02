package parte_5;

public class Exer16 {
	
	static int fibonacciRecursivo(int n) {
		if(n <= 1){
			return n;
		}
		
		return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
	}
		
	static int fibonacciIterativo(int n) {
		if(n <= 1) {
			return  n;
		}
		int a = 0, b = 1, temp;
		for(int i = 2; i <=  n; i++) {
			temp = a + b;
			a = b;
			b = temp;
		}
		return b;
	
		
	}

	public static void main(String[] args) {
		//16. Calculadora de Fibonacci (Recursiva vs Iterativa)
		//Implemente duas versões para calcular Fibonacci: uma recursiva e
		//outra iterativa. Compare qual é mais eficiente para valores 
		//grandes.
		int n = 50;
		
		System.out.println("Fibonacci recursivo: " + fibonacciRecursivo(n));
		System.out.println("Fibonacci iterativo: " + fibonacciIterativo(n));	
		System.out.println("Acima de n = 40, a função recursiva começa a ficar mujito lenta.");

	}

}
