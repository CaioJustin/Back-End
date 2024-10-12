package ifs;
import java.util.Scanner;
public class Exercicio_8 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero ");
		int num1 = teclado.nextInt();
		
		System.out.println("Digite o segundo numero ");
		int num2= teclado.nextInt();
		
		System.out.println("Digite o terceiro numero");
		int num3 = teclado.nextInt();
		
		
		System.out.println("OS 3 numeros Informados "+"\n"+"Primeiro : "+num1+"\n"+"Segundo : "+num2+"\n"+"Terceiro : "+num3);
		
		//Maior
		if(num1 > num2 && num1 > num3) {
			System.out.println("O Maior numero   e : "+num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("O Maior numero e : "+num2);
		}else if (num3 > num1 && num3> num2) {
			System.out.println("O Maior numero e: "+num3);
		}
		
		//menor
		
		if(num1 < num2 && num1 < num3) {
			System.out.println("O Menor numero   e : "+num1);
		}else if (num2 < num1 && num2 < num3) {
			System.out.println("O menor numero e : "+num2);
		}else if (num3 < num1 && num3< num2) {
			System.out.println("O menor numero e: "+num3);
		}
		
		teclado.close();
	}
}
