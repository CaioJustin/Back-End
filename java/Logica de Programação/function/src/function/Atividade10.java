package function;

import java.util.Scanner;

class dads{
	
		
	
		float calcularmedia(float[] nota) {
			
			float soma=0;
			
			for(int i=0;i<nota.length;i++) {
				soma+=nota[i];
			}
		
			
			
			return soma/nota.length;
		}
	
		
		void verificarAprovacao(float media) {
			
			if(media >=7) {
				System.out.println("\nO Aluno esta aprovrao");
			}else {
				System.out.println("\nO aluno não esta aprovado");
			}
			
		}
		
}



public class Atividade10 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		dads aluno = new dads();
		
		float nota[]=new float[3];
		
		for(int i =0;i<nota.length;i++) {
			
			
			System.out.println("A "+(i+1)+"nota :");
			nota[i]=teclado.nextFloat();
		}
		
		
		
		float media = aluno.calcularmedia(nota);
		
		
		
		System.out.printf("A media e : %.1f ",media);
		aluno.verificarAprovacao(media);
		
		
		teclado.close();
	}
}
