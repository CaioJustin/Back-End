package figter;
import java.util.Random;

public class luta{

	//atriburos
	private lutadores desafiante;
	private lutadores desafiado;
	private int rounds;
	private boolean aprovado;
	
	//Metodos
	

	
	
	public void marcarLuta(lutadores fight1,lutadores fight2) {
		//Verificando se e a mesma pessoa
		if(fight1 != fight2) {
			
				//Verificando se tem a mesma categoria 
			if(fight1.getcategoria().equals(fight2.getcategoria())) {
				this.aprovado=true;
				this.rounds=2;
				this.setDesafiante(fight1);
				this.SetDesafiado(fight2);
			}else {
				System.out.println("Os Competidores não possuem a mesma categoria ");
			}
			
			
		}else if( fight1.equals(fight2) ||fight2.equals(fight1)){
			System.out.println("Os Competidores não podem ser a mesma pessoa escolha outro competidor");
		}
		
		
		
	}
	
	
	public void lutar() {
		
		if(aprovado ==true) {
			System.out.println("Desafiante ");
			desafiante.apresentar();
			System.out.println("Desafiado ");
			desafiado.apresentar();
			
			
			Random random =new Random();
			int alea=random.nextInt(3);
			
			if(alea ==0) {
				this.desafiante.ganhaLuta();
				this.desafiado.perderLuta();
				System.out.println("O Vencedor foi "+desafiante.getName());
			}else if(alea==2) {
				this.desafiado.ganhaLuta();
				this.desafiante.perderLuta();
				System.out.println("O Vencedor foi "+this.desafiado.getName());		
			}else {
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				System.out.println("Ocorreu um Empate ");		
			}
			
			
		}else {
			System.out.println("A luta não foi aprovado ");
		}
		
		System.out.println("Status pos Luta");
		desafiante.status();
		desafiado.status();
		
	}
	
	
	//Metodos Especias
	
	//Get
	public lutadores getDesafiante() {
		return desafiante;
	}
	
	public lutadores getDesafiado() {
		return desafiado;
	}
	
	public int getRounds() {
		return rounds;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}
	
	//Set
	
	public void setDesafiante(lutadores DD) {
		this.desafiante=DD;
	}
	
	public void SetDesafiado(lutadores D) {
		this.desafiado=D;
	}
	
	public void setRounds(int r) {
		this.rounds=r;
	}
	
	public void setAprovado(boolean apr) {
		this.aprovado=apr;
	}
}
