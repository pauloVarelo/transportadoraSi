package br.com.transportadorasi.modelo;

public class ClienteParceiro {
	
	//Propriedades ou Atributos
	private int id;
	private String nome;
	private String cnpj;

	
	public ClienteParceiro(String nome, String cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public int getId() {
		return id;
	}
	public void setMatricula(int matricula) {
		this.id = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	
}