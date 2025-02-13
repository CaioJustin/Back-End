package array;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		float nota[]=new float[3];
		
		
		for(int i=0; i< nota.length;i++) {
			
			System.out.println("Digite a "+(i+1)+"do aluno");
			nota[i]=teclado.nextFloat();
		}
		
		
		
		for(int i =0; i< nota.length;i++){
			System.out.println(i+" Nota : "+nota[i]);
			
		}
		
		
		
		
		teclado.close();
	}
}
