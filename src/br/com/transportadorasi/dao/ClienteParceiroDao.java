package br.com.transportadorasi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import br.com.transportadorasi.jdbc.Conexao;
import br.com.transportadorasi.modelo.ClienteParceiro;
import br.com.transportadorasi.modelo.Frete;

public class ClienteParceiroDao {
	
	public static String cadastrarParceiro(ClienteParceiro clienteParceiro) {
			
	Connection con = Conexao.receberConexao();
		
		String sql = "INSERT INTO clienteparceiro(nome,cnpj) VALUES(?,?)";
		
		//tentar
		try {
			PreparedStatement preparador = con.prepareStatement(sql);
			preparador.setString(1, clienteParceiro.getNome());
			preparador.setString(2, clienteParceiro.getCnpj());
			
			preparador.execute();
			
			preparador.close(); //fecha conexão com o banco
			
			return "Cadastro Feito com Sucesso";			
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			return "Seu cadastro não foi realizda".concat(e.getMessage());
		}
		
	}
}


