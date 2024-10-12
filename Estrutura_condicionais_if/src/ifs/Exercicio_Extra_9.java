package ifs;
import java.util.Scanner;
public class Exercicio_Extra_9 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("|====Forma de Pagamento====|");
		System.out.println("|1- Pagamento à Vista      |");
		System.out.println("|2- Pagamento à Prazo      |");
		System.out.println("|==========================|");
		
		System.out.println("Escolha a forma ");
        int Escolha = teclado.nextInt();
		
        System.out.println("Digite o Preço do produto ");
        float preco = teclado.nextFloat();
		
		if(Escolha == 1) {
			System.out.println("Valor do produto : "+preco);
			System.out.println("Forma de pagamento: à vista ");
			System.out.println("Valor do desconto :R$10,00");
			float Tpag=(float)(preco-(preco*0.1));
			System.out.println("Total a pagar : "+Tpag);
			
		}else if(Escolha == 2) {
			System.out.println("Digite a quantidade de parcela");
			int parcela  = teclado.nextInt();
			if( parcela >0 && parcela <=6) {
			System.out.println("Valor do produto : "+preco);
			System.out.println("Forma de pagamento: à Prazo ");
			System.out.println("Quantidade de parcela :  "+parcela );
			float valo_por_parcela = preco /parcela;
			System.out.printf("Valor por parcela %.2f ",valo_por_parcela);
			System.out.println("Total a prazo :"+preco);
			}else {
				System.out.println("Não e possivel colocar essa quantidade de parcela");
			}
			
		}
        
		
		teclado.close();
	}
}
