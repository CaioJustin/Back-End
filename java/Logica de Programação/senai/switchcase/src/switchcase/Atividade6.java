package switchcase;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o seu sexo \n H Para Homens e \n M para Mulher");
		String  sexo = teclado.next();
		
		System.out.println("Digite a sua altura ");
		float altura = teclado.nextFloat();
		
		String alt =sexo.toUpperCase();
		
		
		float pesoaIdeal=0;
		
		switch(alt) {
		case "H":
			pesoaIdeal = (float)(72.7 * altura)-58;
			break;
		case "M":
			pesoaIdeal= (float)(62.1*altura)-44.7f;
		
		}
		
		System.out.printf("O Peso ideal e %.2f ",pesoaIdeal);
		
		teclado.close();
	}
}
