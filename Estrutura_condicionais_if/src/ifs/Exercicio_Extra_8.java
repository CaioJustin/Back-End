package ifs;
import java.util.Scanner;
public class Exercicio_Extra_8 {
	
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int numero = teclado.nextInt();
		
		if(numero ==1) {
			System.out.println("janeiro");
		}else if (numero ==2) {
			System.out.println("fevereiro");
		}else if (numero==3) {
			System.out.println("março");
		}else if (numero==4) {
			System.out.println("Abril");	
		}else if (numero==5) {
			System.out.println("maio");
		}else if (numero==6) {
			System.out.println("junho");
		}else if (numero==7) {
			System.out.println("julho");
		}else if (numero==8) {
			System.out.println("agosto");
		}else if (numero==9) {
			System.out.println("Setembro");	
		}else if (numero==10) {
			System.out.println("outubro");	
		}else if (numero==11) {
			System.out.println("novembro");
		}else if (numero==12) {
			System.out.println("dezembro");
		}
		
		teclado.close();
	}
}
