package fors;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um numero e decubra atabuada");
		int tabuada = teclado.nextInt();
		
		for(int i =0; i<=10;i++) {
			
			System.out.println(tabuada+"X"+(i)+"="+(tabuada*i));
			
			
		}
		
		
		
		
		
		
		
		teclado.close();
	}
}
