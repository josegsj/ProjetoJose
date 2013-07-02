package br.ilegra.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Singleton de Conexao com Banco
public class ConnectionBean {
	
	private Connection con;
	private String url = "jdbc:mysql://localhost:3306/agenda"; // oracle
	private String usuario = "root";
	private String senha = "ilegra";
	
	private static ConnectionBean instance = null;
	
	private ConnectionBean() {
		init();
	}
	
	public static ConnectionBean getInstance() {
		if (instance == null) {
			instance = new ConnectionBean();
		}
		return instance;
	}

	private void init() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.con = DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	public Connection getConnection() {
		try {
			if (con.isClosed()) {
				init();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

}










