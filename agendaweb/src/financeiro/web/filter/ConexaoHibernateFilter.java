package financeiro.web.filter;

import java.io.IOException;

import javax.servlet.*;

import org.hibernate.SessionFactory;

import br.ilegra.hibernate.util.*;

public class ConexaoHibernateFilter implements Filter {
	
	private SessionFactory sf;
	
	@Override
	public void init(FilterConfig arg0) throws ServletException {

		this.sf=HibernateUtil.getSessionFactory();
		
	}
	
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain chain) throws IOException, ServletException {
		try {
			this.sf.getCurrentSession().beginTransaction();
			chain.doFilter(servletRequest, servletResponse);
			this.sf.getCurrentSession().getTransaction().commit();
			this.sf.close();
			
		} catch (Throwable e) {
			try {
				if(this.sf.getCurrentSession().getTransaction().isActive()){
					this.sf.getCurrentSession().getTransaction().rollback();
				}
				
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			throw new ServletException(e);
		}
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}



	

}
