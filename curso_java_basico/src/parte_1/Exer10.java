package parte_1;
import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		// Use um `switch-case` para imprimir o dia da semana (1 = Domingo, 2 = Segunda, etc.).
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Dia da semana[1-7]: ");
		int diaSemana = scan.nextInt();
		
		switch(diaSemana) {
		case 1: System.out.println("Domingo"); break;
		case 2: System.out.println("Segunda-feira"); break;
		case 3: System.out.println("Terça-feira"); break;
		case 4: System.out.println("Quarta-feira"); break;
		case 5: System.out.println("Quinta-feira"); break;
		case 6: System.out.println("Sexta-feira"); break;
		case 7: System.out.println("Sábado"); break;
		default: System.out.println("Dia da semana não existe[1-7]");
		}
		
		scan.close();

	}

}
