package java_pilha;

public class Fluxo {
	public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
		metodo1();
		//lancei uma excessao no metodo dois e catei ela aqui em cima 
		//throw = lançar
		} catch  (ArithmeticException | NullPointerException | MinhaException ex) {
		String msg = ex.getMessage();
			System.out.println("Minhaexception = " + msg);
			ex.printStackTrace();
		}
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException {
        System.out.println("Ini do metodo1");
        //try {
            metodo2();
		//} catch (ArithmeticException e) {
		//	System.out.println("ArithmeticException");
		//}

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException {
        System.out.println("Ini do metodo2");
      /// DOIS TIPOS DE EXCEPTION CRIADA PRIMEIRA HERDA DE RUNTIMEEXCETION E A SEGUNDO DE EXCEPTION, SE HERDAR DE EXCEPTION PARA LANÇAR 
    	//EXCEPTIONS (throws) É NECESSARIO COLOLAR NA ASSINATURA DO METODO /
        
        
        throw  new MinhaException("deu erro");
        
       // System.out.println("Fim do metodo2");
    }
}

