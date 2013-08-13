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
			descricao: descricao,
			email:email,
			endereco:endereco
		}, function(retorno) {

		});
	});
});