package fors;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[]args) {
		Scanner teclado = new Scanner(System.in);
		
		int soma=0;
		
		for(int i =0 ;i <=4; i++) {
			
			System.out.println("Digite  um numero "+(i+1));
			int numero = teclado.nextInt();
			
			soma+=numero;
		}
		
		
		System.out.println("A soma e :"+soma);
		
		
		teclado.close();
	}
}
