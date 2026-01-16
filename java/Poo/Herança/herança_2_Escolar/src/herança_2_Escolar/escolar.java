package herança_2_Escolar;

public class escolar {

	public static void main(String[]args) {
		
		visitante v1 = new visitante();
		aluno a1=new aluno();
		v1.setnome("caio");
		a1.setnome("leonx");
		
		System.out.println(v1.getnome());
		System.out.println(a1.getnome());
	}
}
