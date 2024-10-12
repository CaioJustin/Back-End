package ifs;
import java.util.Scanner;

public class Exercicio_Extra_1 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua altura");
		float altura = teclado.nextFloat();
		
		System.out.println("Digite o seu sexo F = feminino ou M = masculin");
		String sexo = teclado.next();
		float ideal=0;
		
	
		
		if(sexo.equalsIgnoreCase("F")){
			
			ideal = (float)((62.1*altura)-44.7);
			System.out.println("Peso ideal e : "+ideal);
		}else if(sexo.equalsIgnoreCase("M")) {
			ideal =(float)(72.7 * altura)-58;
			System.out.printf("Peso ideal e %.2f: ",ideal );
		}
		
		
		teclado.close();
	}
}
