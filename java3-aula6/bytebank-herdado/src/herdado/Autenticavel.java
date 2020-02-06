package herdado;

	//contrato autenticavel 
		
	///quem assina essa contrato precissa implementr os metodos abaixo 
public abstract interface  Autenticavel{
	
	public abstract  void setSenha(int senha) ;

	public abstract boolean autentica(int senha);
}
