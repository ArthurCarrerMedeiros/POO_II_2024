package exercicio_banco;

import java.util.List;

public class Banco {
	List<ContaBancaria> listaContas;
	
	public Banco() {
	}

	public Banco(List<ContaBancaria> listaContas) {
		this.listaContas = listaContas;
	}

	public List<ContaBancaria> getListaContas() {
		return listaContas;
	}

	public void setListaContas(List<ContaBancaria> listaContas) {
		this.listaContas = listaContas;
	}
}
