package Creatures;

public abstract class Animals {

	private float peso;
	private int idade;
	private int membros;
	
	public Animals() {
		this.peso=peso;
		this.idade=idade;
		this.membros=membros;
	}
	
	
	public float getPeso() {
		return this.peso;
	}
	
	public int getidade() {
		return this.idade;
	}
	
	public int getmembros() {
		return this.membros;
	}
	
	public void setpeso(float pes) {
		this.peso=pes;
	}
	
	public void setidade(int age) {
		this.idade=age;
	}
	
	public void setmembros(int mem) {
		this.membros=mem;
	}
	
	public abstract void locomover();
	
	public abstract void alimentar();
	
	public abstract void emitirsom();
	
	
}
