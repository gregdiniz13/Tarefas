<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<link href="logo.png" rel="shortcut icon" />
	<link href="estilo.css" rel="stylesheet">
	<title>Restaurante - Cadastro de funcionários</title>
</head>

<body>

	<div id="site">
		<div id="topo"></div>
		<!-- Barra de menus de navegacao -->
		<c:import url="Menu.jsp"/>
		<!-- Corpo do site -->
		<div id="corpo">
			<br>
			<center>
				<h3>Cadastre novos funcionários</h3>

				<form action="CadastrarUsuario.do" method="get">
				<fieldset>

					<legend>
						<b>Dados Pessoais</b>
					</legend>
					<table cellspacing="10">
						<tr>
							<td>
								<p>
									<label for="nome">Nome: </label>
							</td>
							<td align="left"><input type="text" name="nome" /required>
							</td>
							<td><label for="login">Login: </label></td>
							<td align="left"><input type="text" name="login" /required>
							</td>
						</tr>
						<tr>
							<td>
								<label for="senha">Senha: </label>
							</td>
							<td align="left">
								<input type="password" name="senha" size="20" maxlength="12" /required>
							</td>
							<td>
								<label></label>
							</td>
							<td>
							</td>
						</tr>
						<tr>
							<td><label>RG: </label></td>
							<td><input type="text" name="rg" /></td>
							<td><label>CPF: </label></td>
							<td><input type="text" name="cpf" /></td>
						</tr>

						<span><br>Escolha o cargo: <br /> </span>
						<br />
						<div>
							<input type="radio" name="tipo" id="supervisor" value="1" /> <label for="supervisor">Supervisor</label>
							<input type="radio" name="tipo" id="garcom" value="2" /> <label for="garcom">Garçom</label>
							<input type="radio" name="tipo"	id="caixa" value="4" /> <label for="caixa">Caixa</label>
							<input type="radio" name="tipo" id="cozinha" value="3" /> <label for="cozinha">Cozinha</label>
						</div>
					</table>
				</fieldset>
				<br>
				<input type="submit" name="botao_enviar" value="Cadastrar" />

				</form>
		</div>
		<div id="rodape">
			<center>
				<font color="#FFEBCD" face="andele mono"> Todos os direitos
					são reservados à Beatriz Cristina Ribeiro - Sistemas de Informação,
					USJT.</font>
			</center>
		</div>
	</div>
</body>
</html>