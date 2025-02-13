package ifage;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[]args) {
		
		Scanner teclado  = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero ");
		int numero1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero ");
		int numero2 = teclado.nextInt();
				
		System.out.println("Digite o terceiro numero ");
		int numero3 = teclado.nextInt();
		
		
		if(numero1 > numero2 && numero1 > numero3) {
			System.out.println("O Maior e o numero 1 :"+numero1);
		}else if(numero2>numero1 && numero2>numero3) {
			System.out.println("O Maior e o numero 2 :"+numero2);
		}else if (numero3 > numero1 && numero3>numero2) {
			System.out.println("O Maior e o  numero 3 : "+numero3);
		}
		
		
		if(numero1 < numero2 && numero1< numero3) {
			System.out.println("o menor e o numero1 :"+numero1);
		}else if(numero2 < numero1 && numero2<numero3) {
			System.out.println("O menor e o numero2 : "+numero2);
		}else if ( numero3 < numero2 && numero3 < numero1) {
			System.out.println("o menor e o numero3 :"+numero3);
		}
		
		
		
		teclado.close();
	}
}
