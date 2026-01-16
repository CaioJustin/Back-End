package herança_2_Escolar;

public class tecnico extends aluno{

	private int registroprofissional;
	
	public int getregi() {
		return this.registroprofissional;
	}
	
	public void setregi(int reg) {
		this.registroprofissional =reg;
	}
	
	public void praticar() {
		System.out.println("Aluno praticando ");
	}
}
