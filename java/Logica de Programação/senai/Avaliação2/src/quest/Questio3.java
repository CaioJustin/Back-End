package quest;

import java.util.Scanner;

public class Questio3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite a nota do aluno");
		float nota=teclado.nextFloat();
		
		if(nota >=9) {
			System.out.println("Excelente");
		}else if(nota >=7 ) {
			System.out.println("Bom");
		}else if(nota >=5) {
			System.out.println("Razoável");
		}else {
			System.err.println("Insuficiente");
		}
		
		teclado.close();
	}
}
