package br.com.nubank.testes;
import br.com.nubank.cadastros.Cliente;
import br.com.nubank.cadastros.Gerente;
import br.com.nubank.modelos.Administrador;
import br.com.nubank.modelos.SistemaInterno;

public class TesteSistema {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		g.setSenha(222);
		g.setNome("Bruno");
		
		SistemaInterno si = new SistemaInterno();
		
		si.autenticaSistema(g);
		
		Administrador adm = new Administrador();
		adm.setSenha(444);
		adm.setNome("Paulo");
		
		si.autenticaSistema(adm);
		
		Cliente cliente = new Cliente();
		cliente.setSenha(112);
		
		si.autenticaSistema(cliente);

	}

}
