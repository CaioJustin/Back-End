package array;

import java.util.Scanner;

public class Atividade11 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i=0;
		int numero[]=new int[5];
		
		int par=0;
		int impar=0;
		int pos=0;
		int neg=0;
		
		int intmaior = Integer.MIN_VALUE;
		int intmenor=Integer.MAX_VALUE;
		int somapar=0;
		int mediapar=0;
	
		for(i=0; i<numero.length;i++) {
			System.out.println("Digite o "+(i+1)+" Numero ");
			numero[i]=teclado.nextInt();
			
			//Quantidade de numeros pares e impares
			if(numero[i] % 2 ==0) {
				par++;
				somapar+=numero[i];
				
			}else {
				impar++;
			}
			
			
			//Quantidade de numeros positivos e negativos 
			
			if(numero[i] >0) {
				pos++;
			}else {
				neg++;
			}
			
			
			//Maior  menor numero
			if(numero[i] <intmenor) {
				intmenor=numero[i];
			}
			
			
			if(numero[i] >intmaior) {
				intmaior=numero[i];
			}
				
				
				
				
		}
		
		mediapar=somapar/par;
		System.out.println("Quantidade de numero pares :"+par);
		System.out.println("Quantidade de numero impares :"+impar);
		System.out.println("Quantidade de numero positivos :"+pos);
		System.out.println("Quantidade de numero negativos :"+neg);
		System.out.println("O Maior numero : "+intmaior);
		System.out.println("O Menor numero : "+intmenor);
		System.out.println("A Media dos numeros par e : "+mediapar);
		
		
		
		
		
		teclado.close();
	}
}
