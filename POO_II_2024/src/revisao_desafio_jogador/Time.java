package revisao_desafio_jogador;

import java.util.List;

public class Time {
	private String nome;
	private List<Jogador> jogadores;
	
	public Time() {
		setNome("");
	}
	
	public Time(String nome, List<Jogador> jogadores) {
		super();
		this.nome = nome;
		this.jogadores = jogadores;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<Jogador> getJogadores() {
		return jogadores;
	}
	
	public void setJogadores(List<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	@Override
	public String toString() {
		return getNome() + " (" + getJogadores().size() + ")";
	}
	
	public String getListaJogadores() {
		String listaJogadores = "";
		for (Jogador jogador : jogadores) {
			listaJogadores += jogador + "\n";
		}
		return listaJogadores;
	}
	
	public Jogador getArtilheiro() {
		Jogador artilheiro = new Jogador();
		for (Jogador jogador : jogadores) {
			if (jogador.getGols() > artilheiro.getGols()) {
				artilheiro = jogador;
			}
		}
		return artilheiro;
	}
	
	public int getTotalGols() {
		int totalGols = 0;
		for (Jogador jogador : jogadores) {
			totalGols += jogador.getGols();
		}
		return totalGols;
	}
}
