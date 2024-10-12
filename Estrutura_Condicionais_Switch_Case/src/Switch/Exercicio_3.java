package Switch;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno");
		String  nome=teclado.nextLine();
		
		System.out.println("Digite a idade do aluno");
		int idade =teclado.nextInt();
		
		System.out.println("Digite a primeira nota do aluno");
		float nota1=teclado.nextFloat();
		
		System.out.println("Digite a Segunda nota do aluno");
		float nota2=teclado.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno");
		float nota3=teclado.nextFloat();
		
		float soma =(nota1+nota2+nota3);
		float media =soma/3;
		char letra;
		
		if(media >7) {
			letra='A';
		}else {
			letra='F';
		}
		
		
		System.out.println("O Nome do aluno : "+nome);
		System.out.println("A idade do aluno : "+idade);
		System.out.println("A Media da empresa : "+media);
		
		
		switch (letra) {
		case 'A':
			System.out.println("O Aluno esta aprovado");
			break;
		case 'B':
			System.out.println("O Aluno esta reprovado");
		default:
			System.out.println("Não foi possivel definir a nota do aluno");
			break;
		}
		
		teclado.close();
	}
}
