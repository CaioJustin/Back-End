package While;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero=0;
		int soma=0;
		int i=0;
		
		do {
			
			System.out.println("Digite um numero ");
			numero=teclado.nextInt();
			
			soma+=numero;
			i++;
			
		}while(numero >=0);
		
		int media =soma/i;
		
		System.out.println("A Media e : "+media);
		
		
		
		teclado.close();
	}
}
