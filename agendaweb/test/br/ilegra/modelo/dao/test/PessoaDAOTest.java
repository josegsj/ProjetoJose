package br.ilegra.modelo.dao.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import br.ilegra.modelo.Pessoa;
import br.ilegra.modelo.dao.PessoaDAO;

public class PessoaDAOTest {

	@Test
	public void testInserir() {
		Pessoa p = new Pessoa();
		p.setNome("Cleber Damião dos Santos");
		p.setEmail("email@email.com.br");
		p.setTelefone("5112345678");
		p.setEndereco("Rua das Flores, 45");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.setPessoa(p);
		pessoaDAO.inserir();
	}
	
	@Test
	public void testConsultarLista() {
		PessoaDAO pessoaDAO = new PessoaDAO();
		List<Pessoa> lista = pessoaDAO.consultarLista();
		for (Pessoa pessoa : lista) {
			System.out.println(
					pessoa.getId() + ";" + 
					pessoa.getNome() + ";" +
					pessoa.getEndereco());
		}
	}

}














