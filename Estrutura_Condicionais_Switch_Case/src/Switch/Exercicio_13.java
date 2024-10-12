package Switch;
import java.util.Scanner;
public class Exercicio_13 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("|Escolha a forma de pagamento|");
		System.out.println("|1 - Pagamento á vista|");
		System.out.println("|2 - Pagamento a prazo|");
		
		System.out.println("Digite o metodo de pagamento");
		int metodo = teclado.nextInt();
		
		System.out.println("Digite o valor do produto");
		float VP = teclado.nextFloat();
		
		
		switch (metodo) {
		case 1:
			System.out.println("Valor do produto : "+VP);
			System.out.println("Forma de pagamento a vista ");
			float TP =(float) (VP-(VP*0.1));
			float descont = VP-TP;
			System.out.println("Valor do desconto : "+descont);
			System.out.println("Total a pagar : "+TP);
			
			break;
		case 2:
			System.out.println("Digite a quantidade de parcela (so e permitido 6 parcela) ");
			int parcela = teclado.nextInt();
			if(parcela >0 || parcela <=6) {
					System.out.println("Valor do produto : "+VP);
					System.out.println("Forma de pagamento a prazo");
					System.out.println("Quantidade de percela : "+parcela);
					float  QP= VP/parcela;
					System.out.println("Quantidade de valor por parcela :"+QP);
					System.out.println("Total a prazo : "+VP);
			}else {
				System.out.println("Quantidade negativa ou maior que 6");
			}
			break;
	
		default:
			break;
		}
		
		teclado.close();
	}
}
