package br.com.nubank.cadastros;
import br.com.nubank.modelos.Autenticavel;
import br.com.nubank.modelos.VerificaSenha;

public class Gerente extends Funcionario implements Autenticavel{
	
	private VerificaSenha autenticador;
	
	 public Gerente() {
		this.autenticador = new VerificaSenha();
	}

	@Override
	public boolean autentica(int senha) {
		return autenticador.autentica(senha);
	}
	
	@Override
	public void setSenha(int senha) {
		autenticador.setSenha(senha);
	}
		
	
	@Override
	public double getBonificacao() {
		return 200;
	}

}
