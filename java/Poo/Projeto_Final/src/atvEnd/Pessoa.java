package atvEnd;

public class Pessoa {
	
	protected String nome;
	protected int idade;
	protected String Sexo;
	protected int exp;
	
	public Pessoa(String nom,int age,String sex) {
		this.nome=nom;
		this.idade=age;
		this.Sexo=sex;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public String getSexo() {
		return this.Sexo;
	}
	
	public int getExp() {
		return this.exp;
	}
	
		//setter
	
	public void setNome(String n) {
		this.nome=n;
	}
	
	
	public void setIdade(int ag) {
		this.idade=ag;
	}
	
	
	public void setSex(String sex) {
		this.Sexo=sex;
	}
	
	
	public void setExp(int ex) {
		this.exp=ex;
	}
	
	public void ganharxp() {
		setExp(getExp()+50);
	}
	
}
