package function;

import java.util.Scanner;

class conversor{
	
		
	int con(int metro) {
		
		int cm=0;
		cm = metro*100;
		
		return cm;
	}
}



public class Atividade7 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o metro ");
		int metro = teclado.nextInt();
		
		conversor conver=new conversor();
		
	
		
		System.out.println("A quantidade de cm e : "+conver.con(metro));
		
		
		teclado.close();
	}
}
