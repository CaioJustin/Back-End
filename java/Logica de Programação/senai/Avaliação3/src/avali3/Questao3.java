package avali3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int number=0;
		
		List<String> nomes =new  ArrayList<String>();
		List<Integer> contatos=new ArrayList<Integer>();
		
		do {
			
			
			
			
			System.out.println("Digite 1 para adacionar um novo contato ");
			System.out.println("Digite 2 para mostra todos os Contato e encerre o programa");
			number = teclado.nextInt();
			
			switch(number
					) {
			case 1:
				
				System.out.println("Digite o nome do contato");
				String nome =teclado.next();
				nomes.add(nome);
				
				
				System.out.println("Digite o numero do contato");
				int contato =teclado.nextInt();
				contatos.add(contato);
				
				
				break;
			case 2:
				
				for(int i =0;i<nomes.size();i++) {
					
					System.out.println((i+1)+" Nome : "+nomes.get(i));
					System.out.println((i+1)+" Contato : "+contatos.get(i));
					System.out.println("\n");
				}
				
				
				break;
			
			}
			
			
			
			
			
			System.out.println("\n");
			
		}while(number !=2);
		
		
		teclado.close();
	}
}
