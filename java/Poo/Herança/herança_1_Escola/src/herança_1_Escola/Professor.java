package herança_1_Escola;
import java.util.Scanner;
public class Professor extends Pessoa{

	private String especialidade;
	private float Salario;
	
	public Professor() {
		this.especialidade=especialidade;
		this.Salario=Salario;
	}
	
	
	public String getespecialidade() {
		return this.especialidade;
	}
	
	public void setEspecialidade(String espe) {
		this.especialidade=espe;
	}
	
	public float getSalario() {
		return this.Salario;
	}
	
	public void setSalario(float sala) {
		this.Salario=sala;
	}
	
	Scanner teclado=new Scanner(System.in);
	
	public void receberAumento() {
		System.out.println("Digite o aumento");
		float aumento=teclado.nextFloat();
		System.out.println("Salario aumentado");
	}
	
}
