package quest;

import java.util.Scanner;

public class question1 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a temperatura ");
		int temperatura = teclado.nextInt();
		
		
		if(temperatura >=25) {
			System.out.println("O Clima e Ensolarado");
		}else if(temperatura <15) {
			System.out.println("O Clima e chuvoso");
		}else if(temperatura >=15 && temperatura <25) {
			System.out.println("O Clima e Nublado");
		}
		
		teclado.close();
	}
}
