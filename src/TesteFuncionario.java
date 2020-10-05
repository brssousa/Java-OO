

public class TesteFuncionario {

	public static void main(String[] args) {
		

		Administrador bruno = new Administrador();
		
		bruno.setNome("Bruno Lucio");
		bruno.setCpf("016505556-10");
		bruno.setSalario(3500.00);
		bruno.setSenha(5555);
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.getBonificacao());
		System.out.println();
		
		
		Gerente alessandro = new Gerente();
		alessandro.setNome("Alessandro Coelho");
		alessandro.setCpf("122222227-10");
		alessandro.setSalario(5000.00);
		alessandro.setSenha(19191);
		
		Cliente fabio = new Cliente();
		fabio.setSenha(222);
		
		System.out.println(alessandro.getNome());
		System.out.println(alessandro.autentica(19191));
		System.out.println(alessandro.getBonificacao());
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.Registra(bruno);
		controle.Registra(alessandro);
		System.out.println(controle.getSomaTotal());
		System.out.println(Funcionario.getQuantidadeFuncionarios());
		
		SistemaInterno autentica = new SistemaInterno();
		autentica.autenticaSistema(alessandro);
		autentica.autenticaSistema(bruno);
		autentica.autenticaSistema(fabio);
	

	}

}
