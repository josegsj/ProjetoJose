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

@WebServlet("/agenda")
public class AgendaServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public AgendaServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		executar(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		executar(request, response);
	}
	
	private void adicoonarparametros(HttpServletRequest request,
			HttpServletResponse response){
		Pessoa p = new Pessoa();
		p.setNome(request.getParameter("nome"));
		p.setTelefone(request.getParameter("telefone"));
		p.setCelular(request.getParameter("celular"));

		PessoaRN pessoaRN = new PessoaRN();
		pessoaRN.salvar(p);

		request.setAttribute("mensagem",
				"Registro incluído com sucesso.");
	}

	private void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String urlDestino = "";
		HttpSession sessao;

		switch (Integer.parseInt(request.getParameter("corrente"))) {
		
		

		case 1:
			adicoonarparametros(request, response);
			
			}
			

		}
		

	

}
