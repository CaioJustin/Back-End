package array;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int i =0;
		int numero[]=new int[10];
		int soma=0;
		int qtdp=0;
		int somaneg=0;
		int qtdm=0;
		
		for(i=0;i<numero.length;i++) {
			
			System.out.println("Digite o "+(i+1)+" numero");
			numero[i]=teclado.nextInt();
			
			
			if(numero[i] >0) {
				soma+=numero[i];
				qtdp++;
			}else {
				somaneg+=numero[i];
				qtdm++;	
			}
			
			
		}
		
		
		System.out.println("\nSoma dos numeros positivos : "+soma);
		System.out.println("\na quantidade de numeros positivos : "+qtdp);
		System.out.println("\nSoma dos numeros negativos : "+somaneg);
		System.out.println("\na quantidade de numeros negativos : "+qtdm);
		
		
		
		
		teclado.close();
	}
}
