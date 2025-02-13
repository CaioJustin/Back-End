package While;

import java.util.Scanner;

public class Atividade3 {

		public static void main(String[]args) {
			
			
			Scanner teclado = new Scanner(System.in);
			
			float nota1 =0;
			float nota2 =0;
			float nota3 =0;
			
			
			do {
				
				
				
				System.out.println("de a primeira nota de um aluno ");
				nota1 =teclado.nextFloat();

				System.out.println("de a segunda nota de um aluno ");
				nota2 =teclado.nextFloat();
				
				System.out.println("de a Terceira nota de um aluno ");
				nota3 =teclado.nextFloat();
				
				
			}while((nota1 <=0 ||nota1>=10 ) || (nota2<=0 ||nota2>=10) || (nota3<=0 || nota3>=10));
			
			
			float soma=nota1+nota2+nota3;
			float media = soma/3;
			
			if(media >=7) {
				System.out.println("O Aluno esta aprovado");
			}else if( media >=5 && media <7) {
				System.out.println("O aluno esta de Recuperação");
			}else if(media <5) {
				System.out.println("O aluno esta reprovando");
			}
			
			
			
			
			teclado.close();
		}
}
