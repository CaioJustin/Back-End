package ifs;
import java.util.Scanner;

public class Exercicio_6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String login = "tentativa.laife@gmail.com";
		int senha = 3221;
		
		System.out.println("Digite o Login");
		String loginT=teclado.next();
		
		System.out.println("Digite a senha");
		int senhaT=teclado.nextInt();
		
		if(loginT.equals(login) && senhaT == senha) {
			System.out.println("BEM-VINDO");
		}else {
			System.out.println("Login ou senha Invalidos!");
		}
		
		
		teclado.close();
	}
}
