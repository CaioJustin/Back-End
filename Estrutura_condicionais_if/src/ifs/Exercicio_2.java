package ifs;
import java.util.Scanner;

public class Exercicio_2 {

		public static void main(String[]args) {
			
			int valor=0;
			Scanner teclado= new Scanner(System.in);
			System.out.println("Digite um valor :");
			valor=teclado.nextInt();
			
			if(valor >10) {
				System.out.println("O Valor e maior que 10");
				
			}else if (valor ==10) {
				System.out.println("O  Valor e Igual a 10!");
			}else {
				System.out.println("O Valor e menor que 10!");
			}
			
			teclado.close();
		}
}
