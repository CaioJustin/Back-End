package struct;

import java.util.Scanner;


class Pessoa{
	
	String nome;
	int idade;
	float peso;
	float altura;
	
	
}






public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Pessoa local = new Pessoa();
		
		System.out.println("Digite o nome do aluno");
		local.nome = teclado.next();
		
		System.out.println("Digite o idade do aluno");
		local.idade = teclado.nextInt();
		
		System.out.println("Digite o peso do aluno");
		local.peso= teclado.nextFloat();
		
		System.out.println("Digite o altura do aluno");
		local.altura =teclado.nextFloat();
		
		
		System.out.println("Nome :"+local.nome);
		System.out.println("idade :"+local.idade);
		System.out.println("peso :"+local.peso);
		System.out.println("altura :"+local.altura);
		
		
		
		teclado.close();
	}
	
	
	
	
	
}
