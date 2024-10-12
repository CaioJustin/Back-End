package Switch;
import java.util.Scanner;
public class Exercicio_8 {

	public static void main(String[]args) {
			
			
	Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno ");
		String nome = teclado.nextLine();
		
		System.out.println("Digite a 1 nota do aluno ");
		float nota1 = teclado.nextFloat();
		
		System.out.println("Digite a 2 nota do  aluno ");
		float nota2 = teclado.nextFloat();
		
		
		char Classificao=' ';
		float soma ;
		float media ;
		
		soma=nota1+nota2;
		media =soma/2;
		
		if(media >=9 ) {
			Classificao='A';
		}else if (media >= 7.5 && media <9)	{
			Classificao='B';
		}else if (media>=6 && media <7.5){
			Classificao='C';
		}else if( media >=4 && media<6){
			Classificao='D';
		}else if (media <4) {
			Classificao='E';
		}
	
		System.out.println("nome do aluno : "+nome);
		System.out.println("1 nota : "+nota1);
		System.out.println("2 nota : "+nota2);
		System.out.printf("media :%.2f ",media);
		
		
		
		
		switch (Classificao) {
		case 'A': 
		case 'B':
		case 'C':
			System.out.println("O Conceito e :{ "+Classificao+"} O Aluno esta Aprovado");
			break;
		case 'D':
		case 'E':
			System.out.println("O Conceito e :{ "+Classificao+"} O Aluno esta Reprovado");
		default:
			System.out.println("Não foi possui calcular a media ");
		}
		
		
		
		
		
		
	teclado.close();
	}
	
}
