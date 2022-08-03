package br.com.turmasi.sistema;

import br.com.transportadorasi.modelo.*;;

public class SistemaInterno {
	public void loginRestrito(Autenticavel usuario) {
		
		if(usuario.getSenha() == 1234){
			System.out.println("Acesso Prmitido, Seja Bem Vindo!!!");
			
		}else {
			System.out.println("Acesso Negado!!!");
		
		}
	
	}

}
