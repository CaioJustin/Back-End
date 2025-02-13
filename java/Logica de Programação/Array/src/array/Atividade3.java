package array;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		float nota[]=new float[4];
		int i =0;
		float soma=0;
		float media=0;
		
		for(i=0;i< nota.length;i++) {
			System.out.println("Digite a "+(i+1)+" nota");
			nota[i]=teclado.nextFloat();
			
			soma+=nota[i];
		}
		
		media=soma/nota.length;
		
		for(i=0;i <nota.length;i++) {
			System.out.println("A "+(i+1)+" nota e : "+nota[i]);
			
		}
			System.out.printf("A media e : %.2f ",media);
			
			if(media >=7) {
				System.out.println("\nO Aluno esta aprovado");
			}else if(media >=5) {
				System.out.println("\nO Aluno estade recuperação");
			}else {
				System.out.println("\nO aluno esta reprovando");
			}
			
			
		
		
		teclado.close();
	}
}
