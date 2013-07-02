package br.ilegra.modelo.dao;

import static org.junit.Assert.*;

import org.junit.Test;

public class UsuarioDAOTest {

	@Test
	public void testConsultarLogin() {
		UsuarioDAO dao = new UsuarioDAO();
		String retorno = dao.consultarLogin("gisele", "1234");
		System.out.println(retorno);
		assertEquals("Mensagem de erro", "Gisele Bundchen", retorno);
	}

}
