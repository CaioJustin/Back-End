package ifage;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um numero ");
		int numero = teclado.nextInt();
		
		
		if(numero > 10) {
			System.out.println("O Numero  e maior que 10");
		}else if (numero < 10) {
			System.out.println("O Numero e menor que 10");
		}else if (numero == 10 ) {
			System.out.println("O Numero e igual a 10!");
		}
		
		
		teclado.close();
	}
	
	
}
