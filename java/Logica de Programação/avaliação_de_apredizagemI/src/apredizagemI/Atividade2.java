package apredizagemI;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o seu nome");
		String nome=teclado.next();
		
		System.out.println("Digite o seu sexo");
		String sexo = teclado.next();
		
		System.out.println("Digite o seu ano de nascimento");
		int ano_nasc=teclado.nextInt();
		
		
		int anoatual=2025;
		
		int idade = anoatual-ano_nasc;
		
		if(idade >=18) {
			System.out.println("O nome  :"+nome);
			System.out.println("a idade :"+idade);
			System.out.println("O Sexo : "+sexo);
			System.out.println("Ano de nascimento "+ano_nasc);
		}else {
			System.out.println("Não é possível realizar o cadastro, o (a) candidato (a) deve ter 18 anos ou mais.");
		}
		
		teclado.close();
	}
}
