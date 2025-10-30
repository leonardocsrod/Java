package parte_1;
import java.util.Scanner;

public class Exer26 {
	
	static double converteCelsiusParaFahrenheit(double c) {
		double fahrenheit = (1.8 * c) + 32;
		
		return fahrenheit;
	}

	public static void main(String[] args) {
		// Crie uma função converterCelsiusParaFahrenheit que recebe uma temperatura em Celsius e retorna o valor em Fahrenheit.

		Scanner scan = new Scanner(System.in);
		System.out.print("Temperatura em Celsius: ");
		double celsius = scan.nextDouble();
		
		double fahrenheit = converteCelsiusParaFahrenheit(celsius);
		System.out.printf("Temperatura em Fahrenheit: %.1f", fahrenheit);
		
		scan.close();
		
		
	}

}
