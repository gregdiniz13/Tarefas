<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="model.Usuario" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Usuário</title>
</head>
<body>
	<%Usuario usuario = (Usuario)request.getAttribute("Usuário"); %>
	Id: <%=usuario.getId() %><br>
	Nome: <%=usuario.getNome() %><br>
	Login: <%=usuario.getLogin() %><br>
	Senha: <%=usuario.getSenha() %><br>
	Tipo: <%=usuario.getTipo() %><br>
	RG: <%=usuario.getRg() %><br>
	CPF: <%=usuario.getCpf() %><br>
</body>
</html>