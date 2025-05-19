package qtdword;

import java.util.Scanner;


public class contadordepalavra  {
	
	public static void main(String[]args) throws InterruptedException{
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Contador de palavras");
		Thread.sleep(1000);
		System.out.println("Escrevar o seu texto:");
		String texto = teclado.nextLine();
		String[] quantidade = texto.split("\\s+");
		int qtd= quantidade.length;
		
		System.out.println("Quantidade : "+qtd);
		
	}

}
