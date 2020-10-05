package br.com.nubank.modelos;

public abstract interface Autenticavel{
	
	public boolean autentica(int senha);
	
	public void setSenha(int senha);
	

}
