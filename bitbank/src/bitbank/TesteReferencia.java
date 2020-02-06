package bitbank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta conta = new Conta();
		///conta.saldo  =100;
			conta.sacar(50);
			//System.out.println(conta.saldo);
			
			
		//	conta.titular = "paulo silveira";
			boolean consegueRetirar = conta.sacar(50);
		///	System.out.println(conta.saldo);
			System.out.println(consegueRetirar);
			
			
			Conta contaMarcela = new Conta();
		//	contaMarcela.titular = "Marcela";
			contaMarcela.deposita(500);
			
			if(contaMarcela.transfere(100, conta)) {
				System.out.println("transferencia feita com sucesso");
			} else  {
				
				System.out.println("transferencia feita com sucesso");
			}
			
			
			
			System.out.println(conta.saldo);
			System.out.println(contaMarcela.saldo);
			System.out.println(conta.saldo);
	}
}
