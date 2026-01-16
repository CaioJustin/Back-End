package animals;

public abstract class animals {

	protected float peso;
	protected int idade;
	protected int membros;
	
	public animals() {
		this.peso=peso;
		this.idade=idade;
		this.membros=membros;
	}
	
	public float getpeso() {
		return this.peso;
	}
	
	public void setpeso(float pe) {
		this.peso=pe;
	}
	
	public int getidade() {
		return this.idade;
	}
	
	public void setidade(int age) {
		this.idade=age;
	}
	
	public int getmembros() {
		return this.membros;
	}
	
	public void setmembros(int me) {
		this.membros=me;
	}
	
	public abstract void emitirSom();
	
	
}
