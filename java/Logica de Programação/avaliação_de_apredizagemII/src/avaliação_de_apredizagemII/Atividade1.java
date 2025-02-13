package avaliação_de_apredizagemII;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[]=new int[6];
		int par=0;
		int impar=0;
		
		for(int i=0;i<numero.length;i++) {
			
			System.out.println("Digite o "+(i+1)+" Numero");
			numero[i]=teclado.nextInt();
			
			if(numero[i] %2 ==0) {
				par++;
			}else {
				impar++;
			}
			
			
		}
		
		
		System.out.println("A quantidade de par e : "+par);
		System.out.println("A quantidade de impar e : "+impar);
		
		
		teclado.close();
	}
}
