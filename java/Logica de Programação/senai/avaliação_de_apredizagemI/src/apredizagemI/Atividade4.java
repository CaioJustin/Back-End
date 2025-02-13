package apredizagemI;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a sua idade");
		int idade=teclado.nextInt();
		
		if(idade <18 || idade >=65) {
			System.out.println("Não e obrigado a votar");
		}else {
			System.out.println("E obrigado a votar");
		}
		
		
		
		teclado.close();
	}
}
