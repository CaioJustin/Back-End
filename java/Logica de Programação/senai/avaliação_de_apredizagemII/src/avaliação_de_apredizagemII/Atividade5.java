package avaliação_de_apredizagemII;

import java.util.Scanner;


class lixo {
	
	 void limparTelaSimples() {
	    for (int i = 0; i < 50; i++) {
	        System.out.println();
	    }
	}
	
}

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		lixo lixo2 =new lixo();
		int number=0;
		int locl=0;
		
		do {
			
		
		System.out.println("Digite o seu nome ");
		String nome =teclado.nextLine();
		
		System.out.println("Digite a sua idade ");
		int idade = teclado.nextInt();
		
		teclado.nextLine();
		
		System.out.println("Digite o seu email ");
		String email = teclado.nextLine();
		
		System.out.println("Digite o seu telefone ");
		int telefone =teclado.nextInt();
		
		System.out.print("1-Mostra nome e idade \r\n"
				+ "2-Mostra nome e e-mail\r\n"
				+ "3-Mostra nome e telefone\r\n"
				+ "4-Mostra todas as informações\r\n"
				+ "0-Sair do programa\r\n"
				+ "");
		number=teclado.nextInt();
		
		
		switch(number) {
		case 1:
			System.out.println("nome : "+nome);
			System.out.println("idade : "+idade);
			
			break;
		case 2:
			System.out.println("Nome  : "+nome);
			System.out.println("Email : "+email);
			
			break;
		case 3:
			System.out.println("nome  : "+nome);
			System.out.println("telefone : "+telefone);
			
			break;
		case 4:
			System.out.println("nome  : "+nome);
			System.out.println("idade : "+idade);
			System.out.println("Email : "+email);
			System.out.println("telefone :"+telefone);
			
			break;
		default:
			System.out.println("Opção incorreta,Tente Novamente ");
			break;
		}
		
		
		
		
		System.out.print("Deseja sair do Programa :? digite 0 ");
		locl=teclado.nextInt();
		
		lixo2.limparTelaSimples();
		teclado.nextLine();
			
		}while(locl !=0);
		
		teclado.close();
	}
}
