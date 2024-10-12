package do_while;
import java.util.Scanner;
public class Exercicio_1 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		float nota;
		
		do {
			
			System.out.println("Digite a nota do aluno ");
			nota= teclado.nextFloat();
			
			
			
		}while(nota < 0 || nota >10);
		
		
		System.out.println("A Nota do aluno e : "+nota);
		
		
		teclado.close();
	}
}
