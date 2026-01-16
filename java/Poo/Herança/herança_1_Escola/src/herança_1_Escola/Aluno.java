package herança_1_Escola;

public class Aluno extends Pessoa {

	private int matricula;
	private String curso;
	private boolean Status;
	
	public Aluno() {
		this.matricula=matricula;
		this.curso=curso;
		this.Status=Status;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matri) {
		this.matricula=matri;
	}
	
	public String getcurso() {
		return this.curso;
	}
	
	public void setcurso(String curs) {
		this.curso=curs;
	}
	
	public boolean getstatus() {
		return this.Status;
	}
	
	public void setstatus(Boolean sta) {
		this.Status=sta;
	}
	
	public void cancelarMatricula() {
		this.setstatus(false);
		System.out.println("Matricula cancelada");
		
	}
	
}

