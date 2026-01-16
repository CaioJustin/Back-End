package atvEnd;

public class youtube {
 public static void main(String[]args) {
	 
	 Video v[]=new Video[3];
	 v[0]=new Video("Aula 1 Java");
	 v[1]=new Video("Aula 2 PHP");
	 v[2]=new Video("Aula 3 html");
	 
	 Gafanhoto g[]=new Gafanhoto[2];
	 g[0]=new Gafanhoto("caio", 22, "m", "CaioJustice", 0);
	 g[1]=new Gafanhoto("thiago", 22, "m", "thJustice", 0);
	 
	 Visualização vis[]=new Visualização[5];
	 vis[0] =new Visualização(g[0],v[2]);
	 vis[0].avaliar();
	 
			
 }
}

