package ifs;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero ");
		int num1=teclado.nextInt();
		
		System.out.println("Digite o Segundo numero");
		int num2=teclado.nextInt();
		
		
		int soma =num1+num2; 
		int media = soma/2;
		int multi = num1*num2;
		float div = num1/num2;
		
		System.out.println("Soma : "+soma);
		System.out.println("media : "+media);
		System.out.println("multi : "+multi);
		System.out.println("div : "+div);
		
		
		if(num1 > num2) {
			System.out.println(" O Maior numero: "+num1);
			System.out.println("O Menor numero : "+num2);
		}else if (num1<num2) {
			System.out.println(" O Maior numero: "+num2);
			System.out.println("O Menor numero : "+num1);
		}else {
			System.out.println("Os Numeros são Iguais");
		}
		
		teclado.close();
	}
}
