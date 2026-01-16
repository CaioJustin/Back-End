package atvEnd;

public class Visualização {

	private Gafanhoto espectado;
	private Video filme;
	
	public Visualização(Gafanhoto espec,Video movie) {
		this.espectado=espec;
		this.filme=movie;
	}
	
	public void setEspec(Gafanhoto espec){
		this.espectado=espec;
	}
	
	public void setfilme(Video mov){
		this.filme=mov;
	}
	
	public Gafanhoto getEspec() {
		return this.espectado;
	}
	
	public Video getfilme() {
		return this.filme;
	}
	
	
	public void avaliar() {
		this.filme.setAvalia(5);
	}
	
	public void avaliar(int nota) {
		this.filme.setAvalia(nota);
	}
	
	public void avaliar(float porc) {
		int tot=5;
		if(porc<=20) {
			tot=3;
		}else if(porc<=50) {
			tot=5;
		}else {
			tot=10;
		}
		this.filme.setAvalia(tot);
		
	}
}
