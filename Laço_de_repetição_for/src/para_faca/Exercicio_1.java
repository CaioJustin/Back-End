package para_faca;
import java.util.Scanner;
public class Exercicio_1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = teclado.nextInt();
		
		
		for(int i=0; i <=10;i++) {
			System.out.println(numero+"X"+i+"= "+numero*i);
		}
		
		teclado.close();
	}
}
