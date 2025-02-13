package function;

import java.util.Scanner;

class calculator{
	
	
	void imprimir(int num1,int num2) {
		
		System.out.println("soma :"+(num1+num2));
		System.out.println("subtração :"+(num1-num2));
		System.out.println("multiplição :"+(num1*num2));
		
		if(num2 != 0) {
			System.out.println("divisão :"+(num1/num2));
		}else {
			System.out.println("Não e possivel dividir por zero");
		}
		
		
	}
	
	
}




public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
			System.out.println("Digite o primeiro numero");
			int num1=teclado.nextInt();
			
			System.out.println("Digite o Segundo numero");
			int num2=teclado.nextInt();
		
			calculator calc =new calculator();
			
			
			calc.imprimir(num1,num2);
			
			
			
			
			
			
		teclado.close();
	}
}
