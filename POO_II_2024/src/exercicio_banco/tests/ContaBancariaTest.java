package exercicio_banco.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaCorrente;
import exercicio_banco.ContaEspecial;
import exercicio_banco.ContaPoupanca;

class ContaBancariaTest {
	private ContaBancaria contaBancaria;
	private ContaCorrente contaCorrente;
	private ContaEspecial contaEspecial;
	private ContaPoupanca contaPoupanca;
	
	@BeforeEach
	void inicializaTest() {
		contaBancaria = new ContaCorrente(1, 5000);
		contaCorrente = new ContaCorrente(1, 10000);
		contaEspecial = new ContaEspecial(2, 20000, 5000);
		contaPoupanca = new ContaPoupanca(3, 30000);
	}
	
	@Test
	void contaBancariaTest() {
		ContaBancaria contaTeste = new ContaBancaria();
		double valorSaldo = contaBancaria.getSaldo();
		contaBancaria.saque(5000);
		contaBancaria.depositar(5000);
		contaBancaria.transferir(contaTeste, 2500);
		assertEquals(contaBancaria.getSaldo(), valorSaldo - 2500);
		assertEquals(contaTeste.getSaldo(), 2500);
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
		double limite = contaEspecial.getLimiteNegativo();
		double valorSaldo = contaEspecial.getSaldo();
		contaEspecial.saque(25001);
		assertEquals(contaEspecial.getSaldo(), valorSaldo);
		
		contaEspecial.saque(24999);
		assertEquals(contaEspecial.getSaldo() + limite, 1);
	}
	
	@Test
	void contaPoupancaTest() {
		double valorSaldo = contaPoupanca.getSaldo();
		for (int i = 0; i < 2; i++) {
			contaPoupanca.saque(100);
			contaPoupanca.depositar(100);
			if(i + 1 == 2) {
				contaPoupanca.saque(100);
				contaPoupanca.depositar(100);
				assertEquals(contaPoupanca.getSaldo(), valorSaldo - 100);
				assertEquals(contaPoupanca.getLimiteOperacoes(), 0);
			}
		}
	}
}
