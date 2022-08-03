package br.com.transportadorasi.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

	
	public static Connection receberConexao() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/banco_transportadorasi?useSSL=false","root","password");
			System.out.println("Sistema Conectado com Sucesso ao Banco de Dados!!!");
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("Erro ao Conectar no Banco de Dados!!!");
			e.printStackTrace();
		}
		
		return con;
		
	}
	

}
