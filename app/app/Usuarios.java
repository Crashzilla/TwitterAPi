package app;

import java.util.Date;

public class Usuarios {
	
	private String nome;
	private String mensagem;
	private Date data;
	
	public Usuarios(String nome, String mensagem, Date data) {
		super();
		this.nome = nome;
		this.mensagem = mensagem;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
