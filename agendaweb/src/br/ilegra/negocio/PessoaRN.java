package br.ilegra.negocio;

import java.util.List;

import br.ilegra.modelo.Pessoa;
import br.ilegra.modelo.hibernate.dao.PessoaDAOHibernate;

public class PessoaRN {

	private PessoaDAOHibernate pessoaDAO;


	public PessoaRN() {
		pessoaDAO = new PessoaDAOHibernate();
	}

	public void salvar(Pessoa pessoa) {
		this.pessoaDAO.inserir(pessoa);
	
	}

}
