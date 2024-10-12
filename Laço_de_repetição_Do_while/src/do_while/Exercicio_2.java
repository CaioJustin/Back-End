package do_while;
import java.util.Scanner;
public class Exercicio_2 {

	public static void main(String[]args) {
		
		Scanner Teclado = new Scanner(System.in);
	
		
		
		float nota1,nota2;
		float media=0;
		
		do {
			
				System.out.println("Digite a "+"1 "+"nota");
				nota1= Teclado.nextFloat();
				
				System.out.println("Digite a "+"2 "+"nota");
				nota2= Teclado.nextFloat();
			
				float   soma = nota1+nota2;
				media = soma/2;
				
		}while(media <0 || media >10);
		
		System.out.println("A Media do aluno e: "+media);
		
		
		Teclado.close();
	}
	
}
