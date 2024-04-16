package banco_de_dados.testes;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import banco_de_dados.Conexao;

public class BancoDadosTest {
	@Test
	void conexaoTest() {
		assertNotNull(Conexao.conectaMySql());
	}
}
