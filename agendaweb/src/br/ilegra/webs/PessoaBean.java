package br.ilegra.webs;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.ilegra.modelo.Pessoa;
import br.ilegra.negocio.PessoaRN;
import br.webservice.Validacao_Client;

@ManagedBean(name = "PessoaBean")
@RequestScoped
public class PessoaBean {
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> lista;
	private String retornoWeb = validarCpf(pessoa.getHp());
	PessoaRN pessoaRN = new PessoaRN();

	public String novo() {
		this.pessoa = new Pessoa();
		return "usuario";
	}

	public String salvar() {

		pessoaRN.salvar(pessoa);

		return null;

	}

	public String validarCpf(String cep) {

		Validacao_Client client = new Validacao_Client();
		try {
			retornoWeb = client.validarCep(cep);
		} catch (Exception e) {
			e.toString();
		}
		return retornoWeb;
		
	}

}
