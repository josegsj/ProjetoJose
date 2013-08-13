package br.ilegra.negocio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.ilegra.modelo.Pessoa;
import br.ilegra.modelo.hibernate.dao.PessoaDAOHibernate;

@Service
public class PessoaRN {

	@Autowired
	private PessoaDAOHibernate pessoaDAO;

	public void setPessoaDAO(PessoaDAOHibernate pessoaDAO) {
		this.pessoaDAO = pessoaDAO;
	}

	@Transactional
	public void salvar(Pessoa pessoa) {
		pessoaDAO.inserir(pessoa);

	}

}
