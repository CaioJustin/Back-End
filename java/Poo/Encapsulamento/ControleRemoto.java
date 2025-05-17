package encapsulamento;
//Conectando a classe Controle a interface 
public class ControleRemoto implements Controlador  {

	//Atributos 
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Construtor 
	public ControleRemoto() {
		this.setVolume(50);
		this.setLigado(false); 
		this.setTocando(false);
	}
	
	private int getVolume(){
		return this.volume;
	}
	
	private void setVolume(int v){
		this.volume=v;
	}
	
	private boolean getLigado() {
		return this.ligado;
	}
	
	private void setLigado(boolean l) {
		this.ligado=l;
	}
	
	private boolean getTocando() {
		return this.tocando;
	}
	
	private void setTocando(boolean t) {
	 	this.tocando=t;
	}
	
	
	public void ligar() {
		this.setLigado(true);
	}
	
	public void desligar() {
		this.setLigado(false);
	}
	
	public void abrirmenu() {
		System.out.println("======= MENU ABERTO =======");
		System.out.println("O Volume e : "+this.getVolume());
		System.out.println("Esta ligado ou desligado : "+this.getLigado());
		System.out.println("Esta tocando ou pausado : "+this.getTocando());
	}
	
	public void fecharmenu() {
		System.out.println("======= Menu Fechado =======");
	}
	
	
	public void aumentarvolume() {
		this.setVolume(this.getVolume()+5);
	}
	
	public void deminuirvolume() {
		this.setVolume(this.getVolume()-5);
	}
	
	public void ligarmudo() {
		
		if(this.getLigado()== true && this.getVolume()>0){
			this.setVolume(0);
		}else {
			System.out.println("A Tv esta desligado ou ja esta mutada ");
		}
	}
	
	public void desligarmudo() {
		this.setVolume(50);
	}
	
	public void play() {
		this.setTocando(true);
	}
	
	public void pause() {
		this.setTocando(false);
	}
	
}
