package app;
import java.util.Scanner;

public class Conta {

	Scanner teclado = new Scanner(System.in);	
	
	public int NumConta;
	protected String Tipo;
	private String Dono;
	private float Saldo;
	private boolean Status;
	
	
	public Conta(int nc,String D) {
		
	this.setNumconta(nc);	
	this.setTipo("Conta não criada");
	this.setDono(D);
	this.setSaldo(0);
	this.setStatus(false);
		
	}
	
	
	public int getNumconta() {
		return NumConta;
	}
	
	public void setNumconta(int nc){
		this.NumConta=nc;
	}
	
	
	public String geTipo(){
		return Tipo;
	}
	
	public void setTipo(String T){
		this.Tipo=T;
	}
	
	
	public String getDono() {
		return Dono;
	}
	
	public void setDono(String D){
		this.Dono=D;
	}
	
	public float getSaldo() {
		return Saldo;
	}
	
	
	public void setSaldo(float S){
		this.Saldo=S;
	}
	
	public boolean getStatus() {
		return Status;
	}
	
	public void setStatus(boolean Sta) {
		this.Status=Sta;
	}
	
	
	
	public void MostraStatus() {
		System.out.println();
		System.out.println("Numero da conta : "+this.getNumconta());
		System.out.println("Tipo da Conta: "+this.geTipo());
		System.out.println("Dono da conta : "+this.getDono());
		System.out.println("Saldo da conta: "+this.getSaldo());
		System.out.println("Status da conta : "+this.getStatus());
	}
	
	
	public void abrirConta(){
		String optio;	
		
		if(Status == true) {
			System.out.println("Esse Usuario já possui Conta");
		}else {
			
			System.out.println("Escolha o tipo de conta cc- Para corrente e cp- para Poupança  ");
			optio = teclado.next();
			this.setTipo(optio); 
			this.setStatus(true);
			
			if(optio.equalsIgnoreCase("cc")) {
				this.setSaldo(50.00f);
			}else if(optio.equalsIgnoreCase("cp")){
				this.setSaldo(150.00f);
			}
			
		
		}
			
		System.out.println("Parabens a sua conta foi criada com SUCESSO!!");
		
	}  
	
	public void fecharConta() {
		
		if((this.getSaldo() >=0) || (this.getSaldo() <=0)) {
			System.out.println("Não e possivel fechar conta, ainda há dinheiro ");
		}else {
			this.setStatus(false);
			System.out.println("A conta foi deletado com sucesso ");
		}
		
	}
	
	
	public void depositar() {
		float money;	
		if(getStatus() == true) {
			System.out.println("Digite a Quantidade de dinheiro que deseja depositar ");
			money=teclado.nextFloat();
			this.setSaldo(Saldo+=money);
			
		}else {
			System.out.println("Voce não possui uma conta porfavor crie uma ");
		}
		
	}
	
	public void sacar() {
		float money=0;
		
		if(this.getSaldo() ==0 ||(this.getStatus() != true)){
			System.out.println("Voce não possui dinheiro depositado ou conta ");
		}else {
			System.out.println("Voce tem : "+this.getSaldo());
			
			System.out.println("Quanto voce gostaria de sacar? ");
			money=teclado.nextFloat();
					
			if((this.getSaldo()<money) || (this.getStatus() != true)) {
				System.out.println("Voce não possui esse valor na conta ou voce não possui conta ");
			}else {
				this.setSaldo(Saldo-money);
				System.out.println(money+" Valor retirado com sucesso");
			}
		}
		
	}
	
 
	public void PagarMensal() {
		float vbefore=0;
		if(this.geTipo().equalsIgnoreCase("cc")) {
			
			vbefore=this.getSaldo();
			this.setSaldo(Saldo-12f);
			System.out.println("Valor retirado da mensalidade :R$12 ");
			System.out.println("Seu saldo atual :"+this.getSaldo());
			
		}else if(this.geTipo().equalsIgnoreCase("cp")) {
			
			vbefore=this.getSaldo();
			this.setSaldo(Saldo-20f);
			System.out.println("Valor retirado da mensalidade :R$20 ");
			System.out.println("Seu saldo atual :"+this.getSaldo());
			
		}
		
	}
	
	
	
}
