package app;

import java.util.Date;

public class Gerente extends Funcionario {
	private long senha;
	private int comisao;

	

	public Gerente(String nome, Date nasc, String sexo, int cpf, String setor, double salario, String nomeGerente,
			long senha, int comisao) {
		super(nome, nasc, sexo, cpf, setor, salario, nomeGerente);
		this.senha = senha;
		this.comisao = comisao;
	}

	public long getSenha() {
		return senha;
	}

	public int getComisao() {
		return comisao;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso Permitido");
			return true;
		} else {
			System.out.println("Acesso Negado");

			return false;
		}
	}

}
