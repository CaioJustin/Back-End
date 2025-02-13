package quest;

import java.util.Scanner;

public class Question6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o codigo do produto \n1-Camisa \n2-Relogios \n3-Calças ");
		int info = teclado.nextInt();
		
		
		if(info ==1) {
			System.out.println("Nome : Camisa do bem 10 \nPreço :10.60");
			System.out.println("Nome : Camisa do minecraft \nPreço :11.30");
			System.out.println("Nome : Camisa do lolja \nPreço :15.50");
		}else if(info ==2) {
			System.out.println("Nome : Relogios do minecraft \nPreço :11.30");
			System.out.println("Nome : Relogios do minecraft \nPreço :11.30");
			System.out.println("Nome : Relogios do lolja \nPreço :15.50");
		}else if(info ==3) {
			System.out.println("Nome : Calças do minecraft \nPreço :11.30");
			System.out.println("Nome : Calças do minecraft \nPreço :11.30");
			System.out.println("Nome : Calças do lolja \nPreço :15.50");
		}
		
		teclado.close();
	}
}
