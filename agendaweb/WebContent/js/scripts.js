$(document).ready(function() {
	var nome = $('#nome').val();
	var telefone = $('#telefone').val();
	var celular = $('#celular').val();
	var cep = $('#cep').val();
	var descricao = $('#descricao').val();
	var email = $('#email').val();
	var endereco = $('#endereco').val();

	$('#buttonInsert').click(function() {
		$.post("AgendaServlet", {
			action : 'inserir',
			nome : nome,
			telefone : telefone,
			codigo : codigo,
			celular : celular,
			cep : cep,
			descricao : descricao,
			email : email,
			endereco : endereco
		}, function(retorno) {

		});
	});

	$('#buttonDelete').click(function() {
		$.post("AgendaServlet", {
			action : 'delete',
			nome : nome,
			telefone : telefone,
			codigo : codigo,
			celular : celular,
			cep : cep,
			descricao : descricao,
			email : email,
			endereco : endereco
		}, function(retorno) {
			

		});
	});

	$('#buttonAlterar').click(function() {
		$.post("AgendaServlet", {
			action : 'alterar',
			nome : nome,
			telefone : telefone,
			codigo : codigo,
			celular : celular,
			cep : cep,
			descricao : descricao,
			email : email,
			endereco : endereco
		}, function(retorno) {

		});

	});
	$('#buttonPesquisa').click(function() {
		$.post("AgendaServlet", {
			action : 'pesquisa',
			nome : nome,
			telefone : telefone,
			codigo : codigo,
			celular : celular,
			cep : cep,
			descricao : descricao,
			email : email,
			endereco : endereco
		}, function(retorno) {

		});

	});
	
	 $("#buttonCancelar").click(function(){
			$('#nome').val("");
			$('#telefone').val("");
			$('#celular').val("");
			$('#cep').val("");
			$('#descricao').val("");
			$('#email').val("");
			$('#endereco').val("");	       	
      });
	 
     $("#buttonpesquisarnome").click(function() {
  	   var chave = $('#pesquisanome').val();
  	   carregaClientes(chave);
     });
     
 	function carregaClientes(chave) {	
		$.post("AgendaServlet", {
			action: 'buscaPessoa',
			pesquisanome: chave
			}, function(retorno){
				htmlOutput = '';

				var obj = jQuery.parseJSON(retorno);

				if (obj.length == 0) {
						htmlOutput = htmlOutput + '<tr>';
						htmlOutput = htmlOutput + '<td colspan="5">Nenhum registro encontrado!</td>';
						htmlOutput = htmlOutput + '</tr>';					
				} else {
					for (var i = 0; i < obj.length; i++) {
						htmlOutput = htmlOutput + '<tr>';
						htmlOutput = htmlOutput + '<td>' + obj[i].nome + '</td>';
						htmlOutput = htmlOutput + '<td>' + obj[i].telefone + '</td>';	
						htmlOutput = htmlOutput + '<td>' + obj[i].celular+'</td>';
						htmlOutput = htmlOutput + '<td>' + obj[i].cep + '</td>';		
						htmlOutput = htmlOutput + '<td>' + obj[i].descricao+'</td>';
						htmlOutput = htmlOutput + '<td>' + obj[i].email + '</td>';
						htmlOutput = htmlOutput + '<td>' + obj[i].endereco+'</td>';
						htmlOutput = htmlOutput + '<td align="center">';
						htmlOutput = htmlOutput + '<input type="button" name="buttonDelete" value="Excluir" onclick="javascript:excluir(' + obj[i].idCadastro + ')">';
						htmlOutput = htmlOutput + '<input type="button" name="buttonAlterar" value="Editar" onclick="javascript:editar(' + obj[i].idCadastro + ', \'' + obj[i].nome + '\', \'' + obj[i].telefone + '\', \'' + obj[i].cpf + '\', \'' + obj[i].email + '\')">';
						htmlOutput = htmlOutput + '</td>';
						htmlOutput = htmlOutput + '</tr>';
					}				
				}
				$('#cadastro').html(htmlOutput);
			});
	}
 	
 	
     
     
     

});