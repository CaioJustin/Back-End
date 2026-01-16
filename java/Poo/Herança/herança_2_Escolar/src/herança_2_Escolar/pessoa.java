package herança_2_Escolar;

public abstract class pessoa {

	private String nome;
	private int idade;
	private String sexo;
	
	public pessoa() {
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}
	
	
	public String getnome() {
		return this.nome;
	}
	
	public void setnome(String no) {
		this.nome=no;
	}
	
	public int getidade() {
		return idade;
	}
	
	public void setidade(int ida) {
		this.idade=ida;
	}
	
	public String getsexo() {
		return this.sexo;
	}
	
	public void setsexo(String sex) {
		this.sexo=sex;
	}
	
	public void fazerAniversario() {
		setidade(idade++);
	}
	
	
	
	
}
