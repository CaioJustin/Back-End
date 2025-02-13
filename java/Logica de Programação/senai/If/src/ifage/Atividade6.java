package ifage;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		String loginS ="pataio";  
		String senhaS = "caJs3652";
		
		
		System.out.println("Digite o login");
		String login=teclado.next();
		
		
		System.out.println("Digite a senha");
		String senha = teclado.next();
		
		
		if(login.equalsIgnoreCase(loginS) && senha.equalsIgnoreCase(senhaS)) {
			System.out.println(" Bem Vindo !");
			
		}else {
			System.out.println(" Login ou senha Invalidos !");
		}
		
		
		
		teclado.close();
	}
}
