package Switch;
import java.util.Scanner;
public class Exercicio_11 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num=teclado.nextInt() ;
		
		
		switch (num) {
		case 1:
			System.out.println("Hoje e domingo Final de semana");
			break;
		case 2:
			System.out.println("Hoje e Segunda dia util");
			break;
		case 3:
			System.out.println("Hoje e Terça dia util");
			break;
		case 4:
			System.out.println("Hoje e quarta dia util");
			break;
		case 5:
			System.out.println("Hoje e Quinta dia util");
			break;
		case 6:
			System.out.println("Hoje e sexta dia util");
			break;
		case 7:
			System.out.println("Hoje e sabado final de semanda");
			break;
		default:
			System.out.println("esse dia da semana não exite Invalido");
			break;
		}
		
		teclado.close();
	}
}
