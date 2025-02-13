package avaliação1;

import java.util.Scanner;

public class Questão5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o valor de A : ");
		int A = teclado.nextInt();
		
		System.out.println("Digite o valor de B :");
		int B = teclado.nextInt();
		
		
		System.out.println("Escolha de Operação \n[+ para somar] \n[- para Subtrair] \n[* para multiplicar]   \n[/ para dividir]");
		String escolhar = teclado.next();
		
		
		if(escolhar.equalsIgnoreCase("+")) {
			System.out.println("O Valor de A+B e :  "+(A+B));
		}else if(escolhar.equalsIgnoreCase("-")) {
			System.out.println("O Valor de A-B e :  "+(A-B));
		}else if(escolhar.equalsIgnoreCase("*")) {
			System.out.println("O Valor de A*B e :  "+(A*B));
		}else if (escolhar.equalsIgnoreCase("/")) {
			
			if(B ==0) {
				System.out.println("O numero não pode ser dividido por zero");
			}else {
				System.out.println("O Valor de A/B e :  "+(A/B));
			}
			
		}
		
		
		teclado.close();
	}
}
