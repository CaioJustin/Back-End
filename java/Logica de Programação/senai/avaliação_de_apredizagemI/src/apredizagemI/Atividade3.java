package apredizagemI;
import java.util.Scanner;

public class Atividade3 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero[]=new int[7];
		int par=0;
		int impar=0;
		
		for(int i =0;i<numero.length;i++) {
			
		System.out.println("Digite o "+(i+1)+" Numero");
		numero[i]=teclado.nextInt();
		
		if(numero[i] %2 ==0) {
			par++;
		}else {
			impar++;
		}
		
		}
		
		
		System.out.println("quantidade de numeros par : "+par);
		System.out.println("quantidade de numeros par : "+impar);
		
		
		teclado.close();
	}
}
