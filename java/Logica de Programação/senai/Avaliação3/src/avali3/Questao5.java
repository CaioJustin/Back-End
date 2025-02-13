package avali3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Questao5 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
		int numero =0;
		
		
		List<String>nomes=new ArrayList<String>();
		List<Float> precos=new ArrayList<Float>();
		List<Integer>quantidades = new ArrayList<Integer>();
		int vendarealizads=0;
		
		do {
			
			System.out.println("Digite 1 para adicionar Vendas");
			System.out.println("Digite 2 para mostra todos os produto e encerra o programa");
			numero =teclado.nextInt();
			
			
			switch(numero) {
			case 1:
				System.out.println("Digite o nome do produto");
				String nome =teclado.next();
				nomes.add(nome);
				
				System.out.println("Digite a quantidade do produto");
				int quantidade=teclado.nextInt();
				quantidades.add(quantidade);
				
				System.out.println("digite o preço do produto");
				float preco =teclado.nextFloat();
				precos.add(preco);
				
				vendarealizads++;
				
				break;
			case 2:
				
				for(int i=0;i<nomes.size();i++) {
					
					System.out.println("\n");
					System.out.println("Nome do "+(i+1)+" Venda "+nomes.get(i));
					System.out.println("Preço da por unidade "+(i+1)+" Vendas : "+precos.get(i));
					System.out.println("Quantidade de  "+(i+1)+" Venda :"+quantidades.get(i));
					
				}
				
				break;
			}
			
			
			
		}while(numero !=2);
		
		
		
		teclado.close();
	}
}
