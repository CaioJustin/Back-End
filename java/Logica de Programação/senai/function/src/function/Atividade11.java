package function;

import java.util.Scanner;

class dado{
	
	
	
	float descIMC(float peso,float altura){
		
		float imc =peso/(altura*altura);
		
		return imc;
	}
	
	
	void classificacao(float imc) {
		
		if(imc <18.5 ) {
			System.out.println("\nabaixo do peso");
		}else if(imc >= 18.5 && imc <=24.9 ) {
			System.out.println("\nPeso normal");
		}else if(imc >=25 && imc <=29.9) {
			System.out.println("\nSobrepeso");
		}else if(imc >=30 && imc <=34.9) {
			System.out.println("\nObesidade grau I");
		}else if(imc >= 35 && imc <=39.9){
			System.out.println("\nObesidade grau II");
		}else if(imc >=40) {
			System.out.println("\nObesidade grau III");
		}
		
	}
	
	void recomenda(float imc) {
		
		
		if(imc <18.5 ) {
			System.out.println("\nConsulte um nutriocionista para orientação");
		}else if(imc >= 18.5 && imc <=24.9 ) {
			System.out.println("\nMantenha hábitos saudavel");
		}else if(imc >=25 && imc <=29.9) {
			System.out.println("\nConsidere uma dieta balanceada e atividade fisica");
		}else if(imc >=30 && imc <=34.9) {
			System.out.println("\nProcure orientação de um profissional de saúde ");
		}else if(imc >= 35 && imc <=39.9){
			System.out.println("\nConsulte um médico para avaliação e orientação");
		}else if(imc >=40) {
			System.out.println("\nBusque assistencia médica imediatamente");
		}
		
		
	}
	
	
}


public class Atividade11 {

	public static void main(String[]args) {
		
		Scanner teclado =new Scanner(System.in);
		
		dado aluno = new dado();
		
		System.out.println("Digite o seu peso");
		float peso = teclado.nextFloat();
		
		
		System.out.println("Digite a sua altura ");
		float altura =teclado.nextFloat();
		
		float imc=aluno.descIMC(peso, altura);
		
		
		System.out.printf("IMC: %.1f",imc);
		aluno.classificacao(imc);
		aluno.recomenda(imc);
		
		
	
		
		
		teclado.close();
	}
	
}
