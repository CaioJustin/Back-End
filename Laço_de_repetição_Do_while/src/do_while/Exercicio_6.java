package do_while;
import java.util.Scanner;
public class Exercicio_6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero=0;
		int par=0,impares=0;
		int ipar=0,i=0;
		int somapar=0,mediapar=0;
		int soma=0,media=0;
		
		do {
			
			System.out.println("Digite o numero");
			numero=teclado.nextInt();
			
			soma+=numero;
			i++;
			media =soma/i;
			
			if(numero % 2==0) {
				ipar++;
				par++;
				somapar+=numero;
				mediapar=somapar/ipar;
				
			}else {
				impares++;
			}
			
			
		}while(numero >0);
		
		
		
		System.out.println("Quantidade de pares : "+par+"\n"+"Quantidade de Impares : "+impares);
		System.out.println("Media pares "+mediapar);
		System.out.println("Media geral do numeros lido : "+media);
		
		
		
		teclado.close();
	}
}
