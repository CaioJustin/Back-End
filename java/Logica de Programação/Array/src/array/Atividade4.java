package array;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int Descobrirmenor= Integer.MAX_VALUE;
		int DescobrirMaior= Integer.MIN_VALUE;
		
		
		int numero[]=new int[5];
		int i =0;
		
		for(i =0; i<numero.length;i++) {
			
			System.out.println("Digite o "+(i+1)+" Numero");
			numero[i]=teclado.nextInt();
			
			if(numero[i] >DescobrirMaior) {
				DescobrirMaior=numero[i];
			}
			
			if(numero[i] <Descobrirmenor) {
				Descobrirmenor=numero[i];
			}
			
		}
		
		for(i=0;i<numero.length;i++) {
			System.out.println("Os numeros digitados são : "+numero[i]);
		}
		
		
		System.out.println(" O Maior numero : "+DescobrirMaior);
		System.out.println(" O Menor numero : "+Descobrirmenor);
		
		
		
		
		teclado.close();
	}
}
