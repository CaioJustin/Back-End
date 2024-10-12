package ifs;
import java.util.Scanner;
public class Exercicio_Extra_5 {
	
	public static void main(String[]args) {
		
		
		
		Scanner teclado = new Scanner(System.in);
		
		float resultado =0;
		
		System.out.println("Digite o primeiro numero");
		float num1=teclado.nextFloat();
		
		System.out.println("Digite o segundo numero");
		float num2=teclado.nextFloat();
		
		System.out.println("Digite a escolha");
		String escolha=teclado.next();
		
		if (escolha.equals("+") ) {
			resultado = num1+num2;
		}if (escolha.equals("-") ) {
			resultado = num1-num2;
		}if (escolha.equals("*") ) {
			resultado = num1*num2;
		}if (escolha.equals("/") ) {
			resultado = num1/num2;
		}
		
		System.out.println("O Resultado e : "+resultado);
		
		teclado.close();
	}
}
