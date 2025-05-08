package app;


public class content {

	public static void main(String[]args) {
		
		
		
		Conta C1= new Conta(0,"Jubilue");
		Conta C2= new Conta(1,"creusca");
		
		
		C1.MostraStatus();
		C1.abrirConta();
		C1.MostraStatus();
		C1.depositar();
		C1.MostraStatus();
		C1.sacar();
		C1.PagarMensal();
		C1.MostraStatus();
		C1.fecharConta();
		C1.MostraStatus();
		
	}
	
}
