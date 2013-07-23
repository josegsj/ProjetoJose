package br.ilegra.testes;

	import static org.junit.Assert.*;

	import java.util.List;

	import org.junit.Test;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;
import br.ilegra.webs.PessoaBean;
	
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
		public void testPessoaEquals() {
			Pessoa p = new Pessoa();
			PessoaRN pe=new PessoaRN();
			PessoaRN pe2=new PessoaRN();
			p.setNome("Cleber Damião dos Santos");
			p.setEmail("email@email.com.br");
			p.setTelefone("5112345678");
			p.setEndereco("Rua das Flores, 45");
			pe.salvar(p);		
			assertEquals(pe, pe2);
		}
	
		

		
}
