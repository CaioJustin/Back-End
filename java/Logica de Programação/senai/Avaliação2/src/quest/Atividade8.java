package quest;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero =teclado.nextInt();
		
		
		if(numero <0) {
			System.out.println("O numero ja e zero");
		}else {
			System.out.println("Inicianto a contagem Regressiva ");
			
			for(int i =numero ; i>=0;i--) {
			 System.out.println(i);
			
		}
		}
		
		teclado.close();
	}
}
