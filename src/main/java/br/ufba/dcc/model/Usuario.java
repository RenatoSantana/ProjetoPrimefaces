package br.ufba.dcc.model;

import java.io.Serializable;

public class Usuario  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7704571791942959235L;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
