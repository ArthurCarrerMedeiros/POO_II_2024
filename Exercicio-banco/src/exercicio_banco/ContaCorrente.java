package exercicio_banco;

public class ContaCorrente extends ContaBancaria {
	public ContaCorrente() {
	}
	
	public ContaCorrente(int numeroConta, double saldo) {
        super(numeroConta, saldo);
	}
	
	@Override
	public void saque(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		}
	}
}
