package matriz;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in); 
				
		
		
		String dado[][]=new String[3][3];
		float media[]= new float[3];
		float soma=0;
		
		int i=0;
		int j=0;
		for(i=0;i<dado.length;i++){
			
			System.out.println("Digite a "+(i+1)+" Materia ");
			dado[i][0]=teclado.next();
			
			for(j=1;j<=2;j++) {
				
				System.out.println("Digite a "+j+" nota");
				dado[i][j]=teclado.next();
				soma+=Float.parseFloat(dado[i][j]);
				
			}
			media[i]=soma/2;
			soma=0;
		}
		
			
		for(i=0;i<dado.length;i++){
			
			System.out.println("\n");
			System.out.println("O Nome da Materia "+dado[i][0]);
			
			for(j=1;j<=2;j++) {
				System.out.println("A "+j+" Nota e : "+dado[i][j]);
			}
			System.out.println("A media e :"+media[i]);
		}
		
		
		
		
			teclado.close();
	}
}
