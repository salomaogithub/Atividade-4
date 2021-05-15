package app;

import java.util.Date;

public class Vendedor extends Funcionario{
	private long senha;
	private int comisao;
	public Vendedor(String nome, Date nasc, String sexo, int cpf, String setor, double salario, String nomeGerente,
			long senha, int comisao) {
		super(nome, nasc, sexo, cpf, setor, salario, nomeGerente);
		this.senha = senha;
		this.comisao = comisao;
	}
	protected long getSenha() {
		return senha;
	}
	protected void setSenha(long senha) {
		this.senha = senha;
	}
	public int getComisao() {
		return comisao;
	}
	
	

}
