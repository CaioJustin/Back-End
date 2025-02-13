package avaliação1;

import java.util.Scanner;

public class Questão2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Digite o seu nome :");
		String nome=teclado.next();
		
		
		System.out.println("Digite o seu sexo F- pra Mulher e H- pra homem :");
		String sexo=teclado.next();
		
		
		System.out.println("Digit o seu estado civil :");
		String estado_civil=teclado.next();
		
		int idade=0;
		
		String SexoGrande =sexo.toUpperCase();
		String estado_civilGrande =estado_civil.toUpperCase();
		
		
		if(SexoGrande.equals("F") && estado_civilGrande.equalsIgnoreCase("CASADA")) {
			System.out.println("Digite o tempo de casado em anos");
			idade =teclado.nextInt();
		}
		
		if(idade !=0) {
			System.out.println("nome :"+nome);
			System.out.println("sexo : "+sexo);
			System.out.println("estado Civil : "+estado_civil);
			System.out.println("tempo de casado : "+idade+" Anos");
		}else {
			System.out.println("nome :"+nome);
			System.out.println("sexo : "+sexo);
			System.out.println("estado Civil : "+estado_civil);
		}
		
		teclado.close();

	}

}
