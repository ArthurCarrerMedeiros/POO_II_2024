package revisao_desafio_jogador.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import revisao_desafio_jogador.Campeonato;
import revisao_desafio_jogador.Jogador;
import revisao_desafio_jogador.Time;

class CampeonatoTest {
	List<Time> times;
	
	@BeforeEach
	public void inicializaJogadores() {
		List<Jogador> jogadores1 = new ArrayList<>();
		jogadores1.add(new Jogador("N1", 1, 1));
		jogadores1.add(new Jogador("N2", 2, 2));
		jogadores1.add(new Jogador("N3", 3, 3));
		jogadores1.add(new Jogador("N4", 4, 4));
		jogadores1.add(new Jogador("N5", 5, 5));
		Time t1 = new Time("Time 1", jogadores1);
		List<Jogador> jogadores2 = new ArrayList<>();
		jogadores2.add(new Jogador("N6", 6, 6));
		jogadores2.add(new Jogador("N7", 7, 7));
		jogadores2.add(new Jogador("N8", 8, 8));
		jogadores2.add(new Jogador("N9", 9, 9));
		jogadores2.add(new Jogador("N10", 10, 10));
		Time t2 = new Time("Time 2", jogadores2);
		List<Jogador> jogadores3 = new ArrayList<>();
		jogadores3.add(new Jogador("N11", 11, 11));
		jogadores3.add(new Jogador("N12", 12, 12));
		jogadores3.add(new Jogador("N13", 13, 13));
		jogadores3.add(new Jogador("N14", 14, 14));
		jogadores3.add(new Jogador("N15", 15, 15));
		Time t3 = new Time("Time 3", jogadores3);
		times = new ArrayList<Time>();
		times.add(t1);
		times.add(t2);
		times.add(t3);
	}
	
	@Test
	void artilheiroCampeonato() {
		Time timeMaisGols = Campeonato.timeComMaisGols(times);
		assertEquals("Time 3 (5)", timeMaisGols.toString());
	}
	
	@Test
	void artilheiroCampeonatoGolsTest() {
		Jogador artilheiro = Campeonato.artilheiroCampeonato(times);
		assertEquals("Jogador [nome=N15, camisa=15, gols=15]", artilheiro.toString());
	}
}
