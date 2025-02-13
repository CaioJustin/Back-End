package avaliação1;

import java.util.Scanner;

public class Questão4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de Kg em maça");
		int maca= teclado.nextInt();
		
		System.out.print("Digite a quantidade de Kg em morango");
		int morango= teclado.nextInt();
		
		
		float preçoMorago =0;
		float  preçoMaca =0;
		
		if(maca <=5) {
			preçoMaca= 1.80f;
		}else{
			preçoMaca= 2.50f;
		}
			

		if(morango <=5) {
			preçoMorago= 2.50f;
		}else{
			preçoMorago= 2.20f;
		}
		
		
		float compMorango=morango*preçoMorago;
		float compMaca=maca*preçoMaca;
		float totalCOM=compMorango+compMaca;
		
		if((maca >8|| morango>8) || (compMorango>25 || compMaca>25) || totalCOM >25 ) {
			float Desconto= totalCOM *0.10f;
			float precototal = totalCOM-Desconto;
			System.out.println("=== Informaçoes dos Items comprado ===");
			System.out.println("=== Informaçoes do Morango ===");
			System.out.println("Morango :"+morango+" KG");
			System.out.println("Preço : R$ "+preçoMorago);
			System.out.println("Preço total : R$ "+compMorango);
			System.out.println("=== Informaçoes da maça ===");
			System.out.println("Maça : R$ "+maca+" KG");
			System.out.println("Preço : R$ "+preçoMaca);
			System.out.println("Preço total : R$ "+compMaca);
			System.out.println("======= Preços =======");
			System.out.println(" Preço do morango com maça : "+totalCOM);
			System.out.printf("PREÇO COM DESCONTO : %.2f",precototal);
		}else {
			
			System.out.println("=== Informaçoes dos Items comprado ===");
			System.out.println("=== Informaçoes do Morango ===");
			System.out.println("Morango :"+morango+" KG");
			System.out.println("Preço : R$ "+preçoMorago);
			System.out.println("Preço total : R$ "+compMorango);
			System.out.println("=== Informaçoes da maça ===");
			System.out.println("Maça : R$ "+maca+" KG");
			System.out.println("Preço : R$ "+preçoMaca);
			System.out.println("Preço total : R$ "+compMaca);
			System.out.println("======= Preços =======");
			System.out.println(" Preço do morango com maça : "+totalCOM);
			
		}
		
		
		teclado.close();
	}
}
