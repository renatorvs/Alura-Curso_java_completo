
public abstract class Conta {

	double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;
	private Cliente titular;

	public Conta() {

	}

	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("O total de contas é " + Conta.total);
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 100;
		System.out.println("Estou criando uma conta  " + this.numero);

	}

	public abstract void deposita(double valor);

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		}
		return false;

	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;

	}

	public static int getTotal() {
		return Conta.total;
	}

	public double pegasaldo() {
		return this.saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("nao pode valor menor igual a 0");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {

		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("nao pode valor <= 0");
			return;
		}

		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public boolean saca(double valor) {
		// TODO Auto-generated method stub
		return false;
	}

}
