package br.ilegra.hibernate.util;

import br.ilegra.modelo.hibernate.dao.PessoaDAOHibernate;
import br.ilegra.*;

public class DAOFactory {
	
	public static  PessoaDAOHibernate criarUsuarioDAO(){
		 PessoaDAOHibernate  pessoaDAOHibernate=new  PessoaDAOHibernate();
		 PessoaDAOHibernate.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return  pessoaDAOHibernate;
		
		
	}
	

}
