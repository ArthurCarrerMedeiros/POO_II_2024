package revisao_desafio_jogador;

import java.util.List;

public class Campeonato {
	public static Time timeComMaisGols(List<Time> times) {
		Time timeMaisGols = times.get(0);
		for (Time time : times) {
			if(time.getTotalGols() > timeMaisGols.getTotalGols()) {
				timeMaisGols = time;
			}
		}
		return timeMaisGols;
	}
	
	public static Jogador artilheiroCampeonato(List<Time> times) {
		Jogador artilheiro = new Jogador();
		for (Time time : times) {
			if(time.getArtilheiro().getGols() > artilheiro.getGols()) {
				artilheiro = time.getArtilheiro();
			}
		}
		return artilheiro;
	}
}
