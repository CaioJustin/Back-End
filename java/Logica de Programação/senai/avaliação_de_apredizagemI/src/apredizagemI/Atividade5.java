package apredizagemI;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		int media=0;
		int soma=0;
		int quantidade=0;
		
		
		do {
			
			System.out.println("Digite o numero");
			 numero =teclado.nextInt();
			
			 quantidade++;
			 soma+=numero;
			 
			 
		}while(numero >0);
		
		media=soma/quantidade;
		
		System.out.println("A quantidade de numero : "+quantidade);
		System.out.println("A soma dos numeros : "+soma);
		System.out.println("A media : "+media );
		
		
		teclado.close();
	}
}
