package quest;

import java.util.Scanner;

public class Question5 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escolha o idioma \n1 - Inglês, \n2 - Espanhol, \n3 - Francês");
		int idioma=teclado.nextInt();
		
		if(idioma ==1) {
			System.out.println("Welcome");
		}else if(idioma == 2) {
			System.out.println("bienvenido");
		}else if(idioma == 3) {
			System.out.println("accueillir");
		}
		
			
		teclado.close();
	}

}
