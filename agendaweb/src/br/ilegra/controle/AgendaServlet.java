package br.ilegra.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;

@WebServlet("/AgendaServlet")
public class AgendaServlet extends HttpServlet {

	WebApplicationContext ctx = WebApplicationContextUtils
			.getRequiredWebApplicationContext(this.getServletContext());
	Pessoa pessoa = new Pessoa();
	PessoaRN pessoaRN = (PessoaRN) ctx.getBean("pessoaRn");

	private static final long serialVersionUID = 1L;

	public AgendaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String action = request.getParameter("action");

		if (action.equals("inserir")) {
			inserePessoa(request, response);
		}

		if (action.equals("delete")) {

			deletePessoa(request, response);
		}
		
		if (action.equals("pesquisar")) {
			doService(request, response);
		}
		
	}
	public void setagendaServlet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String celular = request.getParameter("celular");
		String cep = request.getParameter("cep");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String descricao = request.getParameter("descricao");

		pessoa.setNome(nome);
		pessoa.setCelular(celular);
		pessoa.setTelefone(telefone);
		pessoa.setHp(cep);
		pessoa.setDescricao(descricao);
		pessoa.setEmail(email);
		pessoa.setEndereco(endereco);

	}

	public void inserePessoa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		setagendaServlet(request, response);

		pessoaRN.salvar(pessoa);

	}

	public void deletePessoa(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		setagendaServlet(request, response);

		pessoaRN.delete(pessoa);

	}

	protected void doService(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<Pessoa> listar = pessoaRN.listar();
		request.setAttribute("listar", listar);

		RequestDispatcher rd = request.getRequestDispatcher("pesquisar.jsp");
		rd.forward(request, response);

	}
	
	
	
	

}
