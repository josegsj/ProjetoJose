<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Agenda - Principal</title>
</head>
<body>

	<form action="agenda" method="post">

		<h3>Meus contatos</h3>
		<pre>
			Código 		<input type="text" size="50" name="id" />		
			Nome 		<input type="text" size="50" name="nome" />
			Telefone 	<input type="text" size="50" name="telefone" />
			Celular 	<input type="text" size="50" name="celular" />
			CEP			<input type="text" size="50" name="hp" /> <input type="button"
				id="btnValidar" value="Verificar CEP" />
		</pre>

		<center>
			<input type="submit" name="acao" value="Consultar" /> <input
				type="submit" name="acao" value="Inserir" /> <input type="submit"
				name="acao" value="Remover" /> <input type="hidden" name="corrente"
				value="1" />
		</center>

	</form>
</body>
</html>













