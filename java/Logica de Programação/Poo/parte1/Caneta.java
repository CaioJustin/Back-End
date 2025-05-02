package a;


public class Caneta {

	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	
	//Este e o metodo construtor
	public Caneta(String m ,String c ,float p,int ca){
		
		this.cor="Azul";
		this.setModelo(m);
		this.setCor(c);
		this.ponta=p;
		this.carga=ca;
		this.tampar();
	}
	
	
	//getter e setter
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String m){
		this.modelo=m;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		this.cor=c;
	}
	
	public float getPonta() {
		return ponta;
	}
	
	public void setPonta(float p) {
		this.ponta=p;
	}
	
	public int getCarga() {
		return carga;
	}
	
	
	public void setCarga(int ca) {
		this.carga=ca;
	}
	
	
	 public void status() {
		System.out.println("SOBRE A CANETA ");
		System.out.println("Modelo : "+this.getModelo());
		System.out.println("Cor : "+this.getCor());
		System.out.println("Ponta : "+this.getPonta());
		System.out.println("Carga : "+this.getCarga());
		System.out.println("Esta tampada: "+this.tampada);
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
	
	public void rabiscar() {
		if(this.tampada ==true) {
			System.out.println("Caneta tampada ");
		}else {
			System.out.println("a caneta Rabiscou");
		}
		
		
	}
	
	public void pintar() {
		if(this.tampada == true) {
			System.out.println("Caneta tamapda");
		}else {
			System.out.println("voce pintou ");
		}
	}
	
	
	public void tampar() {
		this.tampada=true;
	}
	
	
	public void destampar() {
		this.tampada=false;
	}
	
	
	
}

