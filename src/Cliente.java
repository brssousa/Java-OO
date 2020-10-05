
public class Cliente implements Autenticavel{
	
	private VerificaSenha autenticador;
	
	 public Cliente() {
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

}
