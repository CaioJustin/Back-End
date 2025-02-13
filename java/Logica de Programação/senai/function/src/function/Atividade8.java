package function;

import java.util.Scanner;


class convert{
	
	
		float descontos(float preco) {
			
			float valor_com_Desconto=0;
			float desconto=0;
			
			if(preco <100) {
				desconto = preco*(float)0.10;
				valor_com_Desconto =preco+desconto;
			}else if(preco >=100) {
				desconto=preco*(float)0.20;
				valor_com_Desconto=preco+desconto;
				
			}
			
			
			return  valor_com_Desconto; 
		}
	
}


public class Atividade8 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
				
				
		System.out.println("Digite o preço de um Produto");
		float preco = teclado.nextFloat();
				
		convert conse = new convert();
		
		
		System.out.println("O Valor de desconto e : "+conse.descontos(preco));
		
		teclado.close();		
	}
}
