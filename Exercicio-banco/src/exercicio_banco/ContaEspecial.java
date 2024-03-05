package exercicio_banco;

public class ContaEspecial extends ContaBancaria {
	private double limiteSaldoConta;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(int numeroConta, double saldo, int limiteSaldoConta) {
        super(numeroConta, saldo);
        this.limiteSaldoConta = limiteSaldoConta;
	}
	
	public ContaEspecial(double limiteSaldoConta) {
		this.limiteSaldoConta = limiteSaldoConta;
	}

	@Override
	public void saque(double valor) {
		if(saldo + limiteSaldoConta <= valor) {
			saldo -= valor;
		}
	}
}
