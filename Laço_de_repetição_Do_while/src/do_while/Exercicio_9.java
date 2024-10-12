package do_while;
import java.util.Scanner;
public class Exercicio_9 {
	
	public static void main(String[]args) {
		
		Scanner teclado= new Scanner(System.in);
		
		String Email = "sakai.laife@locol.com";
		String Senha = "3333xxx";
		String email = "";
		String senha = "";
		
		
		do {
			
			System.out.println("Digite o email ");
			email=teclado.next();
			
			System.out.println("Digite a senha  ");
			senha=teclado.next();
			
		}while(email.equalsIgnoreCase(Email) != senha.equalsIgnoreCase(Senha));
		
		System.out.println("Login realizado com sucesso!!");
		
		
		teclado.close();
	}
}
