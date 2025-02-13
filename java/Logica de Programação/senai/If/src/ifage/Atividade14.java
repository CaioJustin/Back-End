package ifage;

import java.util.Scanner;

public class Atividade14 {

	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do aluno");
		String nome= teclado.next();
		
		System.out.println("Digite a primeira nota do aluno ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a Segunda nota do aluno ");
		float nota2 = teclado.nextFloat();
		
		
		String Conceito="";
		float soma =nota1+nota2;
		float media =soma/2;
		
	
		if(media  >=9) {
			Conceito="A";
		}else if ( media >= 7.5 && media <9) {
			Conceito="B";
		}else if (media >=6 && media <7.5) {
			Conceito="C";
		}else if ( media >=4 && media <6) {
			Conceito="D";
		}else if (media <4) {
			Conceito="E";
		}
		
		System.out.println("Conceito e : "+Conceito);
		
		teclado.close();
	}
}
