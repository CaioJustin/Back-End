package struct;

import java.util.Scanner;


class dados{
	
	String nome;
	int idade;
	float nota[]=new float[2];
	float media;
}


public class Atividade6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		dados usuario[] = new dados[3];
		
		float soma=0;
		
		for(int i =0;i<usuario.length;i++) {
			
			usuario[i]=new dados();
			
			
			System.out.println("Digite as Informaçoes do "+(i+1)+" Usuario ");
			System.out.println("Digite o nome do Usuario");
			usuario[i].nome=teclado.nextLine();
			
			
			
			System.out.println("Digite a idade");
			usuario[i].idade=teclado.nextInt();
			
			
			for(int l=0;l<=1;l++) {
				
				System.out.println("Digite a "+(l+1)+" nota");
				usuario[i].nota[l]=teclado.nextFloat();
				soma+=usuario[i].nota[l];
			}
			usuario[i].media=soma/2;
			soma=0;
			
			teclado.nextLine();
		}
		
		
		for(int i=0;i<usuario.length;i++) {
			
			System.out.println("\nInformaçoes do "+(i+1)+" Usuario");
			System.out.println("Nome do Usuario "+usuario[i].nome);
			
			for(int l =0;l<=1;l++) {
				System.out.println((l+1)+" nota : "+usuario[i].nota[l]);
			}
			System.out.printf("A media e : %.2f",usuario[i].media);
			
		}
		
		
		
		
		
		
		
		
		teclado.close();
	}
}
