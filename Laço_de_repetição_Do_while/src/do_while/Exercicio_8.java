package do_while;
import java.util.Scanner;
public class Exercicio_8 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int Adivinhar= 5;
		int numero=0;
		
		do {
			
			System.out.println("\nAdivinhe um numero: ");
			numero = teclado.nextInt();
			
			if(numero <5) {
				System.out.printf("\nO Numero e maior");
			}else {
				System.out.printf("\nO Numero e menor");
			}
			
			
		}while( numero != Adivinhar);
		
		
		
		
		
		
		
		
		teclado.close();
	}
}
