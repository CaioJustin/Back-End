package quest;

import java.util.Scanner;

public class Question13 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o primeiro numero");
		int prim=teclado.nextInt();
		

		System.out.println("Digite o Segundo numero");
		int Segund=teclado.nextInt();
		
		
		if(prim >Segund){
			System.out.println("O maior numero e :  primeiro"+prim);
			System.out.println("O menor numero e : segundo"+Segund);
		}else if(prim <Segund){
			System.out.println("O maior numero e segundo: "+Segund);
			System.out.println("O menor numero e primeiro : "+prim);
			
		}
		
		teclado.close();
	}
}
