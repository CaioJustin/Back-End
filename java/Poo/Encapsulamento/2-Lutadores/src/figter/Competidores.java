package figter;

public class Competidores {
	
	public static void main(String[]args) {
		
	
	lutadores[] Lutador =new lutadores[6];
	
	
		
		Lutador[0] =new lutadores("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
		
		Lutador[1] =new lutadores("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
		
		Lutador[2] =new lutadores("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
			
		Lutador[3] =new lutadores("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
		
		Lutador[4] =new lutadores("Ufocobol","Brasil",37,1.70f,119.3f,5,4,3);
		
		Lutador[5] =new lutadores("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
		
		
		luta l1 =new luta();
		

		l1.marcarLuta(Lutador[0],Lutador[1]);
		l1.lutar();
		
		
	}

}
