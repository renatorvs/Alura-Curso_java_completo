package herdado;

public class Testesisitemainterno {
	public static void main(String[] args) {
		Gerente g = new  Gerente();
		g.setSenha(2222);
		
		
		Administrador  adm =  new  Administrador();
		adm.setSenha(33333);
		
		
		Sistemainterno si = new Sistemainterno();
		si.autentica(g);
		si.autentica(adm);
	}
}
