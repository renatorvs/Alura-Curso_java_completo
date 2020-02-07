package herdado;

public class AutenticavelUtil {
	private int senha;
	
	public void setSenha(int senha) {
		// TODO Auto-generated method stub
		
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}

}
