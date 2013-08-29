package br.ilegra.testes;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.sun.xml.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;

public class PessoaTest {

	@Test
	public void testInserirnotnull() {
		Pessoa p = new Pessoa();
		PessoaRN pe = new PessoaRN();
		p.setNome("Cleber Damião dos Santos");
		p.setEmail("email@email.com.br");
		p.setTelefone("5112345678");
		p.setEndereco("Rua das Flores, 45");
		assertNotNull(p);
	}

	@Test
	public void testPessoaNotSame() {
		Pessoa p = new Pessoa();
		p.setNome("Cleber Damião dos Santos");
		p.setEmail("email@email.com.br");
		p.setTelefone("5112345678");
		p.setEndereco("Rua das Flores, 45");
		Pessoa p2 = new Pessoa();
		p2.setNome("Cleber Damião dos Santos");
		p2.setEmail("email@email.com.br");
		p2.setTelefone("5112345678");
		p2.setEndereco("Rua das Flores, 45");

		assertNotSame(p, p2);
	}

	@Test
	public void testPessoaequals() {
		Pessoa p = new Pessoa();
		p.setNome("Cleber Damião dos Santos");
		p.setEmail("email@email.com.br");
		p.setTelefone("5112345678");
		p.setEndereco("Rua das Flores, 45");
		Pessoa p2 = new Pessoa();
		p2.setNome("Cleber Damião dos Santos");
		p2.setEmail("email@email.com.br");
		p2.setTelefone("5112345678");
		p2.setEndereco("Rua das Flores, 45");

		assertEquals(p, p2);
	}

	@Test
	public void testPessoaassert() {
		Pessoa p = new Pessoa();
		p.setNome("Cleber Damião dos Santos");
		p.setEmail("email@email.com.br");
		p.setTelefone("5112345678");
		p.setEndereco("Rua das Flores, 45");
		if (p != null)
			assertTrue(true);
	}

}
