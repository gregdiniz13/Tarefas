<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
<title>Visualisar Usuário</title>
</head>
<body>
	
	Visualizar o Usuário de Id: #${Usuário.id}<br>
	Nome: ${Usuário.nome}<br>
	Login: ${Usuário.login}<br>
	Senha: ${Usuário.senha}<br>
	Tipo: ${Usuário.tipo}<br>
	RG: ${Usuário.rg}<br>
	CPF: ${Usuário.cpf}<br>
	<a href="index.jsp">Voltar</a>
	
</body>
</html>