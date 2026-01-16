package atvEnd;

public class Gafanhoto extends Pessoa{
 
	private String login;
	private int TotAssistido;
	
	public Gafanhoto(String nome,int idade,String Sexo,String log,int tot) {
		super(nome,idade,Sexo);
		this.login=log;
		this.TotAssistido=tot;
	}
	
	public String getlog() {
		return this.login;
	}
	
	public int getTota() {
		return this.TotAssistido;
	}
	
	public void setLog(String people ) {
		this.login=people;
	}
	
	public void setTota(int tota) {
		this.TotAssistido=tota;
	}
	
	public void viuMaisUm() {
		setTota(getTota()+1);
	}
}
