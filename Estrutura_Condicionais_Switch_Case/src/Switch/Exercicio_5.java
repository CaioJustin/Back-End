package Switch;
import java.util.Scanner;


public class Exercicio_5 {

	public static void main (String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o seu ano de nascimento  ");
		int nasc = teclado.nextInt();
		
		int idade = 2024-nasc;
		
		String tarefa="";
		
		if(idade  >= 18 && idade <65) {
			tarefa= "OBGV";
		}
		
		switch (tarefa) {
		case "OBGV":
			System.out.println("E obrigado a votar");
			break;
		
		default:
			System.out.println("Não e obrigado a votar ");
			break;
		}

		
		
		teclado.close();
	}
}
