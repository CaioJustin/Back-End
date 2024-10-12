package do_while;
import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);

		int numero=0;
		int soma=0,media=0,i=0;
		do {
			
			System.out.println("Digite o "+(i+1)+" numero ");
			numero = teclado.nextInt();
			
			soma+=numero;
			i++;
			
		}while(numero >0);
		
		media =soma/i;
		
		System.out.println("A Media e : "+media);
		teclado.close();
	}
}
