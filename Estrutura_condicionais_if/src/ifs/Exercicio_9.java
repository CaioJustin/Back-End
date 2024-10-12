package ifs;
import java.util.Scanner;
public class Exercicio_9 {
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o codigo funcionario");
		float cod =teclado.nextFloat();// cod = codigo do funcionario
		
		System.out.println("Digite o ano de nascimento ");
		int nasc = teclado.nextInt();// nasc= ano de nascimento
		
		System.out.println("Digite quanto tempo de trabalho ");
		int TT = teclado.nextInt(); //tt = tempo de trabalho
		
		int AtualYear=2024;
		int idade = AtualYear-nasc;
		
		
		
		System.out.println("Codigo do Funcionario : "+cod);
		System.out.println("Idade "+idade);
		System.out.println(TT+" Anos de trabalho ");
		
		
		
		
		if(idade >= 65 || TT >=30) {
			System.out.println("Requerer Aposentadoria");
		}else {
			System.out.println("Não Requerer Aposentadoria ");
		}
		
		
		teclado.close();
	}
}		
