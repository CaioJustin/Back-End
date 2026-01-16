package Creatures;

public class reptil extends Animals{

	 private String corEscama;
	 
	 public reptil() {
		 this.corEscama=corEscama;
	 }
	 
	 public String getCorEscama() {
		 return this.corEscama;
	 }
	 
	 public void setCorEscama(String cor) {
		 this.corEscama=cor;
	 }
	 
	 @Override
	 public void locomover() {
		 System.out.println("O reptil de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+getCorEscama()+" esta se movendo ");
	 }
	 
	 @Override
	 public void alimentar(){
		 System.out.println("O reptil de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+getCorEscama()+" esta se alimentando ");
	 }
	 
	 @Override
	public void emitirsom() {
		 System.out.println("O reptil de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
				 "com a cor de pelo : "+getCorEscama()+" esta se movendo ");
	}
}
