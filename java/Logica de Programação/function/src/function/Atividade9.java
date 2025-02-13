package function;

import java.util.Scanner;

class dados{
	
	
	float media(float[] nota) {
		float media=0;
		float soma=0;
		
		for(int i=0;i<nota.length;i++) {
			soma+=nota[i];
			media =soma/3;
		}
		
		
		return media;
	}
	
}

public class Atividade9 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
		
		float nota[]=new float[3];
		
		for(int i=0;i<nota.length;i++) {
			
			System.out.println("Digite a "+(i+1)+" nota");
			nota[i]=teclado.nextFloat();
		}
		
		
		dados user = new dados();
		
		
		System.out.printf("A media e : %.1f",user.media(nota));
		
		
		
		teclado.close();
	}
}
