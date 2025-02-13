package quest;

import java.util.Scanner;;

public class Qustaio7 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("===Craft=== \n1-Novo Jogo \n2-Carregar jogo \n3-Configuraçoes ");
		int option = teclado.nextInt();
		
		String newa="";
		
		switch(option) {
		case 1:
			
			System.out.println("Digite o nome do loading");
			newa =teclado.next();
			
			System.out.println("Novo jogo crado");
			break;
		case 2:
			System.out.println(" Carregue o loading ");
			System.out.println(" Nome   |  Vidas  | Fase");
			System.out.println("Lucas   |  03     |  04 ");
			break;
		case 3:
			System.out.println("==== Configurações ====");
			System.out.println("Configuraçoes de Tela");
			System.out.println("Configuraçoes de Audio ");
			System.out.println("Sensibilidade");
			System.out.println("Controle");
			
			break;
		}
		
		
		
		teclado.close();
		
	}
	
}
