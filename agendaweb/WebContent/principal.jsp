<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Agenda - Principal</title>
<script language="JavaScript" type="text/javascript"
	src="js/jquery-1.9.1.js"></script>
<script language="JavaScript" type="text/javascript" src="js/scripts.js"></script>
</head>
<body>

	<form action="agenda" method="post">

		<h3>Meus contatos</h3>
		<pre>		
			Nome 		<input type="text" size="50" name="nome" id="nome" />
			Telefone 	<input type="text" size="50" name="telefone" id="telefone" />
			Celular 	<input type="text" size="50" name="celular" id="celular" />
			CEP			<input type="text" size="50" name="hp" id="cep" /> 
			Descricao   <input type="text" size="50" name="descricao" id="descricao" /> 
			Email       <input type="text" size="50" name="email" id="email" /> 
			Endereco   <input type="text" size="50" name="endereco" id="endereco" /> 
			
		</pre>

		<center>
			<input type="button" id="buttonInsert" name="acao" value="Inserir" />
			<input type="hidden" name="corrente" value="1" />
		</center>

	</form>
</body>
</html>













