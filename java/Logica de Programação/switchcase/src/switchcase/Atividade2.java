package switchcase;

import java.util.Scanner;

public class Atividade2 {

		public static void main(String[]args) {
			
			Scanner teclado = new Scanner(System.in);
			
			System.out.println("==============Menu================");
			System.out.println("Código  |Prato            |Valor  ");
			System.out.println("  1     | Picanha         |25,00");
			System.out.println("  2     | Lasanha         |20,00");
			System.out.println("  3     | Strogonoff      |18,00");
			System.out.println("  4     | Bife Acebolado  |15,00");
			System.out.println("  5     | Pão com ovo     |5,00");
			int Escolha = teclado.nextInt();
			
			
			switch(Escolha) {
			case 1:
				System.out.println("O Nome do prato e : Picanha\n o preço e :25,00");
				break;
			case 2 :
				System.out.println("O Nome do prato e : Lasanha\n o preço e :20,00");
				break;
			case 3 :
				System.out.println("O Nome do prato e : Strogonoff\n o preço e :18,00");
				break;
			case 4 :
				System.out.println("O Nome do prato e : Bife Acebolado\n o preço e :15,00");
				break;
			case 5:
				System.out.println("O Nome do prato e : Pão com ovo\n o preço e :5,00");
				break;
				
				
			}
			
			
			
			teclado.close();
			
		}
	
}
