package herdado;

public class Administrador extends Funcionario implements Autenticavel{

	
	private AutenticavelUtil autenticador ;
	private int senha;
	
	public Administrador() {
		this.autenticador = new AutenticavelUtil();
	}
 
	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

	
	

}
