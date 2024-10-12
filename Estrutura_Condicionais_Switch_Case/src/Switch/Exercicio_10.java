package Switch;
import java.util.Scanner;

public class Exercicio_10 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("==================================");
		System.out.println("|Codigo |  Prato           |Valor|");
		System.out.println("|   1   |  picanha         |25,00|");
		System.out.println("|   2   |  lasanha         |20,00|");
		System.out.println("|   3   |  Strogonoff      |18,00|");
		System.out.println("|   4   |  Bife Acebolado  |15,00|");
		System.out.println("|   5   |  Pão com ovo     |5,00 |");
		System.out.println("==================================");
		
		System.out.println("Digite o codigo do prato desejado ");
		int codigo = teclado.nextInt();
		
		switch (codigo) {
		case 1:
			System.out.println("|   1   |  picanha         |25,00|");
			break;
		case 2:
			System.out.println("|   2   |  lasanha         |20,00|");
			break;
		case 3:
			System.out.println("|   3   |  Strogonoff      |18,00|");
			break;
		case 4:
			System.out.println("|   4   |  Bife Acebolado  |15,00|");
			break;
		case 5:
			System.out.println("|   5   |  Pão com ovo     |5,00 |");
			break;	
		default:
			System.out.println("Esse codigo não existe ");
			break;
		}
		
		teclado.close();
	}
}
