package exercicio_banco;

public class ContaPoupanca extends ContaBancaria {
	private int limiteOperacoes = 5;
	
	public ContaPoupanca() {
	}
	
	public ContaPoupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
	}
	
	@Override
	public void depositar(double valor) {
		if(limiteOperacoes > 0) {
			saldo += valor;
			limiteOperacoes--;
		}
	}
	
	@Override
	public void saque(double valor) {
		if(limiteOperacoes > 0) {
			saldo -= valor;
			limiteOperacoes--;
		}
	}
}
