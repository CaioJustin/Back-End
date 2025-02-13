package aval;

import java.util.Scanner;

class daldaos{
	
	String nome;
	String datanasc;
	float nota[]=new float[2];
	float media =0;
	
	  public daldaos() {
	        
	        this.nome = "";
	        this.datanasc = "";
	        this.nota = new float[2];
	        this.media = 0;
	    }
	

	public float Calcularmedia(float[] nota) {
		float soma=0;
		
		for(int i=0;i<2;i++) {
			soma+=nota[i];
		}
		
		
		 return media =soma/nota.length;
	}
	
	
	public void exibirInformacoes() {
		System.out.println();
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + datanasc);
        System.out.println("Média: " +media);
    }
	
}

public class Quesion2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		daldaos DadosAluno[] = new daldaos[2];
		
		for(int i =0;i<DadosAluno.length;i++) {
			
			DadosAluno[i]= new daldaos();
			
			System.out.println("Digite o nome ");
			DadosAluno[i].nome =teclado.nextLine();
			
			System.out.println("Digite a data de nascimento ");
			DadosAluno[i].datanasc =teclado.nextLine();
			
			
		
			
		 for (int d = 0; d < DadosAluno[i].nota.length; d++) {
	              System.out.print("Digite a " + (d + 1) + "ª nota: ");
	              DadosAluno[i].nota[d] = teclado.nextFloat();
	           }
		 
		 	
		 	teclado.nextLine();
		 	
			 
		 
			
		}
		
		
		for (int i = 0; i < DadosAluno.length; i++) {
			DadosAluno[i].exibirInformacoes();
        }
		
		
		
		teclado.close();
	}
}
