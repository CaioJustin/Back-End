package atvEnd;

public class Video implements acoesVideo{
	
	private String title;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	public Video(String titulo){
		this.title=titulo;
		
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getAvalia() {
		return this.avaliacao;
	}
	
	public int getViews() {
		return this.views;
	}
	
	public int getCurtidas() {
		return this.curtidas;
	}
	
	public boolean getRepro() {
		return this.reproduzindo;
	}
	
	public void setTitle(String t) {
		this.title=t;
	}

	public void setAvalia(int a) {
		this.avaliacao=a;
	}
	
	public void setView(int v) {
		this.views=v;
	}
	
	public void setCur(int C) {
		this.curtidas=C;
	}
	
	public void setRepro(boolean r) {
		this.reproduzindo=r;
	}
	
	@Override
	public void like() {
		setCur(getCurtidas()+1);
	}
	
	@Override
	public void pause() {
		setRepro(false);
	}
	
	@Override
	public void play(){
		setRepro(true);
	}
}
