package banco_de_dados.testes;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import banco_de_dados.CidadeService;
import banco_de_dados.Conexao;
import banco_de_dados.model.Cidade;

public class BancoDadosTest {
	@Test
	void conexaoTest() {
		assertNotNull(Conexao.conectaMySql());
	}

	@Test
	void insereCidadeTest() {
		Cidade c = new Cidade(0, "Araranguá", "SC");
		assertEquals(1, CidadeService.insereCidade(c));
	}
}
