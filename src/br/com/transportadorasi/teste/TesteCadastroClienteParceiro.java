package br.com.transportadorasi.teste;

import br.com.transportadorasi.dao.ClienteParceiroDao;
import br.com.transportadorasi.modelo.ClienteParceiro;

public class TesteCadastroClienteParceiro {

	public static void main(String[] args) {

		//tipo				//variavel			//atribuição de valores daquele tipo
		ClienteParceiro clienteParceiro = new ClienteParceiro("coca cola", "123456789");
		ClienteParceiroDao.cadastrarParceiro(clienteParceiro);
		
		System.out.println(clienteParceiro);
		

	}

}
