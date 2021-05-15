package app;

import java.util.Date;

public class Pessoa {
	private String nome;
	private String sexo;
	private int cpf;

	public Pessoa(String nome, Date nasc, String sexo, int cpf) {
		
		this.nome = nome;
		this.sexo = sexo;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	public int getCpf() {
		return cpf;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + "]";
	}

}
