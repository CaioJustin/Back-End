package switchcase;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
	
		System.out.println("Digite o valor do produto");
		float valor = teclado.nextFloat();
		
		System.out.println("Digite o meto de pagamento \n1- A vista \n2 - a prazo");
		int Escolha = teclado.nextInt();
		
		
		switch(Escolha) {
		case 1:
			float desconto = valor *(float)0.10;
			float valor_com_Desconto = valor - desconto;
			
			System.out.println("Valor do Prodto : "+valor);
			System.out.println("Forma de pagamento : a vista ");
			System.out.println("Valor do desconto : R$ 10,00");
			System.out.println("total a pagar : "+valor_com_Desconto);
			break;
		case 2 :
			System.out.println("Digite a quantidade de parcela (6 Maximo)");
			int parcela = teclado.nextInt();
			
			if(parcela <=6) {
				float vp = valor /parcela;
				
				System.out.println(" Valor do Produto R$ : "+valor);
				System.out.println(" Forma de Pagamento : Á prazo ");
				System.out.println(" Quantidade de Parcela : "+parcela);
				System.out.println(" Valor por Parcela : R$ "+vp);
				System.out.println(" Total a prazo : R$"+valor);
			}else {
				System.out.println("So e permitido parcela 6 vezes");
			}
			
			break;
			
		}
		
		
		teclado.close();
	}
}
