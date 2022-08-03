package br.com.transportadorasi.teste;



import br.com.transportadorasi.dao.ClienteFinalDao;
import br.com.transportadorasi.modelo.ClienteFinal;

public class TesteCadastroClienteFinal {

	public static void main(String[] args) {

		ClienteFinal clienteFinal = new ClienteFinal("Paulao Lindo", "plindao","1234", "123456789", "paulaolindo@gmail.com", "Rua torta linda 65");
		ClienteFinalDao.novoClienteFinal(clienteFinal);
		
		System.out.println(clienteFinal);
		

		

	}

}
