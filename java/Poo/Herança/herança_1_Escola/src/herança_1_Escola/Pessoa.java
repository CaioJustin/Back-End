package herança_1_Escola;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(){
		this.nome=nome;
		this.idade=idade;
		this.sexo=sexo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String no) {
		this.nome=no;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int age) {
		this.idade=age;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setsexo(String sex) {
		this.sexo=sex;
	}
	
	
	public void FazerAniversario() {
		setIdade(getIdade()+1);
	}
}
