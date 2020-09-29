
public class TesteFuncionario {

	public static void main(String[] args) {
		

		Funcionario bruno = new Funcionario();
		
		bruno.setNome("Bruno Lucio");
		bruno.setCpf("016505556-10");
		bruno.setSalario(3500.00);
		
		System.out.println(bruno.getNome());
		System.out.println(bruno.getBonificacao());
		System.out.println();
		
		
		Gerente alessandro = new Gerente();
		alessandro.setNome("Alessandro Coelho");
		alessandro.setCpf("122222227-10");
		alessandro.setSalario(5000.00);
		alessandro.setSenha(19191);
		
		System.out.println(alessandro.getNome());
		System.out.println(alessandro.autentica(19191));
		System.out.println(alessandro.getCargo());
		System.out.println(alessandro.getBonificacao());
	

	}

}
