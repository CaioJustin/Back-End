package figter;

public class lutadores {

	//Atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitoria;
	private int derrotas;
	private int empate;
	
	//Metodos especias
	public lutadores(String no,String na,int age,float alt,float pes,int vic,int derr,int em){
	this.nome=no;
	this.nacionalidade=na;
	this.idade=age;
	this.altura=alt;
	this.peso=pes;
	VerificandoPesoECategoria();
	this.vitoria=vic;
	this.derrotas=derr;
	this.empate=em;
		
	}
	

	public String getName() {
	 return this.nome;
	}
	
	
	public void setnome(String n) {
		this.nome=n;
	}
	
	public String getnacionalidade() {
		return this.nacionalidade;
	}
	
	public void setnacionalidade(String nac) {
		this.nacionalidade=nac;
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setidade(int age) {
		this.idade=age;
	}
	
	public float getaltura() {
		return this.altura;
	}
	
	public void setAltura(float alt){
		this.altura=alt;
	}
	
	public  float getpeso() {
		return this.peso;
	}
	
	public void setpeso(float p) {
		this.peso=p;
		VerificandoPesoECategoria();
	}
	
	public String getcategoria() {
		return this.categoria;
	}
	
	private void setcategoria(String cate) {
		this.categoria=cate;
	}
	
	public int getvitoria() {
		return this.vitoria;
	}
	
	public void setvitoria(int vic) {
		this.vitoria=vic;
	}
	
	public int getderrota() {
		return this.derrotas;
	}
	
	private void setderrota(int defeat) {
		this.derrotas=defeat;
	}
	
	public int getempate() {
		return this.empate;
	}
	
	public void setempate(int empa) {
		this.empate=empa;
	}
	
	
	//Metodos publicos
	public void apresentar() {
		
		System.out.println("\n"+"Damas e cavalheiros, preparem-se para a luta da noite! Entrando no ringue,"+"\n"
				+ " com "+getIdade()+" anos, pesando" +getpeso()+ "quilos ,"+getaltura()+ " Altura e um cartel de "+getvitoria()+" vitórias e "
				+ "apenas "+getderrota()+" derrota "+getempate()+"Empate, vindo de "+"\n"+getnacionalidade()+" o lutador..."+getName());
	}
	
	public void status(){
		System.out.println("Nome :"+getName()+"\n"
				+ "Nacionalidade: "+getnacionalidade()+"\n"
				+ "idade : "+getIdade()+"\n"
				+ "altura: "+getaltura()+"\n"
				+ "peso: "+getpeso()+"\n"
				+ "categoria: "+getcategoria()+"\n"
				+ "vitoria: "+getvitoria()+"\n"
				+ "derrota: "+getderrota()+"\n"
				+ "empate:"+getempate()+"\n");
	}
	
	
	public void ganhaLuta() {
		int vitoria =this.getvitoria() ;
		int addVictoru=vitoria+1;
		this.setvitoria(addVictoru);
		
	}
	
	public void perderLuta() {
		int loser = this.getderrota();
		int addlose=loser+1;
		this.setderrota(addlose);
	}
	
	public void empatarLuta() {
		//int emp= this.getempate();
		//int addemp=emp+1;
		//this.setempate(addemp);
		this.setempate(this.getempate()+1);
	}
	
	
	private void VerificandoPesoECategoria() {
		
		if(this.getpeso()<=40.0) {
			this.setcategoria("Invalidao");
		}else if(this.getpeso()<=50.0){
			this.setcategoria("Peso Leve");
		}else if(this.getpeso()<=80.0) {
			this.setcategoria("Peso medio");
		}else if(this.getpeso()<=100.0) {
			this.setcategoria("Peso Pesado");
		}else {
			this.setcategoria("Categoria ainda não foi definida");
		}
		
	}
	
}
