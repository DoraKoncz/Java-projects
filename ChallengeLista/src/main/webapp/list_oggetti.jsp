<%@page import="controller.ListaCtrl"%>
<%@page import="model.Lista"%>

<h2>Elenco oggetti</h2>

<table>

	<th>I miei oggetti</th>
	
	<%
	for (Lista l : ListaCtrl.getLista()) {
	%>
	
	<tr>
		<td><%= l.getLista() %></td>
	</tr>

</table>
<% 
}
%>