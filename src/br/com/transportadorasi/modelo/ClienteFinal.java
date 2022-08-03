package br.com.transportadorasi.modelo;

import br.com.transportadorasi.dao.*;


public class ClienteFinal {
	
	private int id;
	private String nome;
	private String login;
	private String senha;
	private String cpf;
	private String email;
	private String endereco; //COM CEP GERAL
	
	public ClienteFinal( String nome, String login, String senha, String cpf, String email, String endereco) {
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.email = email;
		this.endereco = endereco;
		
	}
			


	@Override
	public String toString() {
		return "ClienteFinal [id=" + id + ", nome=" + nome + ", login=" + login + ", senha=" + senha + ", cpf=" + cpf
				+ ", email=" + email + ", endereco=" + endereco + "]";
	}



	//public String solicitarMercadoria(Frete frete) {
		
		//return ClienteFinalDao.cadastrar(frete);
		
	//}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
