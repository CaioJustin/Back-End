package quest;

import java.util.Scanner;

public class question11 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int cod=0;
		int codigo=132;
		
		do {
			
			System.out.println("Digite o codigo ");
			 cod=teclado.nextInt();
			
		}while(cod !=codigo);
		
		System.out.println("Acesso permitido ");
		
		teclado.close();
	}
}
