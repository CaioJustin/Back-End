package While;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		float nota1=0;
		float nota2=0;
		
		do {
			
			System.out.println("Digite a primeira nota");
			nota1= teclado.nextFloat();
			
			System.out.println("Digite a Segunda nota");
			nota2= teclado.nextFloat();
			
			
		}while((nota1 <=0 || nota1>=10) || (nota2 <=0 || nota2>=10));
		
		
		float soma = nota1+nota2;
		float media = soma/2;
		
		
		System.out.println("A Media e : "+media);
		
		
		
		
		
		teclado.close();
	}
}
