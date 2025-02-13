package array;

import java.util.Scanner;

public class Atividade9 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[]=new int[5];
		int i=0;
		
		
		
		for(i=0;i<numero.length;i++) {
			
			System.out.println("Digite o "+(i+1)+" numero");
			numero[i]= teclado.nextInt();

			if(numero[i] <0) {
				numero[i]=0;
			}
			
		}
		
		
		for(i =0;i<numero.length;i++) {
			System.out.println("Numero : "+numero[i]);
			
		}
		
		
		teclado.close();
	}
}	
