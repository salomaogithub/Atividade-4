package app;

import java.util.Date;

public class Funcionario extends Pessoa {
	private String setor;
	protected double salario;
	private String nomeGerente;

	public Funcionario(String nome, Date nasc, String sexo, int cpf, String setor, double salario, String nomeGerente) {
		super(nome, nasc, sexo, cpf);
		this.setor = setor;
		this.salario = salario;
		this.nomeGerente = nomeGerente;
	}

	public String getSetor() {
		return setor;
	}

	public double getSalario() {
		return salario;
	}

	public String getNomeGerente() {
		return nomeGerente;
	}

}
