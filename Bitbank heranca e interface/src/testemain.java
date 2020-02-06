
public class testemain {
	public static void main(String[] args) {

		Gerente f1 = new Gerente();
		f1.setSalario(3000.0);
		System.out.println(f1.getBonificacao());

		Gerente f2 = new Gerente();
		f2.setSalario(5000.0);
		System.out.println(f2.getBonificacao());

		boolean senha = f1.autentica(11111);

		System.out.println(senha);

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);

		ControlleBonificacao controle = new ControlleBonificacao();
		controle.registra(g1);

	}
}
