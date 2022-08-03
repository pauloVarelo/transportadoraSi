package br.com.transportadorasi.modelo;

public class Mercadoria {
	
	private int id;
	private String nome;
	private String tipoDeMercadoria;
	private double preco;
	private boolean mercadoriaDireta;
	private boolean mercadoriaAceita;
	
	public Mercadoria(int id, String nome, String tipoDeMercadoria, double preco) {
		this.id = id;
		this.nome = nome;
		this.tipoDeMercadoria = tipoDeMercadoria;
		this.preco = preco;
	}

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

	public String getTipoDeMercadoria() {
		return tipoDeMercadoria;
	}

	public void setTipoDeMercadoria(String tipoDeMercadoria) {
		this.tipoDeMercadoria = tipoDeMercadoria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public boolean isMercadoriaDireta() {
		return mercadoriaDireta;
	}

	public void setMercadoriaDireta(boolean mercadoriaDireta) {
		this.mercadoriaDireta = mercadoriaDireta;
	}

	public boolean isMercadoriaAceita() {
		return mercadoriaAceita;
	}

	public void setMercadoriaAceita(boolean mercadoriaAceita) {
		this.mercadoriaAceita = mercadoriaAceita;
	}
	
	
	
	
	

}
