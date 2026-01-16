package Creatures;

public class ave extends Animals{

		private String CorPena;
		
		public String GetCorEscama() {
			return this.CorPena;
		}
		
		public void setCorEscama(String feather) {
			this.CorPena=feather;
		}
		
		
		 @Override
		 public void locomover() {
			 System.out.println("A ave de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
					 "com a pena cor de : "+CorPena+" esta Voando ");
		 }
		 
		 @Override
		 public void alimentar() {
			 System.out.println("A ave de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
					 "com a pena cor de : "+CorPena+" esta se Alimentando de minhocas ");
		 }
		 
		 @Override
		 public void emitirsom() {
			 System.out.println("A ave de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
					 "com a pena cor de: "+CorPena+" esta emitindo um som de canto ");
		 }
		 
		 public void Fazerninho() {
			 System.out.println("A ave de "+getmembros()+" que pesa: "+getPeso()+" com idade de :"+getidade()+
					 "com a a pena cor de : "+CorPena+" esta fazendo o seu ninho    ");
		 }
}
