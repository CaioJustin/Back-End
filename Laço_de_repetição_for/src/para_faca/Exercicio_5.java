package para_faca;
import java.util.Scanner;
public class Exercicio_5 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
	int soma=0;
		
		for(int i =0 ; i<5;i++) {
			System.out.printf("Digite  o %d numero",i+1);
			int numero =teclado.nextInt();
			soma+=numero;
		}
		
		System.out.println(soma);
		
		teclado.close();
	}
}
