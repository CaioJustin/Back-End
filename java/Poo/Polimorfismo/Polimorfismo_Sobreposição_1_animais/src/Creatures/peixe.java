package Creatures;

public class peixe extends Animals {

	private String CorEscama;
	
	public peixe() {
		this.CorEscama=CorEscama;
	}
	
	public String GetCorEscama() {
		return this.CorEscama;
	}
	
	public void setCorEscama(String cor) {
		this.CorEscama=cor;
	}
	
	 @Override
	 public void locomover() {
		 System.out.println("O Peixe de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de escama : "+CorEscama+" esta nadando no fundo do mar ");
	 }
	 
	 @Override
	 public void alimentar() {
		 System.out.println("O Peixe de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de escama : "+CorEscama+" esta se Alimentando no fundo do mar");
	 }
	 
	 @Override
	 public void emitirsom() {
		 System.out.println("O Peixe de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de escama : "+CorEscama+" esta emitindo um som de glub glub  ");
	 }
	 
	 public void SoltarBolha() {
		 System.out.println("O Peixe de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de escama : "+CorEscama+" esta Soltando bolhas   ");
	 }
	
}
