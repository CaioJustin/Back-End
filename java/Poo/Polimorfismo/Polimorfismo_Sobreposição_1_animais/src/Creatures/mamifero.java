package Creatures;

public class mamifero extends Animals {

	 public String CorPelo;
	 
	 public mamifero() {
		 this.CorPelo=CorPelo;
	 }
	 
	 public String getCordoPelo() {
		 return this.CorPelo;
	 }
	 
	 public void setCordoPelo(String cor) {
		 this.CorPelo=cor;
	 }
	 
	 @Override
	 public void locomover() {
		 System.out.println("O mamifero de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+CorPelo+" esta se movendo ");
	 }
	 
	 @Override
	 public void alimentar() {
		 System.out.println("O mamifero de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+CorPelo+" esta se Alimentando ");
	 }
	 
	 @Override
	 public void emitirsom() {
		 System.out.println("O mamifero de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+CorPelo+" esta emitindo um som ");
	 }
	 
}
