package br.com.nubank.modelos;
import br.com.nubank.cadastros.Funcionario;

public class ControleBonificacao {
	
	private double somaTotal;
	
	public void Registra(Funcionario x) {
		double valor = x.getBonificacao();
		this.somaTotal += valor;
	}
	
	public double getSomaTotal() {
		return somaTotal;
	}

}
