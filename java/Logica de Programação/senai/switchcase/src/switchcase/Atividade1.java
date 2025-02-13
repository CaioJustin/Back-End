package switchcase;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero");
		int numero1 = teclado.nextInt();
		
		
		System.out.println("Digite o segundo numero");
		int numero2 = teclado.nextInt();
		
		
		System.out.println("Digite a opreção Escolhida");
		System.out.println("+ Para Mais       ");
		System.out.println("- para menos      ");
		System.out.println("* para multiplicar");
		System.out.println("/ para Dividir    ");
		String escolhar = teclado.next();
		
		int resultado=0;
	
		
		switch(escolhar){
			case  "+":
				resultado = numero1+numero2;
				break;
			case "-":
				resultado = numero1-numero2;
				break;
			case "*":
				resultado = numero1 * numero2;
				break;
			case "/":
				resultado = numero1/numero2;
				break;
			default :
				System.out.println("Erro essa opção não existe");
				break;
		}
		
		
		
		System.out.println("O primeiro numero e : "+numero1);
		System.out.println("O segundo numero e :  "+numero2);
		System.out.println("o resultado e : "+resultado);
		
		
		teclado.close();
	}
}
