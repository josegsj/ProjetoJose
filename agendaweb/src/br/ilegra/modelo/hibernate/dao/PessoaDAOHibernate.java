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

	@Autowired
	private SessionFactory sessionFactory;

	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	public void inserir(Pessoa pessoa) {
		getCurrentSession().save(pessoa);
	}
	public void delete(Pessoa pessoa) {
		getCurrentSession().delete(pessoa);
	}
	public void atualizar(Pessoa pessoa) {
		getCurrentSession().update(pessoa);
	}
	public List<Pessoa> pesquisar(String nome) {
		Criteria criteria = getCurrentSession().createCriteria(Pessoa.class);
		criteria.add(Restrictions.like("nome", nome));
		return criteria.list();
	}
	public List<Pessoa> listar() {
		return getCurrentSession().createCriteria(Pessoa.class).list();
	}

}