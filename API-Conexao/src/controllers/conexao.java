package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import models.bancoDados;

public class conexao {
	public static String testeConexao(bancoDados banco) {
		
		String url;
		Connection con;
		String senhaDesc = new String(banco.senha);
		
		url = "jdbc:postgresql://localhost:" + banco.porta + "/" + banco.nome;
		// Necess�rio alterar a url, usuario e senha para o banco que ser� conectado
		
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url,banco.usuario,senhaDesc);
			
			return "Conex�o realizada com sucesso!!!";
			
		} catch (Exception e) {
			return e.getMessage();
		}
		
	} 
}
