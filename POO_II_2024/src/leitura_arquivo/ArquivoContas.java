package leitura_arquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaCorrente;
import exercicio_banco.ContaEspecial;
import exercicio_banco.ContaPoupanca;

public class ArquivoContas {
	public static void main(String[] args) {
		List<ContaBancaria> contas = new ArrayList<>();
		try {
			FileReader fr = new FileReader("contas.txt");
			BufferedReader br = new BufferedReader(fr);
			String linha = "";
			while((linha = br.readLine()) != null) {
				String v[] = linha.split(",");
				if(v[0].equals("0")) {
					int nr = Integer.parseInt(v[1]);
					double saldo = Double.parseDouble(v[2]);
					if(v[0].equals("0")) {
						contas.add(new ContaCorrente(nr, saldo));
					}
					if(v[0].equals("1")) {
						contas.add(new ContaPoupanca(nr, saldo));
					}
					if(v[0].equals("2")) {
						double limite = Double.parseDouble(v[3]);
						contas.add(new ContaEspecial(nr, saldo, limite));
					}
				}
			}
			for (ContaBancaria c : contas) {
				System.out.println(c);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
