package struct;

import java.util.Scanner;

class livro{
	
	String nome;
	String autor;
	String categoria;
	float preco;
}


public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		livro[] Livro=new livro[3];
		
		
		
		for(int i =0;i<Livro.length;i++) {
			
			Livro[i]=new livro();
			
			System.out.println("Digite os dados do livro " + (i + 1) + ":");
			
			System.out.println("Digite o nome do livro");
			Livro[i].nome=teclado.nextLine();
			
			
			System.out.println("Digite o nome do Autor");
			Livro[i].autor=teclado.nextLine();
					
			System.out.println("Digite a categoria do livro");
			Livro[i].categoria=teclado.nextLine();
			
			System.out.println("Digite o preço do livro");
			Livro[i].preco=teclado.nextFloat();
			
			teclado.nextLine();

					
		}
		
		
		
		for(int i =0;i<Livro.length;i++) {
			
			System.out.println("\n============= "+(i+1)+" Livro =============");
			System.out.println("Nome do Livro: "+Livro[i].nome);
			System.out.println("Nome do Autpr: "+Livro[i].autor);
			System.out.println("Nome do Categoria: "+Livro[i].categoria);
			System.out.println("Nome do preço: "+Livro[i].preco);
			
		}
		
		
		
		teclado.close();
	}

}
