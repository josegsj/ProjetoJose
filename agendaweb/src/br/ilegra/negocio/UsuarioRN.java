package br.ilegra.negocio;

import br.ilegra.modelo.dao.UsuarioDAO;

public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO = null;
	
	public UsuarioRN() {
		usuarioDAO = new UsuarioDAO();
	}
	
	public String validarLogin(String login, String senha) {
		return this.usuarioDAO.consultarLogin(login, senha);
	}

}
