<%@page import="controller.LibreriaCtrl"%>
<%@page import="model.Libro"%>

<h2>Elenco libri</h2>


<table>
	<th>Titolo</th>
	<th>Prezzo</th>


	<%
	for (Libro l : LibreriaCtrl.getLibri()) {
	%>

	<tr>
		<td><%= l.getTitolo()%></td>
		<td><%= l.getPrezzo()%></td>
	</tr>

</table>
<%
}
%>