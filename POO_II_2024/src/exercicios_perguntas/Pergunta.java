package exercicios_perguntas;

public class Pergunta {
	private String titulo;
	private String resposta;

	public Pergunta() {
	}

	public Pergunta(String titulo, String resposta) {
		this.titulo = titulo;
		this.resposta = resposta;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
