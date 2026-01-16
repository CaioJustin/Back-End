package herança_1_Escola;

public class Funcionario extends Pessoa{

	private String setor;
	private boolean trabalhando;
	
	public Funcionario() {
		this.setor=setor;
		this.trabalhando=trabalhando;
	}
	
	public String getsetor() {
		return this.setor;
	}
	
	public void setSetor(String set) {
		this.setor=set;
	}
	
	public boolean gettrabalhano() {
		return this.trabalhando;
	}
	
	public void settrabalhando(boolean tra) {
		this.trabalhando=tra;
	}
	
	
	public void mudarTrabalho() {
		if(this.trabalhando ==true) {
			this.trabalhando=false;
			System.out.println("Funcionario não esta Trabalhando");
		}else {
			this.trabalhando=true;
			System.out.println("Funcionario esta Trabalhando");
		}
	}
	
	
}

