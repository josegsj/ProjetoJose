package br.ilegra.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.ilegra.util.ConnectionBean;

public class UsuarioDAO {
	
	public String consultarLogin(String usuario, String senha) {
		
		StringBuilder sql = new StringBuilder();
		
		sql.append("select nome ");
		sql.append("from pessoa, usuario ");
		sql.append("where pessoa.id = usuario.id ");
		sql.append("  and usuario.login = ? ");
		sql.append("  and usuario.senha = ? ");
		
		Connection con = ConnectionBean.getInstance().getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String nome = null;
		
		try {
			ps = con.prepareStatement(sql.toString());
			ps.setString(1, usuario);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			
			if (rs != null && rs.next()) {
				nome = rs.getString("nome");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return nome;
	}

}
