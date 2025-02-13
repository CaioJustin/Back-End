package avaliação_de_apredizagemII;

import java.util.Scanner;

class livro_date{
	
	String nome;
	String autor;
	String categoria;
	float preco=0;
	
	float desconto() {
		
		float desct= preco*(float)0.10;
		
		return  preco-desct;
	}
	
}

public class Atividade2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		livro_date dados = new livro_date();
		
		
		System.out.println("Digite o nome do livro ");
		dados.nome=teclado.nextLine();
		
		System.out.println("Digite o nome do autor do  livro ");
		dados.autor=teclado.nextLine();
		
		System.out.println("Digite a categoria do livro ");
		dados.categoria=teclado.nextLine();
		
		System.out.println("Digite a categoria do preço ");
		dados.preco=teclado.nextFloat();
		
		
		System.out.println("Exibindo os dados ");
		System.out.println("Nome do livro  : "+dados.nome);
		System.out.println("Autor do livro : "+dados.autor);
		System.out.println("Categoria do livro : "+dados.categoria);
		System.out.println("Preço do livro : "+dados.preco);
		System.out.println("Preço com desconto");
		System.out.println("novo preço : "+dados.desconto());
		
		
		
		teclado.close();
	}
}
