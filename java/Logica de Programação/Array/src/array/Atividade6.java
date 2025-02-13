package array;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero[]=new int[6];
		int i =0;
		int par=0;
		int impar=0;
		
		for(i=0;i<numero.length;i++) {
			
				System.out.println("Digite quantos numero são pares");
				numero[i]=teclado.nextInt();
			
				if(numero[i]% 2 ==0) {
					par++;
				}else {
					impar++;
				}
				
				
		}
		
		
		for(i=0;i<numero.length;i++) {
			
			System.out.println("Os numeros informados são : "+numero[i]);
			
		}
		
		System.out.println("A quantidade de pares "+par);
		System.out.println("A quantidade de impares "+impar);
		
		
		teclado.close();
	}
}
