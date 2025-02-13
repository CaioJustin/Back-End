package ifage;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite o primeiro numero ");
		int numero1 = teclado.nextInt();

		System.out.println("Digite o segundo numero");
		int numero2 = teclado.nextInt();
		
		
		int soma = numero1+numero2;
		int media = soma/2;
		int mult = numero1*numero2;
		
		
		System.out.println("A Soma e : "+soma);
		System.out.println("A Media e : "+media);
		System.out.println("A multiplicação e : "+mult);
		
		
		
		if (numero1 > numero2) {
			System.out.println("\nO Maior numero e :"+numero1);
		}else if (numero2 > numero1) {
			System.out.println("\nO Maior numero e :"+numero2);
		}else if (numero1 ==numero2){
			System.out.println("\nOs numero são Iguais");
		}
		
		
		
		teclado.close();
	}
}
