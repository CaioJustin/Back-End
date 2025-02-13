package struct;

import java.util.Scanner;


class info{
	
	
	String nome;
	int idade;
	float nota[]=new float[2];
	
}


public class Atividade5 {

	public static void main(String[]args) {
		
		
			Scanner teclado = new Scanner(System.in);
		
			info Usuario[]= new info[3];
			
			
			for(int i=0;i<Usuario.length;i++) {
				
				Usuario[i]=new info();
				
				System.out.println("========Digite as Informaçoes do "+(i+1)+" Aluno");
				System.out.println("Digite o nome do aluno");
				Usuario[i].nome=teclado.nextLine();
				
				
				
				System.out.println("Digite a idade do aluno");
				Usuario[i].idade=teclado.nextInt();
				
				for(int l =0;l<=1;l++) {
					
					System.out.println("Digite a "+(l+1)+" nota");
					Usuario[i].nota[l]=teclado.nextFloat();	
				}
				teclado.nextLine();
			}
			
			
			
		for(int i=0;i<Usuario.length;i++) {
			System.out.println("Informaçoes do"+(i+1)+"Usuario");
			System.out.println("Nome : "+Usuario[i].nome);
			System.out.println("idade : "+Usuario[i].idade);
			
			for(int l=0;l<=1;l++) {
				System.out.println((l+1)+" nota : "+Usuario[i].nota[l]);
			}
		}
			
			
			
			
		teclado.close();
	}
}
