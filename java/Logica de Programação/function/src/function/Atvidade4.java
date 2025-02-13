package function;

import java.util.Scanner;


class descobrir{
	
	void parimpar(int numero){
		
		if(numero %2 ==0) {
			System.out.println("O Numero e par");
		}else {
			System.out.println("O Numero e impar");
		}
	}
	
}

public class Atvidade4 {

	public static void main(String[]arg) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite um numero ");
		int numero =teclado.nextInt();
		
		descobrir desc =new descobrir();
		
		desc.parimpar(numero);
		
		teclado.close();
	}
}
