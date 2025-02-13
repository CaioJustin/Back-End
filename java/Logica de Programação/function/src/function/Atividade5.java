package function;

import java.util.Scanner;

class number{
	
	
	void lol(int[] numero) {
		int par=0;
		int impar=0;
		
		for(int i=0;i<=numero.length;i++) {
			if(numero[i]%2==0) {
				par++;
			}else {
				impar++;
			}
			
		}
		
		System.out.println("A quantidade de numeros par e : "+par);
		System.out.println("A quantidade de numeros impar e : "+impar);
	}
	
}

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		int numero[] = new int[6];
		
		for(int i=0;i<numero.length;i++) {
			System.out.println("Digite o Numero "+(i+1));
			numero[i] = teclado.nextInt();
		}
		
		
		number num=new number();
		
		num.lol(numero);
		
		
		
		
		teclado.close();
	}
}
