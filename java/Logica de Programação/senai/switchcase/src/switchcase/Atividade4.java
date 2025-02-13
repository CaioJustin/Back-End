package switchcase;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o numero para descobrir  o mes ");
		int mes = teclado.nextInt();
		
		
		switch(mes) {
		case 1:
			System.out.println("Janeiro");
			break;
		case 2:
			System.out.println("Fevereiro");
			break;
		case 3:
			System.out.println("Março");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("maio");
			break;
		case 6:
			System.out.println("junho");
			break;
		case 7:
			System.out.println("julho");
			break;
		case 8:
			System.out.println("agosto");
			break;
		case 9:
			System.out.println("Setembro");
			break;
		case 10:
			System.out.println("Outurbro");
			break;
		case 11:
			System.out.println("Novembro");
			break;
		case 12:
			System.out.println("Dezembro");
			break;
		default :
			System.out.println("Erro r");
		break ; 
        
		}
		
		teclado.close();
	}
}
