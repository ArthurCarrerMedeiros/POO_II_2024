package banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;

import banco_de_dados.model.Cidade;

public class CidadeService {
	public static int insereCidade(Cidade c) {
		try {
			Connection conn = Conexao.conectaMySql();
			String sql = "insert into cidade (nome, uf) " + "values(?, ?)";
			PreparedStatement pr = conn.prepareStatement(sql);
			pr.setString(1, c.getNome());
			pr.setString(2, c.getUf());
			int total = pr.executeUpdate();
			conn.close();
			return total;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
}
