package switchcase;

import java.util.Scanner;

public class Atividade3 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um numero e descurbra o dia ");
		int Escolha = teclado.nextInt();
		
		switch(Escolha){
		case 1:
			System.out.println("O DIA 1 E DOMINGO FINAL DE SEMANA");
			break;
		case 2 : 
			System.out.println("O DIA 2 E SEGUNDA-FEIRA DIA UTIL");
			break;
		case 3 :
			System.out.println("O DIA 1 E TERÇA-FEIRA DIA UTIL");
			break;
		case 4 :
			System.out.println("O DIA 1 E QUARTA-FEIRA DIA UTIL");
			break;
		case 5 :
			System.out.println("O DIA 1 E QUINTA-FEIRA DIA UTIL");
			break;
		case 6 :
			System.out.println("O DIA 1 E SEXTA-FEIRA DIA UTIL");
			break;
		case 7 :
			System.out.println("O DIA 1 E SÁBADO FINAL DE SEMANA ");
			break;
		default :
			System.out.println("DIA INVALIDO");
			break;
		}
		
		
		teclado.close();
	}
}
