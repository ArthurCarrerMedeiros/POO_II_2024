package exercicios_perguntas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import javax.swing.JOptionPane;

public class ExercicioPerguntas {
	public static void main(String[] args) {
		try {
			String menu = "1 - Rodada de perguntas\n" + "2 - Score total\n" + "3 - Sair";
			int op = Integer.parseInt(JOptionPane.showInputDialog(menu));
			int acertos = 0;
			if (op == 1) {
				for (int i = 0; i < 10; i++) {
					FileReader fr = new FileReader("perguntas_respostas.txt");
					BufferedReader br = new BufferedReader(fr);
					Random random = new Random();
					Path path = Paths.get("perguntas_respostas.txt");
					int linhas = Files.readAllLines(path).size();
					int linhaSorteada = random.nextInt(linhas);
					for (int j = 0; j < linhaSorteada; i++) {
						br.readLine();
					}
					String[] perguntaResposta = br.readLine().split(",");
					String pergunta = perguntaResposta[0];
					String resposta = perguntaResposta[1];
					String opcao = JOptionPane.showInputDialog(pergunta + "\n" + "Resposta com Verdadeiro ou Falso!");
					if (resposta == opcao) {

					}
				}
			} else if (op == 2) {
				JOptionPane.showMessageDialog(null, acertos);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
