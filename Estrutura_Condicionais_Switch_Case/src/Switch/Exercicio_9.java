package Switch;
import java.util.Scanner;
public class Exercicio_9 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero ");
		int number1=teclado.nextInt();
		
		System.out.println("Digite o Segundo numero ");
		int number2=teclado.nextInt();
		
		System.out.println("Digite  +,-,*,/ para escolhe a operção matematica desejada  ");
		String escolhar = teclado.next();
		int resultado =0; 
		
		
		switch (escolhar) {
		case "+": 
			resultado= number1+number2;
			System.out.println("Voce escolheu soma o resultado e  : "+resultado);
		break;
		case "-": 
			resultado= number1-number2;
			System.out.println("Voce escolheu subtração o resultado e  : "+resultado);
		break;
		case "*": 
			resultado= number1*number2;
			System.out.println("Voce escolheu multiplicação o resultado e  : "+resultado);
		break;
		case "/": 
			resultado= number1/number2;
			System.out.println("Voce escolheu divisão o resultado e  : "+resultado);
		break;
		
		default:
			System.out.println("erro");
		}
		
		teclado.close();
	}
}
