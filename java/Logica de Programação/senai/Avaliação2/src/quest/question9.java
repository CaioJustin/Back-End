package quest;

import java.util.Scanner;

public class question9 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero =teclado.nextInt();
		
		boolean erprimo =true;

		
		if(numero <=1) {
			System.out.println("O Numero"+numero+"não e primo ");
		}else {
			for(int i =2;i<=Math.sqrt(numero);i++) {
				
				if(numero % i==0) {
					erprimo=false;
					break;
				}
			}
		}
		
		
		if (erprimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
		
		teclado.close();
	}
}
