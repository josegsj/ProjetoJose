package br.ilegra.modelo.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import br.ilegra.modelo.Pessoa;

public class PessoaDAOHibernate  {

	private Session session;
	
	public  void setSession(Session session){
		this.session=session;
	}
	
	public void inserir(Pessoa pessoa) {
		this.session.save(pessoa);
	}

	

	
	public void excluir(Pessoa pessoa) {
		this.session.delete(pessoa);

	}


	
	public List<Pessoa> pesquisar(String nome) {
		
		Criteria criteria= this.session.createCriteria(Pessoa.class);
	    criteria.add(Restrictions.like("nome", nome));
		
		return criteria.list();

	}
	
	public List<Pessoa> listar() {
		return this.session.createCriteria(Pessoa.class).list();
	}

	public static void setSession(org.hibernate.classic.Session currentSession) {
		// TODO Auto-generated method stub
		
	}



}