package exercicio_banco;

public class ContaEspecial extends ContaBancaria {
	private double limiteNegativo;
	
	public ContaEspecial() {
	}
	
	public ContaEspecial(int numeroConta, double saldo, double limiteNegativo) {
        super(numeroConta, saldo);
        this.limiteNegativo = limiteNegativo;
	}

	@Override
	public void saque(double valor) {
		if(valor <= saldo + limiteNegativo) {
			saldo -= valor;
		}
	}

	public double getLimiteNegativo() {
		return limiteNegativo;
	}

	public void setLimiteSaldoConta(double limiteNegativo) {
		this.limiteNegativo = limiteNegativo;
	}

	@Override
	public String toString() {	
		return "ContaEspecial [limiteNegativo=" + limiteNegativo + "]";
	}
}
