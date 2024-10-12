package Switch;
import java.util.Scanner;
public class Exercicio_6 {
	
	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
			System.out.println("Digite a quantidade de maça comprada");
			int maca= teclado.nextInt();
			
			float total=0;
			
			switch(maca) {
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 10:
			case 11:
			case 12:
			total = maca*(float)1.30;
			System.out.println("O Total e : "+total);
			break;
			default:
				total =maca*(int)1;
				System.out.println("O Total e : "+total);
				break;
			
			}
	
		
		teclado.close();
	}
}
