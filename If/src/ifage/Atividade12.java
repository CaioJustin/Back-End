package ifage;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite o seu peso");
		float peso = teclado.nextFloat();
		
		System.out.println("Digite a sua altura ");
		float altura = teclado.nextFloat();
		
		float imc = peso/(altura*altura);
		
		
		
		System.out.printf("o imc e : %.2f",imc);
		
		if(imc  < 18.5) {
			System.out.println(" Abaixo do peso ");
		}else if (imc >=18.5 && imc <= 24.9) {
			System.out.println("Peso Ideal (Parabéns)");
		}else if ( imc >=25.0 && imc >=29.9) {
			System.out.println("Levemente acima do peso ");
		}else if(imc >=30.0 && imc >=34.9) {
			System.out.println("Obesidade Grau I");
		}else if (imc >=35.0 && imc >=39.9) {
			System.out.println("Obesidade Grau II(Severa)");
		}else if (imc >=40) {
			System.out.println("Obesidade Grau III (Mórbida)");
		}
		
		
		
		teclado.close();
	}
}
