package do_while;
import java.util.Scanner;
public class Exercicio_3 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		float nota1,nota2,soma,media;
		
		do {
			
			System.out.println("Digite a primeira media");
			nota1=teclado.nextFloat();
			
			System.out.println("Digite a Segunda media");
			nota2=teclado.nextFloat();
			
			soma = nota1+nota2;
			
			media = soma/2;
			
			
		}while(media <0 || media >10);
		
		
		if(media >=7) {
			System.out.println("Aprovado");
		}else if (media >= 5 &&  media < 6.9) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Reprovado");
		}
		
		
		
	teclado.close();	
	}

}
