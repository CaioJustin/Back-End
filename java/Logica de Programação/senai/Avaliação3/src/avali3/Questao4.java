package avali3;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[] =new int[5];
		
		int neg=0;
		int soma=0;
		int media=0;
		int impares=0;
		int par=0;
		int somapar=0;
		int mediapar=0;
		
		for(int i =0;i<numero.length;i++){
			
			System.out.println("Digite o "+(i+1)+" Numero");
			numero[i]=teclado.nextInt();
			
			//Quantidade de numeros negativos
			if(numero[i] <0) {
				neg++;
			}
			
			//Quantidade de numero pares e impares (soma par,media par)
			if(numero[i] %2==0) {
				par++;
				somapar+=numero[i];
				
				
			}else {
				impares++;
				
			}
			
			
			soma+=numero[i];
		
			
		}
		
		mediapar=somapar/par;
		media=soma/5;
		int maior=Integer.MIN_VALUE;
		int menor=Integer.MAX_VALUE;
		
		
		//Descobrir o maior e o menor numero 
		for(int i =0;i<5;i++) {
			if(numero[i] >maior) {
				maior=numero[i];
			}
			
			if(numero[i] <menor) {
				menor=numero[i];
			}
		}
		
		System.out.println("\nPrimeiro numero :"+numero[0]+"\n Segundo numero : "+numero[1]+"\n Terceiro Numero : "+numero[2]+"\n Quarto numero : "+numero[3]+"\n Quinto numero : "+numero[4]);
		System.out.println("a soma :"+soma);
		System.out.println("a media : "+media);
		System.out.println("menor : "+menor);
		System.out.println("maior : "+maior);
		System.out.println("Quantidade de numeros negativos : "+neg);
		System.out.println("Quantidade de numeros par : "+par);
		System.out.println("A soma dos numeros par: "+somapar);
		System.out.println("Quantidad de media par : "+mediapar);
		
		
		
		
		teclado.close();
	}
	
}
