package gerar;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class generatornumber  {

	public static void main(String[]args)throws InterruptedException {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("==== Bem Vindo ====");
		Thread.sleep(1000);
		System.out.println("Digite o intervalor dos numeros que voç deseja ");
		System.out.println("De:");
		int num1=teclado.nextInt();
		teclado.nextLine();
		System.out.println("A:");
		int num2=teclado.nextInt();
		
		
		teclado.nextLine();
		
		int numrsorteado =ThreadLocalRandom.current().nextInt(num1,num2+1);
		
		Thread.sleep(2000);
		System.out.println("Sorteando o numero");
		Thread.sleep(2000);
		System.out.println("O numero sorteado e : "+numrsorteado);
		
		
	}
}
