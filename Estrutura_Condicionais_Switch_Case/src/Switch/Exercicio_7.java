package Switch;
import java.util.Scanner;
public class Exercicio_7 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua altura ");
		float altura = teclado.nextFloat();
		
		System.out.println("Digite o seu sexo M pra mulher e H pra homem");
		char sexo =teclado.next().charAt(0);
		
		sexo=Character.toUpperCase(sexo);
		float pesoIdeal=0;

		switch (sexo) {
		case 'M':
		pesoIdeal =(float)((62.1*altura)-44.7);
		System.out.println("Esse e o pesoIdeal : "+pesoIdeal);
		break;
		case'H':
		pesoIdeal=(float)(72.7*altura)-58;
		System.out.println("Esse e o pesoIdeal : "+pesoIdeal);
		default:
			break;
		}
		
		
		
		teclado.close();
	}
}
