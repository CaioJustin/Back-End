package ifage;

import java.util.Scanner;

public class Atividade9 {
	
	public static void main (String[]args){
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o numero do empregado "); 
		String codigo = teclado.next();
		
		System.out.println("Digite o seu ano de nascimento ");
		int nascimento = teclado.nextInt();
		
		System.out.println("Digite o seu tempo de trabalho em anos ");
		int tt = teclado.nextInt();
		
		
		
		int anoatual =2025; 
		int idade = anoatual -nascimento;
		
		
		if(idade >=65 ||  tt >=30) {
			System.out.println("Requerer aposentadoria ");
		}else {
			System.out.println("Não requerer aposentadoria ");
		}
		
		
		
		teclado.close();
	}
}
