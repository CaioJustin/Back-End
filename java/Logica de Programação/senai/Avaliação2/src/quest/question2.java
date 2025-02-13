package quest;

import java.util.Scanner;

public class question2 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		System.out.println("Digite o preço ");
		float preco=teclado.nextFloat();
		
		
		System.out.println("Digite o dia da semana Dia util | dia não util ");
		String dia = teclado.next();
		
		float desconto=0;
		float valor_com_desconto=0;
		
		if(preco >100 && dia.equalsIgnoreCase("util")){
		desconto = preco*0.10f;	
		valor_com_desconto=preco-desconto;	
		System.out.println("O Preço sem desconto e :"+preco);
		System.out.printf("O Preço com desconto e %.2f:",valor_com_desconto);
		}else if(preco >100 && dia.equalsIgnoreCase("inutil")) {
			desconto = preco*0.15f;	
			valor_com_desconto=preco-desconto;	
			System.out.println("O Preço sem desconto e :"+preco);
			System.out.printf("O Preço com desconto e %.2f:",valor_com_desconto);
			
		}
		
		
		
		teclado.close();
	}
	
}
