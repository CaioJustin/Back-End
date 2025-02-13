package avaliação_de_apredizagemII;

import java.util.Scanner;

class dados{
	
	String nome;
	float nota[]=new float[4];
	float media;
	
	
		float Medial() {
			float soma=0;
			for(int i =0;i <=3;i++) {
				soma+=nota[i];
				
			}
			
			return  soma/4;
		}
		
		
}


public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		dados aluno[]=new dados[3];
		
		
		for(int i =0;i<aluno.length;i++) {
			
			aluno[i]=new dados();
			
			System.out.println("\niNFORME AS INFORMAÇOES DO "+(i+1)+" ALUNO");
			System.out.println("Digite o nome do aluno");
			aluno[i].nome=teclado.nextLine();
			
			for(int l=0;l<=3;l++) {
				
				System.out.println("Digite a "+(l+1)+" Nota");
				aluno[i].nota[l]=teclado.nextFloat();
			}
			
			teclado.nextLine();
			
		}
		
		
		
		
		for(int i=0;i<aluno.length;i++) {
			
			System.out.println("");
			System.out.println("Exibindo as informaçoes do "+(i+1)+" aluno");
			
			System.out.println("Nome : "+aluno[i].nome);
			
			for(int l=0;l<=3;l++) {
				System.out.println("Nota "+(l+1)+" : "+aluno[i].nota[l]);
			}
			System.out.printf("Media do aluno : %.2f",aluno[i].Medial());
			
		}
		
		System.out.println("");
		
		teclado.close();
	}
}
