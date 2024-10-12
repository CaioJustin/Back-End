package do_while;
import java.util.Scanner;
public class Exercicio_4 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		String resposta=null;
		int i =0;
		float nota=0;
		float soma=0,media=0;
		
		do {
		
			System.out.println("Digite a "+(i+1)+" nota ");
			nota=teclado.nextFloat();
			
			i++;
			
			System.out.println("Deseja digita mais uma nota :");
			resposta = teclado.next();
			
			soma+=nota;
			
			
			
		}while(resposta.equalsIgnoreCase("sim"));
		
		media = soma/i;
		
		 	System.out.println("A Media e : "+media);
		 	System.out.println("A Quantidade de loop e : "+i);
		
		teclado.close();
	}
}
