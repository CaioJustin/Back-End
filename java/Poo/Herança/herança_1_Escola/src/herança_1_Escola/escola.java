package herança_1_Escola;

public class escola {

	public static void main(String[]args) {
		
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		p1.setNome("pedro");
		p2.setNome("Maria");
		p3.setNome("Claudio");
		p4.setNome("Fabiana");
		
		p1.setsexo("M");
		p4.setsexo("F");
		p2.setIdade(18);
		
		p2.setcurso("Informatica");
		p3.setSalario(2500.75f);
		
	//	p1.receber();
		
	}
}
