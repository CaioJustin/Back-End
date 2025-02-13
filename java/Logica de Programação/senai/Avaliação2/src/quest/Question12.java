package quest;

import java.util.Scanner;

public class Question12 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite a quantidade notas que voce deseja ");
		int qtd =teclado.nextInt();
		
		float soma=0;
		
		float nota[] = new float[qtd];
		
		for(int i=0;i<nota.length;i++) {
			System.out.println("Digite a "+(i+1)+" nota");
			nota[i]=teclado.nextFloat();
			
			soma+=nota[i];
		}
		
		float media = soma/qtd;
		
		System.out.println("A media e : "+media);
		
		
		teclado.close();
	}
}
