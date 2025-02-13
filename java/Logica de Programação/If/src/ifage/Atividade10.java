package ifage;

import java.util.Scanner;

public class Atividade10 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a quantidade de maça comprada");
		int qtd = teclado.nextInt();
		
		if(qtd >= 12) {
			
			float total = 1*qtd;
			System.out.println("Quantidade de maça comprada : "+qtd);
			System.out.println("O Preço total e : "+total);
		}else {
			
			float total = 1.30f*qtd;
			System.out.println("O Preço total e : "+total);
			
			
		}
		
		
		teclado.close();
	}
}
