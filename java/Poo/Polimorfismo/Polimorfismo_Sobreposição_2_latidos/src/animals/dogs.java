package animals;

public class dogs  extends wolf{
	@Override
	public void emitirSom() {
		System.out.println("Cachorro começou a latir au!au!au!");
	}
	
	public void reagir(String chara) {
		
		if(chara.equals("frase agradavel")) {
			System.out.println("abanar e latir");
		}else if(chara =="frase agressiva") {
			System.out.println("rosnar");
		}else {
			System.out.println("Mogado");
		}
	}
	
	
	public void reagir(int hora) {
		
		if(hora<12){
			System.out.println("abanar");
		}else if(hora>12 && hora <17) {
			System.out.println("abanar e latir ");
		}else{
			System.out.println("ignorar");
		}
		
		
	}
	
	
	public void reagir(Boolean don) {
		
		if(don) {
			System.out.println("abanar");
		}else {
			System.out.println("rosnar e latir");
		}
	}
	
	public void reagir(int idade ,float peso) {
		
		if(idade <8) {
			
			if(peso <15.0) {
				System.out.println("Abanar");
			}else {
				System.out.println("Latir");
			}
			
			
		}else {
			
			if(peso<15.0) {
				System.out.println("Rosnar");
			}else {
				System.out.println("ignorar");
			}
			
			
			
		}
		
		
	}
	
}
