package exceptionFinally;

public class testeConexao {
		 public static void main(String[] args) {
			
			try(Conexao conexao = new Conexao() ) {
				conexao.leDados();
			} catch (IllegalStateException e) {
				System.out.println("Deu erro na conex�o" );	
//				
			}
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 /////----------------------------------------
//				Conexao con = null;
//			 try {
//			
		//				 con = new Conexao();
		//				con.leDados();
//			
//				} catch (IllegalStateException e) {
//				System.out.println("Deu erro na conex�o" );	;
//			
//			} finally {
//				System.out.println("finallly" );	;
//
//				if (con != null) {
//					con.close();
//					
//				}
//			}
		}
}