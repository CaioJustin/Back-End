package struct;

import java.util.Scanner;

class dado{
	
	String nome;
	String dataN;
	String Rg;
	String cpf;
	
}




public class Atividade4 {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		dado Usuario[] = new dado[3];
		
		
		for(int i =0; i<Usuario.length;i++) {
			
			Usuario[i]= new dado();
			
			System.out.println("Informaçoes da "+(i+1)+" Pessoa");
			
			System.out.println("Digite o nome da "+(i+1)+" Pessoa");
			Usuario[i].nome=teclado.nextLine();
			
			System.out.println("Digite a data de Nascimento "+(i+1)+" Pessoa");
			Usuario[i].dataN=teclado.nextLine();
			
			
			System.out.println("Digite o rg da  "+(i+1)+" Pessoa");
			Usuario[i].Rg=teclado.nextLine();
			
			
			System.out.println("Digite o nome da "+(i+1)+" Pessoa");
			Usuario[i].cpf=teclado.nextLine();
			
			
		}
		
		
		
		
		teclado.close();
	}
}
