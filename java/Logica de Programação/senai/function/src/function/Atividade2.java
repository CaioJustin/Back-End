package function;

import java.util.Scanner;


class tabuada{
	

	void descobrir(int numero) {
		
		for(int i =0;i<=10;i++) {
			System.out.println(numero+"x"+i+"= "+numero*i);
		}
	}
	
}



public class Atividade2 {

	public static void main(String[]args) {
		
		tabuada lol = new tabuada();
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();
		
		
		lol.descobrir(numero);
		
		
		
		teclado.close();
	}
}
