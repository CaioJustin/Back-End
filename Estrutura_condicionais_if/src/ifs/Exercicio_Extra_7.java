package ifs;
import java.util.Scanner;
public class Exercicio_Extra_7 {
	
	public static void main(String[]args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int day =teclado.nextInt() ;
		
		if (day == 1){
			System.out.println("E Domingo dia não Util");
		} else if(day==2) {
			System.out.println("E Segunda dia Util");
		}else if (day==3) {
			System.out.println("E Terça dia Util");
		} else if(day==4) {
			System.out.println("E Quarta dia Util");
		}else if (day==5) {
			System.out.println("E Quinta dia Util");
		} else if(day ==6){
			System.out.println("E Sexta dia não Util");
		}else if (day ==7) {
			System.out.println("E Sabado dia não Util");	
		}else {
			System.out.println("Esse dia não existe Invalido!");
		}
		
		teclado.close();
	}
}
