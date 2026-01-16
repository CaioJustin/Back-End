package herança_2_Escolar;

public class professor extends pessoa{

	private String especialidade;
	private boolean trabalho;
	
	public String getespecialidade() {
		return this.especialidade;
	}
	
	public boolean gettrabalho() {
		return this.trabalho;
	}
	

	public void settrabalho(boolean tra) {
		this.trabalho=tra;
	}
	
	public void setespecialidade(String esp) {
		this.especialidade=esp;
	}
	
	public void receberaumento() {
		System.out.println("Salario aumentou ");
	}
	
}
