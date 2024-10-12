package ifs;
import java.util.Scanner;
public class Exercicio_7 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade");
		int idade = teclado.nextInt();
		
		if(idade < 18 || idade > 65 ) {
			System.out.println("não e Obrigado a votar ");
		}else {
			System.out.println("E obrgidada a votar ");
		}
		
		teclado.close();
	}
}
