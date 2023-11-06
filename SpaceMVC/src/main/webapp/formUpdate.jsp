<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Atualizar Usuario</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">SpaceTur</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.html">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="CreateAndFind">Lista de Usu�rios</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Atualizar usu�rios</h3>
			<hr>
			<form action="UsuarioUpdate" method="post">
					<input value="${usuario.id_usuario}" name="id_usuario" style="visibility:hidden">
					<div class="form-floating mb-3">
						<input value="${usuario.nome_usuario}" name="nome_usuario" maxlength="200" type="text" class="form-control" id="floatingInput1"> 
						<label>Nome completo</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${usuario.cpf_usuario}" name="cpf_usuario" maxlength="11" type="text" class="form-control"> 
						<label>CPF (apenas n�meros)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${usuario.telefone_usuario}" name="telefone_usuario" maxlength="11" type="text" class="form-control"> 
						<label>Telefone (com DDD)</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${usuario.email_usuario}" name="email_usuario" maxlength="50" type="text" class="form-control"> 
						<label>E-mail</label>
					</div>
					<div class="form-floating mb-3">
						<input value="${usuario.senha_usuario}" name="senha_usuario" maxlength="6" type="text" class="form-control"> 
						<label>Senha (6 n�meros)</label>
					</div>

					<button class="btn btn-success" type="submit">Atualizar
						dados</button>
					<button class="btn btn-secondary" type="reset">Limpar
						Formul�rio</button>
			</form>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
</body>
</html>