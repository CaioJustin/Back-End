package struct;

import java.util.Scanner;


class lol {
	
	String nome;
	int idade;
	String endereco;
	
	
	
}


public class Atividade2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		lol pessoa=new lol();
		
		System.out.println("Digite o seu nome ");
		pessoa.nome=teclado.nextLine();
		
		System.out.println("Digite a sua idade");
		pessoa.idade=teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Digite o seu endereço");
		pessoa.endereco=teclado.nextLine();
		
		
		
		System.out.println("nome : "+pessoa.nome);
		System.out.println("idade : "+pessoa.idade);
		System.out.println("endereço : "+pessoa.endereco);
		
		
		
		teclado.close();
	}
}
