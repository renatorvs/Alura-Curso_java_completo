package java_pilha;

public class MinhaException extends  Exception {

	/// DOIS TIPOS DE EXCEPTION CRIADA PRIMEIRA HERDA DE RUNTIMEEXCETION E A SEGUNDO DE EXCEPTION, SE HERDAR DE EXCEPTION PARA LANÇAR 
	//EXCEPTIONS (throws) É NECESSARIO COLOLAR NA ASSINATURA DO METODO /
	public MinhaException(String msg) {
		super(msg);
	}
}
