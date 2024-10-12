package ifs;
import java.util.Scanner;
public class Exercicio_Extra_6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("|Codigo |    Prato      |Preço|");
		System.out.println("|   1   |picanha        |25,00|");
		System.out.println("|   2   |lasanha        |20,00|");
		System.out.println("|   3   |Strogronoff    |18,00|");
		System.out.println("|   4   |Bife Acebolado |15,00|");
		System.out.println("|   5   |Pão com Ovo    |5,00 |");
		
		
		System.out.println("Digite o codigo do prato desejado");
		int cod = teclado.nextInt();
		
		if (cod ==1) {
			System.out.println("|   1   |picanha        |25,00|");
		}else if (cod ==2) {
			System.out.println("|   2   |lasanha        |20,00|");	
		}else if (cod ==3) {
			System.out.println("|   3   |Strogronoff    |18,00|");
		}else if (cod ==4) {
			System.out.println("|   4   |Bife Acebolado |15,00|");
		}else  if (cod == 5){
			System.out.println("|   5   |Pão com Ovo    |5,00 |");
		}else {
			System.out.println("Esse codigo não existe!!");
		}
		
		teclado.close();
	}
}
