package quest;

import java.util.Scanner;

public class Question10 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numer =teclado.nextInt();
		
		System.out.println("Digite o segundo numero");
		int numer2 =teclado.nextInt();
		
		System.out.println("Digite a operação [+,-]");
		String opt =teclado.next();
		
		
		switch(opt) {
		case "+":
			System.out.println("A SOMA E  "+(numer+numer2));
			break;
		case "-":
			System.out.println("A SUBTRAÇÃO E  : "+(numer-numer2));
			break;
		default:
			System.out.println("SIMBOLOGIA ERRADA");
			break;
		}
		
		teclado.close();
	}
}
