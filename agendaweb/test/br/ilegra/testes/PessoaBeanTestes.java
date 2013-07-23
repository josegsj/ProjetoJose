package br.ilegra.testes;

import static org.junit.Assert.*;

import javax.swing.text.StyledEditorKit.BoldAction;

import org.junit.Test;

import br.ilegra.webs.PessoaBean;

public class PessoaBeanTestes {

	@Test
	public void testvalidacepTRue(String cep) {

		assertTrue(new PessoaBean().validarCpf(cep), true);

	}
	
	@Test
	public void testvalidacepFalse(String cep) {

		assertFalse(new PessoaBean().validarCpf(cep), false);

	}
	

}
