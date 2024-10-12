package ifs;
import java.util.Scanner;

public class Exercicio_4 {

	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o Primeiro numero");
		int primeiro = teclado.nextInt();
		
		System.out.println("Digite o segundo numero");
		int segundo = teclado.nextInt();
		
		int soma = primeiro+segundo;
		float media= soma/2;
		int multi = primeiro*segundo;
		float divi = primeiro/segundo;
		
		
		System.out.println("A Soma :"+soma);
		System.out.println("A Media : "+media);
		System.out.println("A Multiplicação : "+multi);
		System.out.println("A Divisão : "+divi);
		
		if(primeiro > segundo) {
			System.out.println("O Maior valor e o Primeiro :"+primeiro);
			System.out.println("O Menor valor e o Segundo : "+segundo);
		}else {
			System.out.println("O Maior valor e o Segundo :"+segundo);
			System.out.println("O Menor valor e o Primeiro : "+primeiro);
		}
		
		
		teclado.close();
	}
}
