package java_pilha;

public class FluxoComTratamento {
	public static void main(String[] args) {
        System.out.println("Ini do main");
       try {
		metodo1();
	} catch  (ArithmeticException | NullPointerException ex) {
		// mostra o error
//		String msg = ex.getMessage();
//		System.out.println("ArithmeticException msg = " + msg);
	   
		/// caminho do error ! 
		//ex.printStackTrace();
	
		
		ex.printStackTrace();

	}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        //try {
            metodo2();
		//} catch (ArithmeticException e) {
		//	System.out.println("ArithmeticException");
		//}

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
          // try {
            
           //Erro do tipo ArithmeticException  
           // int a = i / 0;
            
            Conta c = null;
            c.deposita(i);
            
		//} catch (ArithmeticException e) {
		//	System.out.println("ArithmeticException");
		//}

				
			
        }
        System.out.println("Fim do metodo2");
    }
}

