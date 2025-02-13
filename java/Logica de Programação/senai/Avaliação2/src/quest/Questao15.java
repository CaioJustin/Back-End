package quest;

import java.util.Scanner;

public class Questao15 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		
		do{
			
				System.out.println("=== Conversor de Unidades ===");
	            System.out.println("1. Quilômetros para Milhas");
	            System.out.println("2. Milhas para Quilômetros");
	            System.out.println("3. Celsius para Fahrenheit");
	            System.out.println("4. Fahrenheit para Celsius");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
				numero=teclado.nextInt();
				
				switch(numero) {
				
				case 1:
				
	                    System.out.print("Digite o valor em quilômetros: ");
	                    double quilometros = teclado.nextDouble();
	                    double milhas = quilometros * 0.621371;
	                    System.out.printf("%.2f quilômetros é igual a %.2f milhas.%n", quilometros, milhas);
	                    break;
				case 2:
					  System.out.print("Digite o valor em milhas: ");
					milhas = teclado.nextDouble();
					quilometros = milhas / 0.621371;
	                    System.out.printf("%.2f milhas é igual a %.2f quilômetros.%n", milhas, quilometros);
	                    break;
				case 3:
					System.out.println("Digite o valor em celsiu ");
					float celsius =teclado.nextFloat();
					float fanheint =(celsius*9/5)+32;
					System.out.printf("%.2f°C é igual a %.2f°F.%n", celsius,fanheint);
                    break;
				case 4:
				    System.out.print("Digite o valor em Fahrenheit: ");
				    fanheint = teclado.nextFloat();
                    celsius = (fanheint - 32) * 5/9;
                    System.out.printf("%.2f°F é igual a %.2f°C.%n", fanheint, celsius);
					break;
				case 0:
				    System.out.println("Saindo do pograma");
					break;
				default : 
					System.out.println("Erro!");
					break;
					
				 
				} 
				 
				   System.out.println();
				
				
				
				
				
			
				
				
				
		
		}while(numero !=0);
		
		
		teclado.close();
	}
}
