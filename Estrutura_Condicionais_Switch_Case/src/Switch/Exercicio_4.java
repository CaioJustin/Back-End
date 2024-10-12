package Switch;
import java.util.Scanner;
public class Exercicio_4 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		String login= "User1";
		String	senha= "2145";
		
		
		System.out.println("Digite o seu login ");
		String loginT = teclado.next();
		
		System.out.println("Digite a sua senha ");
		String senhaT = teclado.next();
		
		 switch (loginT) {
		 case "User1":
			if(senhaT.equals(senha)) {
				System.out.println("Bem Vindo");
			}else {
				System.out.println("Login ou senha errado !");
			}
			break;
		 default:
			 System.out.println("Error");
			 break;
		 }
		 
			
			 
			
		
		
		
		teclado.close();
	}
}
