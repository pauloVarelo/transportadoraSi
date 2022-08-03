package br.com.transportadorasi.modelo;

public class Frete {
		
		private int id;
		private String solicitante;
	    private String cep;
	    private int idMercadoria;
	    private int idParceiro;
	    
		public Frete(int id, String solicitante, String cep, int idMercadoria, int idParceiro) {
			this.id = id;
			this.solicitante = solicitante;
			this.cep = cep;
			this.idMercadoria = idMercadoria;
			this.idParceiro = idParceiro;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getSolicitante() {
			return solicitante;
		}

		public void setSolicitante(String solicitante) {
			this.solicitante = solicitante;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public int getIdMercadoria() {
			return idMercadoria;
		}

		public void setIdMercadoria(int idMercadoria) {
			this.idMercadoria = idMercadoria;
		}

		public int getIdParceiro() {
			return idParceiro;
		}

		public void setIdParceiro(int idParceiro) {
			this.idParceiro = idParceiro;
		}
		
		   
		
}

