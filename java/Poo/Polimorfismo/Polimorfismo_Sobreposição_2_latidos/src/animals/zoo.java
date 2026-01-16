package animals;

public class zoo {

	public static void main(String[]args) {
		
		mamifero m = new mamifero();
		wolf w = new wolf();
		dogs d = new dogs();
		
		
		m.emitirSom();
		w.emitirSom();
		d.emitirSom();
		
		d.reagir("frase agradavel");
		
	}
}
