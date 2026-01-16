package animals;

public class mamifero extends animals {

	protected String cordopelo;
	
	
	public String getCordDoPelo() {
		return this.cordopelo;
	}
	
	public void setCorDoPelo(String cor) {
		this.cordopelo=cor;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("MAMIFERO esta fazendo um som");
	}
	
}
