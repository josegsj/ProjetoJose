package br.ilegra.controle;

import java.io.IOException;
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

	private static final long serialVersionUID = 1L;

	public AgendaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		WebApplicationContext ctx = WebApplicationContextUtils
				.getRequiredWebApplicationContext(this.getServletContext());
		PessoaRN pessoaRN = (PessoaRN) ctx.getBean("pessoaRn");

		Pessoa pessoa = new Pessoa();
		System.out.println("entrou");
		int i=0;
		String nome = request.getParameter("nome");
		String celular = request.getParameter("celular");
		String cep = request.getParameter("cep");
		String telefone = request.getParameter("telefone");
		String endereco = request.getParameter("endereco");
		String email = request.getParameter("email");
		String descricao = request.getParameter("descricao");
		String action = request.getParameter("action");

		
		pessoa.setId(i++);
		pessoa.setNome(nome);
		pessoa.setCelular(celular);
		pessoa.setTelefone(telefone);
		pessoa.setHp(cep);
		pessoa.setDescricao(descricao);
		pessoa.setEmail(email);
		pessoa.setEndereco(endereco);
		if (action.equals("inserir")) {
			pessoaRN.salvar(pessoa);
		}
	}

}
