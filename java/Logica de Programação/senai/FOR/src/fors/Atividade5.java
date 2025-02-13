package fors;

import java.util.Scanner;

public class Atividade5 {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int par=0;
		int impares=0;
		
		
		for(int i =0;i <=4;i++) {
			System.out.println("Digite um numero : ");
			int numer =teclado.nextInt();
			
			if(numer %2 ==0) {
				par++;
				
			}else {
				impares++;
			}
			
			
		}
		
		
		System.out.println("A quantidade de numeros pares são : "+par);
		System.out.println("A quantidade de numeros impares são : "+impares);
		
		
		teclado.close();
	}
}
