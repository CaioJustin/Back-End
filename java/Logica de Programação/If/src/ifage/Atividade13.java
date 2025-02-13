package ifage;

import java.util.Scanner;

public class Atividade13 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o numero ");
		int numero = teclado.nextInt();
		
		
		if(numero % 2 ==0) {
			System.out.println(("O Numero e par"));
		}else {
			System.out.println("O numero e impar");
		}
		
		
		teclado.close();
	}
}
