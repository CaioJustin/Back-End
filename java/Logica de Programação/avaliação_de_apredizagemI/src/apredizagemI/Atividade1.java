package apredizagemI;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		float nota[]=new float[5];
		int i=0;
		float soma=0;
		float media=0;
		
		while(i <5) {
			
			System.out.println("Digite a "+(i+1)+"nota : ");
			nota[i]=teclado.nextFloat();
			
			soma+=nota[i];
			
			i++;
		}
			
		
		media=soma/i;
		
		System.out.println("A media e : "+media);
		
		if(media >=7) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
	
		
		teclado.close();
	}
}
