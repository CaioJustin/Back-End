package avaliação1;

import java.util.Scanner;

public class Questão6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a primeira nota do aluno ");
		float nt1=teclado.nextFloat();
		
		System.out.println("Digite a Segunda nota do aluno ");
		float nt2=teclado.nextFloat();
		
		float media =(nt1+nt2)/2;
		
		
		if(media >=6) {
			System.out.println("Parabens o aluno esta aprovado");
		}else if(media >=4) {
			System.out.println("Recuperação");
		}else if (media <4) {
			System.out.println("Reprovado");
		}
		
		
		teclado.close();
	}
}
