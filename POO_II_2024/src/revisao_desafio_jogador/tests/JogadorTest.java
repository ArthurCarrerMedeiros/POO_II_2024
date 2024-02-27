package revisao_desafio_jogador.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao_desafio_jogador.Jogador;

class JogadorTest {

	Jogador j1;
	Jogador j2;
	
	@BeforeEach
	public void inicializaJogadores() {
		j1 = new Jogador();
		j2 = new Jogador("Gustavo", 10, 5);
	}
	
	@Test
	public void construtorVazioTest() {
		assertEquals("", j1.getNome());
		assertEquals(999, j1.getNumeroCamisa());
		assertEquals(-1, j1.getGols());
		assertEquals("Jogador [nome=, numeroCamisa=999, gols=-1]", j1.toString());
	}
	
	@Test
	public void construtorParametrosTest() {
		assertEquals("Gustavo", j2.getNome());
		assertEquals(10, j2.getNumeroCamisa());
		assertEquals(5, j2.getGols());
		assertEquals("Jogador [nome=" + j2.getNome() + ", numeroCamisa=" + j2.getNumeroCamisa() + ", gols=" + j2.getGols() + "]", j2.toString());
	}
}
