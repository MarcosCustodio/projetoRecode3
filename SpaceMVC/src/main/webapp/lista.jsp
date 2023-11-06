<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Usuários</title>
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
          <a class="nav-link" href="CreateAndFind">Lista de Usuários</a>
        </li>
      </ul>
    </div>
  </div>
</nav>
<br>
<div class="container">
	<div class="row">
		<div class="cold-md-7">
			<hr>
			<h3>Usuários Cadastrados</h3>
			<hr>
			<table class = "table">
				<thead>
					<tr>
						<th>#</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Telefone</th>
						<th>E-mail</th>
						<th>Senha</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${usuario}" var="usuario">
							<tr>
								<td>${usuario.id_usuario}</td>
								<td>${usuario.nome_usuario}</td>
								<td>${usuario.cpf_usuario}</td>
								<td>${usuario.telefone_usuario}</td>
								<td>${usuario.email_usuario}</td>
								<td>${usuario.senha_usuario}</td>
								<td>
									<a href="UsuarioDestroy?usuarioId=${usuario.id_usuario}">deletar</a> |
									<a href="UsuarioUpdate?usuarioId=${usuario.id_usuario}">atualizar</a>
								</td>
							</tr>
						</c:forEach>
				</tbody>
			</table>
			<h5><a href="index.html">Voltar para a página de cadastro de usuários.</a></h5>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>;
</body>
</html>