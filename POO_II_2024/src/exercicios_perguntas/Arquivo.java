package exercicios_perguntas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Random;

public class Arquivo {
	private List<Pergunta> pergunta;
	private String path;
	int linhas;

	public Arquivo() {
	}

	public Arquivo(List<Pergunta> pergunta, String path, int linhas) {
		this.pergunta = pergunta;
		this.path = path;
		this.linhas = linhas;
	}

	public BufferedReader carregarArquivo() throws Exception {
		FileReader fr = new FileReader(path);
		return new BufferedReader(fr);
	}

	public void solicitarPergunta() throws Exception {
		if (linhas < 1) {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while (br.readLine() != null) {
				linhas++;
			}
		}
		Random random = new Random();
	}

	public void conferirResposta() {

	}

	public List<Pergunta> getPergunta() {
		return pergunta;
	}

	public void setPergunta(List<Pergunta> pergunta) {
		this.pergunta = pergunta;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
}
