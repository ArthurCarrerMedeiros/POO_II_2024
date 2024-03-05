package exercicio_banco.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaCorrente;
import exercicio_banco.ContaEspecial;
import exercicio_banco.ContaPoupanca;

class ContaBancariaTest {
	private ContaBancaria contaCorrente;
	private ContaBancaria contaEspecial;
	private ContaBancaria contaPoupanca;
	
	@BeforeEach
	void inicializaTest() {
		contaCorrente = new ContaCorrente(1, 10000);
		contaEspecial = new ContaEspecial(2, 20000, 5000);
		contaPoupanca = new ContaPoupanca();
	}
	
	@Test
	void contaCorrenteTest() {
		double valorSaldo = contaCorrente.getSaldo();
		contaCorrente.saque(10001);
		assertEquals(contaCorrente.getSaldo(), valorSaldo);
		
		contaCorrente.saque(9999);
		assertEquals(contaCorrente.getSaldo(), 1);
	}
	
	@Test
	void contaEspecialTest() {
		double valorSaldo = contaEspecial.getSaldo();
		contaCorrente.saque(25001);
		
	}
}
