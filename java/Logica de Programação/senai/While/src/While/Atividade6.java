package While;

import java.util.Scanner;

public class Atividade6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		int par=0;
		int impare=0;
		int soma=0;
		int somapar=0;
		int media=0;
		int mediapar=0;
		int i=0;
		
		
		do {
			
			System.out.println("Digite um numero ");
			numero = teclado.nextInt();
			
			if(numero >0) {
			
			soma+=numero;
			}
			
			
			if(numero %2==0) {
				par++;
				somapar+=numero;
				
			}else {
				impare++;
			}
		
			i++;
			
		}while(numero >0);
		
		media = soma/i;
		mediapar=somapar/par;
		
		System.out.println(" Quantidade de par : "+par+"\n Quantidade de impar : "+impare);
		System.out.println("Media dos numeros par : "+mediapar);
		System.out.println("A media dos numeros : "+media);
		
	
		
		teclado.close();
	}
}
