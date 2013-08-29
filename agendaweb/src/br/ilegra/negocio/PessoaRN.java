package br.ilegra.negocio;

import java.util.List;

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
		if(pessoa!=null)
		pessoaDAO.inserir(pessoa);
	}
	@Transactional
	public void delete(Pessoa pessoa ){
		if(pessoa!=null)
		pessoaDAO.delete(pessoa);
	}
	@Transactional
	public void atualizar(Pessoa pessoa){
		pessoaDAO.atualizar(pessoa);
	}
	public List<Pessoa> pesquisar(String nome){
		if(nome!=null)
		return pessoaDAO.pesquisar(nome);
		else
			return null;
		
	}
	public  List<Pessoa> listar(){
		return pessoaDAO.listar();
	}
	



}
