package parte_1;
import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		//Qual a diferença entre `==` e `.equals()` em Java?
		Scanner scan = new Scanner(System.in);
		System.out.println("A classe String so faz comparacao utilizando o metodo .equals.");
		
		System.out.print("Digite uma letra: ");
		String letra = scan.next();
		
				
		if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || 
				letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
			System.out.println("A letra digitada e uma vogal.");
		} else {
			System.out.println("A letra digitada nao e uma vogal.");
		}
		scan.close();
	}

}
