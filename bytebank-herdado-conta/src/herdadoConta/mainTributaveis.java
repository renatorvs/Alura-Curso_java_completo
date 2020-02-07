package herdadoConta;

public class mainTributaveis {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(100, 100);
		cc.deposita(100);
		
		SeguraDeVida sv = new SeguraDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sv);
		
		System.out.println(ci.getTotalImposto());
	}
}
