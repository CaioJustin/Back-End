package ifs;
import java.util.Scanner;
public class Exercicio_Extra_4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		String conceito;
		
		System.out.println("Digite o nome do aluno ");
		String nome = teclado.next();
	
		System.out.println("Digite a primeira nota ");
		float nota= teclado.nextFloat();
		
		System.out.println("Digite a segunda nota");
		float nota2=teclado.nextFloat();
		
		float soma = nota+nota2;
		float media = soma/2;
		
		
		if(media >=9) {
			conceito="A";
		}else if(media>= 7.5 && media <9) {
			conceito ="B";
		}else if (media >= 6 && media <7.5) {
			conceito="C";
		}else if (media >= 4 && media <6) {
			conceito="D";
		}else {
			conceito="E";
		}
		
		
		System.out.println("Nome do aluno :"+nome);
		System.out.println("Media: "+media);
		System.out.println("Conceito : "+conceito);
		
		
		teclado.close();
	}
}
