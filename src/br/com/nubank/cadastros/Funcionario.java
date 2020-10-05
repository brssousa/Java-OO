package br.com.nubank.cadastros;

public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	private static int quantidadeFuncionarios; //atributo da geral para guardas a quantidades de funcionarios
	
	public Funcionario() {
		quantidadeFuncionarios++;
	}
	
	
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public static int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	

}
