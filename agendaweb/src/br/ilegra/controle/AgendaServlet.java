package br.ilegra.controle;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;
import br.ilegra.negocio.UsuarioRN;

/**
 * Servlet implementation class AgendaServlet
 */
@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		executar(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		executar(request, response);
	}

	private void executar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String urlDestino = "";
		HttpSession sessao;
		
		// pega parametros da pagina
		int corrente = Integer.parseInt(request.getParameter("corrente"));
		
		switch (corrente) {
		// pagina de login
		case 0:
			String login = request.getParameter("login");
			String senha = request.getParameter("senha");
			
			if (login == null && senha == null) {
				urlDestino = "agenda.html";
			} else {
				UsuarioRN usuarioRN = new UsuarioRN();
				String nome = usuarioRN.validarLogin(login, senha);
				if (nome != null) {
					sessao = request.getSession();
					sessao.setAttribute("nome", nome);
					urlDestino = "principal.jsp";
				} else {
					request.setAttribute("mensagem", "Autenticação inválida.");
					urlDestino = "erro.jsp";
				}
			}
			break;
			
		case 1:
			String acao = request.getParameter("acao");
			if (acao.equals("Inserir")) {
				Pessoa p = new Pessoa();
				p.setNome(request.getParameter("nome"));
				p.setTelefone(request.getParameter("telefone"));
				p.setCelular(request.getParameter("celular"));
				
				PessoaRN pessoaRN = new PessoaRN();
				pessoaRN.salvar(p);
				
				request.setAttribute("mensagem", "Registro incluído com sucesso.");
				urlDestino = "principal.jsp";
			}
			break;
		
		}
			
		getServletContext().getRequestDispatcher(
				"/" + urlDestino).forward(request, response);
		
	}	
	
	
}











