package ifage;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o seu sexo H - pra homem e M -pra mulher");
		String sexo = teclado.next();
		
		System.out.println("Digite a altura ");
		float altura = teclado.nextFloat();
		 
		
		if(sexo.equalsIgnoreCase("h")){
		 float ideal = (72.7f*altura)-58;
		 System.out.printf("O peso ideal e :%.2f ",ideal);
			
		}else if (sexo.equalsIgnoreCase("m")) {
			
			float ideal = (62.1f*altura)-44.7f;
			System.out.printf("O peso ideal e :%.2f ",ideal);
		}
		
		
		teclado.close();
	}
}
