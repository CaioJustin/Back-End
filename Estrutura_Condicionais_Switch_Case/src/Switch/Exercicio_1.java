package Switch;
import java.util.Scanner;
public class Exercicio_1 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();
		
		
		switch (numero) {
		case 0,1,2,3,4,5,6,7,8,9: {
			System.out.println("NÃO E MAIOR QUE 10!");
			break;
		}
		default:
			System.out.println("E maior que 10!");
			break;
		}
		
		
		teclado.close();
	}
}
