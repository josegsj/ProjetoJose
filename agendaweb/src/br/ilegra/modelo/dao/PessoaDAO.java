package br.ilegra.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.ilegra.modelo.Pessoa;
import br.ilegra.util.ConnectionBean;

public class PessoaDAO {
	
	private Pessoa pessoa;
	
	// INSERT / CREATE
	public void inserir() {
		
		StringBuilder sql = new StringBuilder();
		sql.append(" insert into pessoa ( ");
		sql.append("   nome, telefone, endereco, email, hp, celular, descricao ) ");
		sql.append(" values ( ?, ?, ?, ?, ?, ?, ? ) ");

		Connection con = ConnectionBean.getInstance().getConnection();
		
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql.toString());
			int i = 1;
			ps.setString(i++, pessoa.getNome());
			ps.setString(i++, pessoa.getTelefone());
			ps.setString(i++, pessoa.getEndereco());
			ps.setString(i++, pessoa.getEmail());
			ps.setString(i++, pessoa.getHp());
			ps.setString(i++, pessoa.getCelular());
			ps.setString(i++, pessoa.getDescricao());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	// RETRIEVE
	public List<Pessoa> consultarLista() {
		
		StringBuilder sql = new StringBuilder();
		sql.append("select * from pessoa order by id");
		
		Connection con = ConnectionBean.getInstance().getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Pessoa> lista = null;
		
		try {
			ps = con.prepareStatement(sql.toString());
			rs = ps.executeQuery();
			
			if (rs != null) {
				lista = new ArrayList<Pessoa>();
				
				while (rs.next()) {
					
					Pessoa p = new Pessoa();
					p.setId(rs.getInt("id"));
					p.setNome(rs.getString("nome"));
					p.setTelefone(rs.getString("telefone"));
					p.setEndereco(rs.getString("endereco"));
					p.setEmail(rs.getString("email"));
					p.setHp(rs.getString("hp"));
					p.setCelular(rs.getString("celular"));
					p.setDescricao(rs.getString("descricao"));
					
					lista.add(p);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		return lista;
	}
	
	// UPDATE
	
	// DELETE
		
	
	// setters and getters

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
