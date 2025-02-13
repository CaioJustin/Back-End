package aval;

import java.util.Scanner;

class dados{
	
	String nome;
	String telefone;
	String Email;
	
	public dados(String nome,String telefone,String Email) {
		this.nome=nome;
		this.telefone=telefone;
		this.Email=Email;
	}
}



public class Quesion1 {
	
	public static String BuscaTelefone(dados[] dadosAluno,String NomeBusca) {
		
		for(dados dados :dadosAluno) {
			if(dados.nome.equalsIgnoreCase(NomeBusca)) {
				return dados.telefone;
			}
		}
		return null;
	}
	

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		dados dadosAluno[]=new dados[3];
		
		
		for(int i=0; i<dadosAluno.length;i++) {
			
			
			
			System.out.println("Preencha informaçoes do "+(i+1)+" Aluno");
			System.out.println("Digite o nome :");
			String nome =teclado.nextLine();
			
			System.out.println("Digite o telefone :");
			String telefone =teclado.next();
			
			teclado.nextLine();
			
			System.out.println("Digite o Email :");
			String Email=teclado.nextLine();
			
			dadosAluno[i] =new dados(nome,telefone,Email);
			
			System.out.println();
		}
		
		
		System.out.println("Digite o nome do contato para busca telefone : ");
		String NomeBusca=teclado.next();
		
		 String telefone = BuscaTelefone(dadosAluno,NomeBusca);
		 
		 if(telefone !=null) {
			 System.out.println("O Numero de telefone : "+NomeBusca+" e "+telefone);
		 }else {
			 System.out.println("Contato não encontrado");
		 }
		
		
		
		
		
		teclado.close();
	}
}
