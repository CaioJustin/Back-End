package avaliação1;

import java.util.Scanner;



public class Questão3 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite o valor de A");
		int A = teclado.nextInt();
		
		System.out.println("Digite o valor de B");
		int B =teclado.nextInt();
		
		int C=0;
		
		if(A ==B) {
			C=A+B;
		}else {
			C=A*B;
		}
		
		System.out.println("O Resultado de C e : "+C);
		
		
		teclado.close();
	}
}
