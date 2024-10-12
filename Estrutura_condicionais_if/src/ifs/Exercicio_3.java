package ifs;
import java.util.Scanner;

public class Exercicio_3 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome;
		int idade;
		float nota1,nota2,nota3;
		
		System.out.println("Digite o nome do aluno");
		nome =teclado.next();
		
		System.out.println("Digite a idade do aluno ");
		idade = teclado.nextInt();
		
		System.out.println("Digite a primeira nota do aluno");
		nota1=teclado.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno");
		nota2=teclado.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno");
		nota3=teclado.nextFloat();
		
		float soma= nota1+nota2+nota3;
		float media = soma/3;
				
		System.out.println("====Informações do aluno====");
		System.out.println(" nome do aluno  : "+nome);
		System.out.println("idade : "+idade);
		System.out.println("media : "+media );
		
		
		
		if(media < 7) {
			System.out.println("Situação :O Aluno esta Reprovado");
		}else {
			System.out.println("Situação :O Aluno está Aprovado");
		}
		
		
		teclado.close();
	}
}
