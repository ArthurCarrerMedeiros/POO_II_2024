package exercicio_banco;

public class ContaBancaria {
	protected int numeroConta;
	protected double saldo;
	
	public ContaBancaria() {
	}

	public ContaBancaria(int numeroConta, double saldo) {
		this.numeroConta = numeroConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= valor;
	}
	
	public void transferir(ContaBancaria contaDestino, double valor) {
		double total = contaDestino.getSaldo() + valor;
		setSaldo(this.getSaldo() - valor);
		contaDestino.setSaldo(total);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
    public String toString() {
    	return getNumeroConta()+" - "+getSaldo();
    }
}
