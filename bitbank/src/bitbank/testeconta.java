package bitbank;

public class testeconta {
 public static void main(String[] args) {
	Cliente paulo = new Cliente();
	paulo.setNome("Paulo");
	paulo.setCpf("1234578922");
	paulo.setProfissao("programador");
	
	Conta contaPaulo =new Conta();
	contaPaulo.deposita(100);
	
	//contaPaulo.titular = paulo;
	
	//System.out.println(contaPaulo.titular.getNome());
	//System.out.println(contaPaulo.titular.getCpf());
	//System.out.println(contaPaulo.titular.getProfissao());
}
}
