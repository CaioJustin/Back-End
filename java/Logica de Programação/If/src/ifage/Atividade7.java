package ifage;

import java.util.Scanner;

public class Atividade7 {

		public static void main (String[]args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("Digite  o seu ano de nascimento ");
			int ano = teclado.nextInt();
			
			
			int idade = 2025-ano;
			
			if(idade <18 || idade >65) {
				
				System.out.println("Não e obrigado a votar ");
			}else {
				System.out.println("E obrigado a votar");
			}
			
			teclado.close();
		}
}
