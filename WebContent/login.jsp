<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login - CRUD</title>
<link href="CSS/Global.css" rel="stylesheet" type="text/css">
</head>
<body>
	<form method="post" id="form_login">
		<fieldset id="field_login">
			<legend>Login do Sistema</legend>
			<div id="campo_login_usuario">
				<label for="login_usuario">Login</label>
				<input type="text" name="login_usuario" maxlength="15">
			</div>
			<div id="campo_login_senha">
				<label for="login_usuario">Senha</label>
				<input type="password" name="login_senha" maxlength="15">
			</div>
			<div id="botao_login_senha">
				<input type="submit" name="login_senha" value="Logar">
				<a href="">Esqueci a senha</a>
			</div>
		</fieldset>
	</form>
</body>
</html>