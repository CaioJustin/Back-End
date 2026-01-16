package herança_2_Escolar;

public class bolsista extends aluno {

	private int bolsa;
	
	public bolsista() {
		this.bolsa=bolsa;
		
		
	}
	
		//Metodo final
		public final void renovarbolsa() {
			System.out.println("Bolsa renovado");
		}
	
		@Override	
		public void pagarMensalidade() {
			System.out.println("Mensalidade pagar! e bolsista pagamento facilitado");
		}
}

