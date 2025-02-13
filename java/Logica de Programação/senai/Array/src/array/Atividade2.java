package array;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float nota[]= new float[3];
		float soma=0;
		float media=0;
		int i =0;
		
		for(i=0; i <nota.length;i++) {
			
			System.out.println("Digite a "+(i+1)+" nota do aluno");
			nota[i]=teclado.nextFloat();
			
			soma+=nota[i];
		}
		
		
		media=soma/i;
		
		
		for(i=0;i<nota.length;i++) {
			
			System.out.println("A "+(i+1)+" nota  e : "+nota[i]);
			
		}
		
			System.out.printf("A Media :%.2f ",media);
		
		teclado.close();
	}
	
}
