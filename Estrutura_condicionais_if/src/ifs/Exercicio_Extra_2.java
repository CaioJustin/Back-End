package ifs;
import java.util.Scanner;
public class Exercicio_Extra_2 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("|=================================================|");
		System.out.println("|IMC              |CLASSIFICAÇÃO                  | ");
		System.out.println("|abaixo de 18,5   |Abaixo do peso                 |");
		System.out.println("|Entre 18,6 e 24,9|Peso ideal (parabens)          |");
		System.out.println("|entre 25,0 e 29,9|Levemente acima do peso        |");
		System.out.println("|entre 30,0 e 34,9|Obedidade Grau I               |");
		System.out.println("|entre 35,0 e 39,9|Obesidade Grau II(severa)      |");
		System.out.println("|acima de 40      |Obesidade Grau III(morbida)    |");
		System.out.println("|=================================================|");
		
		System.out.println("\nDigite o seu  peso :  ");
		float peso = teclado.nextFloat();
		
		System.out.println("Digite a sua altura : ");
		float altura = teclado.nextFloat();
		
		float imc = peso/(altura *altura);
		
		if(imc <18.5 ) {
			System.out.println("|abaixo de 18,5   |Abaixo do peso                 |");
		}else if (imc > 18.6 && imc <=24.9) {
			System.out.println("|Entre 18,6 e 24,9|Peso ideal (parabens)          |");
		}else if (imc >25.0 && imc <=29.9) {
			System.out.println("|entre 25,0 e 29,9|Levemente acima do peso        |");
		}else if (imc >30.0 && imc <=34.9) {
			System.out.println("|entre 30,0 e 34,9|Obedidade Grau I               |");
		}else if (imc >35.0 && imc<=39.9) {
			System.out.println("|entre 35,0 e 39,9|Obesidade Grau II(severa)      |");
		}else if (imc >=40) {
			System.out.println("|acima de 40      |Obesidade Grau III(morbida)    |");
		}
		
		System.out.println("\nSeu imc foi : "+imc );
		
			
			
		
		teclado.close();
	}
}
