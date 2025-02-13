package aval;

import java.util.Scanner;



class produtodados{
	
	String nome ;
	float preco;
	int quantidade;
	
	public produtodados (String nome,float preco,int quantidade) {
		this.nome=nome;
		this.preco=preco;
		this.quantidade=quantidade;
		
		
	}
	
	public float Calcularvalortotal(){
		return this.preco*this.quantidade;
	}
	
	public void realizacomprar(int quantidadeComprada) {
		
		if(quantidadeComprada <=this.quantidade) {
			this.quantidade-=quantidadeComprada;
			System.out.println("Quantidade comprada com sucesso");
		}else {
			System.out.println("Não possuimos essa quantidade no estoque ");
		}
		
		
	}
	
}



public class Question3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int escolha=0;
		
		
		
		
		do {
			
			
			System.out.println("Menu de escolha");
			System.out.println("Digite 1 Adicionar Produto");
			System.out.println("Digite 2 para Realizar uma compra");
			System.out.println("Digite 3 para Consulta estoque");
			System.out.println("Digite 4 para sair");
			escolha=teclado.nextInt();
			
			teclado.nextLine();
			
			
			
			switch(escolha) {
			case 1:
				
				System.out.println("Digite o nome do produto");
				String nome =teclado.nextLine();
			
				System.out.println("Digite o preço do produto");
				float preco = teclado.nextFloat();
			
				System.out.println("Digite a quantidade comprada");
				int quantidade =teclado.nextInt();
				

				produtodados produto = new produtodados(nome,preco,quantidade);
				System.out.println("Produto adicionar com Sucesso");
				
				break;
			
			case 2:
				System.out.println("Digite a quantidade comprada");
				int quantidadeComprada =teclado.nextInt();
				
				
				
				
				
				break;
			 case 3:
                 // Consultar estoque
                 System.out.println("Produto: " + produto.nome);
                 System.out.println("Preço: R$ " + produto.preco);
                 System.out.println("Quantidade em estoque: " + produto.quantidade);
                 System.out.println("Valor total em estoque: R$ " + produto.Calcularvalortotal());
                 break;
	
			 case 4:
				 System.out.println("Saindo do Pograma");
				 break;
			
			}
			
			
			
			
			
			
			
			
		}while(escolha !=4);
		
		
		
		
		teclado.close();
	}
}
