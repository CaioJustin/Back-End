package function;

import java.util.Scanner;

class calculadora{
	
	
	
	
	
	int calcmedia(int num1,int num2) {
		int soma=num1+num2;
		int media=soma/2;
		return media;
	}
	
	
}


public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		calculadora calc = new calculadora();
		
		int num1=10;
		int num2=20;
		
	
		System.out.println("A media e : "+calc.calcmedia(num1, num2));
		
		teclado.close();
	}
}
