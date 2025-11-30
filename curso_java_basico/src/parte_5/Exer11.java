package parte_5;

import java.util.Scanner;

public class Exer11 {

	public enum Triangulo{
		ISÓSCELES,
		EQUILÁTERO,
		ESCALENO
	}
	
	static Triangulo tipoTriangulo(float l1, float l2, float l3){
		Triangulo t = Triangulo.EQUILÁTERO;
		if(l1 != l2 && l2 != l3 && l3 != l1) {
			t = Triangulo.ESCALENO;
		} else if(l1 == l2 && l2 == l3 && l3 == l1) {
			t = Triangulo.EQUILÁTERO;
		} else if((l1 == l2 && l2 == l3 && l3 != l1) || (l1 == l2 && l2 != l3 && l3 == l1) || (l1 != l2 && l2 == l3 && l3 == l1)) {
			t = Triangulo.ISÓSCELES;
		}		
		return t;
	}
	
	public static void main(String[] args) {
		//11. Classificador de Triângulos (Enum + Função)
		//Crie um enum TipoTriangulo (EQUILATERO, ISOSCELES, ESCALENO). 
		//Escreva uma função que recebe três lados e retorna o tipo 
		//do triângulo usando o enum.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lado 1: ");
		float l1 = scan.nextFloat();
		
		System.out.println("Lado 2: ");
		float l2 = scan.nextFloat();
		
		System.out.println("Lado 3: ");
		float l3 = scan.nextFloat();
		
		Triangulo t = Triangulo.EQUILÁTERO;
		
		t = tipoTriangulo(l1, l2, l3);
		
		System.out.println("o tipo de triângulo é o " + t);
		scan.close();

	}

}
