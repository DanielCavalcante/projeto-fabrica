<form method="post" action="<c:url value="/usuarios/save"></c:url>">
	<input type="hidden" name="usuario.id" value="${usuario.id}">
	<label>Nome: </label> <input name="usuario.nome" value="${usuario.nome}" type="text">
	<label>Email: </label> <input name="usuario.email" value="${usuario.email}" type="text">
	<label>Senha: </label> <input name="usuario.senha" value="${usuario.senha}" type="text">
	<input type="submit" value="Salvar" />
</form>
