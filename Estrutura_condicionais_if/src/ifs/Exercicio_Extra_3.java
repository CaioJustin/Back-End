package ifs;
import java.util.Scanner;

public class Exercicio_Extra_3 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Dgite um numero");
		int numero = teclado.nextInt();
		
		if(numero % 2 ==0 ) {
			System.out.println("O Numero e par ");
		}else {
			System.out.println("O Numero e impar");
		}
		
		teclado.close();
	}
}
