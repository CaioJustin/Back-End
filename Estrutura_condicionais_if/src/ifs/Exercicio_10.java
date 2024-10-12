package ifs;
import java.util.Scanner;

public class Exercicio_10 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite quantias maças voce gostaria de comprar");
		int qtd = teclado.nextInt();
		float preco=0;
		
		if(qtd  <12) {
			
			System.out.println("Quantidade de maças compradas :"+qtd);
			preco = qtd *1;
			System.out.println("Preço Total: "+preco);
		}else if (qtd >12) {
			System.out.println("Quantidade de maças compradas :"+qtd);
			preco = (float)(qtd *1.30);
			System.out.println("Preço Total: "+preco);
		}
		
		teclado.close();
	}
}
