package br.ilegra.modelo.hibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.ilegra.modelo.Pessoa;

@Repository
public class PessoaDAOHibernate {

	@Autowired private SessionFactory sessionFactory;

	 public Session getCurrentSession() {
	  return sessionFactory.getCurrentSession();
	 }
	 
	public void inserir(Pessoa pessoa) {
		getCurrentSession().save(pessoa);
	}




}