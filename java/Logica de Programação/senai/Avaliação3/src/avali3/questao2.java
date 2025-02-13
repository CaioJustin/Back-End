package avali3;

import java.util.Scanner;

class dadosaluno{
	
	String nome;
	int idade =0;
	float nota[]=new float[3];
	float media=0;
}



public class questao2 {

	public static void main(String[]args) {
		
		float soma=0;
		Scanner teclado = new Scanner(System.in);
		
		dadosaluno aluno[] =new dadosaluno[5];
		
		for(int i=0;i<aluno.length;i++) {
			aluno[i]=new dadosaluno();
			
			System.out.println("Preencha os dados do "+(i+1)+" Aluno");
			
			System.out.println("Digite o nome do aluno ");
			aluno[i].nome=teclado.nextLine();
			
			System.out.println("Digite a idade do aluno");
			aluno[i].idade=teclado.nextInt();
			
			for(int d=0 ;d<3;d++) {
				System.out.println("Digite a "+d+" nota do aluno");
				aluno[i].nota[d]=teclado.nextFloat();
				
				soma+=aluno[i].nota[d];
			}
			
			
			aluno[i].media=soma/3;
			soma=0;
			teclado.nextLine();
		}
		
		
		
		
		for(int i =0;i<aluno.length;i++) {
			
			System.out.println("\nExibindo informaçoes do "+(i+1)+" Aluno");
			
			System.out.println("O nome do aluno :"+aluno[i].nome);
			System.out.println("A idade : "+aluno[i].idade);
			
			for(int d =0;d<3;d++) {
				
				System.out.println("A nota: "+aluno[i].nota[d]);
			}
			
			System.out.println("A media e : "+aluno[i].media);
		}
		
		
		
		
		teclado.close();
	}
}
