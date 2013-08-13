package br.ilegra.testes;

	import static org.junit.Assert.*;

	import java.util.List;

	import org.junit.Test;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;

	
	public class PessoaTest {

		@Test
		public void testInserir() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);		
			assertNull(pe);
		}
		
		@Test
		public void testInserirnotnull() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);		
			assertNotNull(pe);
		}
		
		@Test
		public void testPessoaNotSame() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			PessoaRN pe2=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);	
			assertNotSame(pe, pe2);
		}
		
		@Test
		public void testPessoaequals() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			PessoaRN pe2=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);	
			pe2.salvar(p);
			assertEquals(pe, pe2);
		}
		
		public void testPessoaassert() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);	
			if(p!=null)
			assertTrue(true);
		}
		
	
		

		
}
