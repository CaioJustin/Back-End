package lubatv;
// importando a classe arraylist do pacote java.util
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class testelist {

	public static void main(String[]args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Criando a lista 
		ArrayList<Integer> numbers =new ArrayList<Integer>();
		
		String strupper;
		int numero;
		
		do {
			
			
			System.out.println("Digite um numero");
		    numero = teclado.nextInt();
			
			
			
			System.out.println("Gostaria de adicionar mais numero");
			String option = teclado.next();
			
			strupper =option.toUpperCase();
			//Adicionando os numeros a lista
			numbers.add(numero);
			
		}while(strupper.equalsIgnoreCase("SIm"));
		
		
		
		
		
		System.out.println("Todos os numeros da lista ");
		System.out.println(numbers);
		
		
		
		System.out.println("Voce gostaria de remover um item da lista ? ");
		String op2 = teclado.next();
		
		
		
		if(op2.equalsIgnoreCase("sim")) {
			System.out.println("Digite o numero da opção");
			int opt3 = teclado.nextInt();
			//Removendo um item da lista 
			numbers.remove(opt3);
			
		}else{
		
		}
		

		
		System.out.println(numbers);
		
		int i =0;
		//Metodo fOREACh para percorre a lista 
		for(int numb:numbers){
			System.out.println("Posição"+ i+":"+ +numb);
			i++;
		}
		
		
		String opt6;
		
		do {
			
			System.out.println("Qual elemento voce gostaria de acessa ");
			int acessar = teclado.nextInt();
			//Acessando elemento da arraylist
			int indice =numbers.get(acessar);
			

			System.out.println("O "+ acessar +" elemento na lista e : "+indice);
				
			
			
			System.out.println("Gostaria de acessar  mais um elemento ?");
			opt6=teclado.next();
			
		}while(opt6.equalsIgnoreCase("nao"));
		
		
		//Ordenando a lista
	
		Collections.sort(numbers);
		System.out.println("Depois de ordenados ");
		System.out.println(numbers);
		
		
		teclado.close();
	}
}
