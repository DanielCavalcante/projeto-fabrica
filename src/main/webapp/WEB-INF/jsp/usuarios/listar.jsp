<a href="<c:url value="/usuarios/form"></c:url>">Cadastrar</a>

<ul>
	<c:forEach items="${usuarios}" var="usuario">
		<li> ${usuario.id} </li>
		<li> ${usuario.nome} </li>
		<li> ${usuario.email} </li>
		<li> ${usuario.senha} </li>
		<hr>
	</c:forEach>
</ul>