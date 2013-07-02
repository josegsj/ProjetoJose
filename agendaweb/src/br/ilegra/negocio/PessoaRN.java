package br.ilegra.negocio;

import java.util.List;


import br.ilegra.modelo.Pessoa;
import br.ilegra.modelo.dao.PessoaDAO;

public class PessoaRN {
	
	private PessoaDAO pessoaDAO;
	
	public PessoaRN() {
		pessoaDAO = new PessoaDAO();
	}
	
	public void salvar(Pessoa pessoa) {
		this.pessoaDAO.setPessoa(pessoa);
	//	this.pessoaDAO.salvar();
	}
	
	
	
	
	

}
