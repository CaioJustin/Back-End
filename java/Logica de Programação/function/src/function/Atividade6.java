package function;

import java.util.Scanner;

class secondy{
	
	
		int quantidadepar(int[] numero) {
			int par=0;
			
			for(int i=0;i<numero.length;i++) {
				
				if(numero[i] % 2==0) {
					par++;
				}
			}
			
			return par;
		}
	
		
		int quantidadeimpares(int[] numero) {
			int impar=0;
			
			for(int i=0;i<numero.length;i++) {
				
				if(numero[i] % 2 !=0) {
					impar++;
				}
			}
			return impar;
		}
}



public class Atividade6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[]=new int[6];
		
		for(int i=0;i<numero.length;i++) {
			
			System.out.println("Digite o numero : "+(i+1));
			numero[i]=teclado.nextInt();
			
		}
		
		secondy looby=new secondy();
		
		looby.quantidadeimpares(numero);
		looby.quantidadepar(numero);
		
		
		int par = looby.quantidadepar(numero);
		int impar=looby.quantidadeimpares(numero);
		
		System.out.println("A Quantidade de par e : "+par);
		System.out.println("A Quantidade de impar e : "+impar);
		
		teclado.close();
	}

}
