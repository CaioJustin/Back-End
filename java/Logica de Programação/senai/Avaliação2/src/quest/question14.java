package quest;

import java.util.Scanner;



public class question14 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		int pares=0;
		int somapar=0;
		int mediapar=0;
		
		int impares=0;
		int somaimpar=0;
		int mediaimpar=0;
		
		int i=0;
		
		
		do {
			
			System.out.println("Digtite o "+(i+1)+" Numero");
			numero=teclado.nextInt();
			
			if(numero % 2==0) {
				pares++;
				somapar+=numero;
			}else{
				impares++;
				somaimpar+=numero;
			}
			
			i++;
			
		}while(numero >0);
		
		
		
		mediapar=somapar/pares;
		mediaimpar=somaimpar/impares;
		
		System.out.println("Quantidades de numeros pares : "+pares);
		System.out.println("Quantidades de numeros impares : "+impares);
		
		
		System.out.println("A Media dos pares : "+mediapar);
		System.out.println("A Media dos impares : "+mediaimpar);
		
		
		teclado.close();
	}
}
