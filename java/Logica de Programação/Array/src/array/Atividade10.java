package array;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i =0;
		
		int numero[]=new int[6];
		
		for(i=0;i<numero.length;i++) {
			
			System.out.println("Digite o "+(i+1)+" Numero");
			numero[i]=teclado.nextInt();
		}
		
		System.out.println("====Ordem Inversa====");
		
		
		for(i = 5;i>=0;i--) {
			
			System.out.println("Numero : "+numero[i]);
		}
		
		
		
		
		
		
		teclado.close();
	}
	
}
