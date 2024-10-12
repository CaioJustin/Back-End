package para_faca;
import java.util.Scanner;
public class Exercicio_6 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
		
		int par=0;
		int impar=0;
		
		
		for(int i =0; i<5;i++) {
			
			System.out.printf("Digite o %d numero",i+1);
			int num =teclado.nextInt();
			
			
			if(num %2 ==0) {
				par++;
			}else {
				impar++;
			}
			
			
			
		}
		
		
		
		
		System.out.println("Quantidade de par : "+par);
		System.out.println("Quantidade de impar : "+impar);
		
		teclado.close();
	}
}
