
public class Administrador extends Funcionario implements Autenticavel{

	private VerificaSenha autenticador;
	
	 public Administrador() {
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
		return 150;
	}
}
