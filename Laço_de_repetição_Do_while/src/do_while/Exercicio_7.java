package do_while;
import java.util.Scanner;
public class Exercicio_7 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		
		do {
			
			
			
			System.out.println("Digite o numero(Codigo)");
			numero = teclado.nextInt();
			
			
			
			
		}while(numero % 2 ==0);
		
		
		
		
		teclado.close();
	}
}
