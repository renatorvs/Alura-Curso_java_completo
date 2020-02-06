package herdado;

public class Cliente  implements Autenticavel{
		private AutenticavelUtil autenticador ;
		
		public  Cliente() {
			this.autenticador = new AutenticavelUtil();
		}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
		
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		 if (autenticou) {
			return true;
		}else {
			return false;
		}
		
	}

	

}
