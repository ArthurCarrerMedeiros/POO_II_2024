package exercicio_banco.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import exercicio_banco.Banco;
import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaEspecial;
import exercicio_banco.ContaPoupanca;

class BancoTest {
	List<ContaBancaria> contas;
	Banco banco1;
	Banco banco2 = new Banco();
	
	@BeforeEach
	void inicializaTest() {
		contas = new ArrayList<>();
		ContaBancaria c1 = new ContaBancaria(1, 10000);
		ContaPoupanca c2 = new ContaPoupanca(2, 20000);
		ContaEspecial c3 = new ContaEspecial(3, 30000, 5000);
		contas.add(c1);
		contas.add(c2);
		contas.add(c3);
	}
	
	@Test
	void bancoTest() {
		banco1 = new Banco(contas);
		assertEquals(banco1.getListaContas().size(), 3);
		assertEquals(banco2.getListaContas(), null);
	}
}
