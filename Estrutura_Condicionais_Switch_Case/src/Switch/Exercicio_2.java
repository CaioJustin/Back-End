package Switch;
import java.util.Scanner;
public class Exercicio_2 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int number =teclado.nextInt();
		
		
		switch (number) {
		case 0,1,2,3,4,5,6,7,8,9:
			System.out.println("Não e maior que 10!");
			break;
		case 10:
			System.out.println("E Igual a 10!");
			break;
		default:
			System.out.println("E maior a 10!");
			break;
		}
		
		teclado.close();
	}
}
