<%@page import="model.Articolo"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Prj24_MagazzinoTec</title>
</head>
<body>

	<h1>Articoli</h1>
	<table>
		<tr>
			<td>Descrizione</td>
			<td>Quantit�</td>
		</tr>

		<%
		List<Articolo> articoli = (List<Articolo>) request.getAttribute("Articoli");
		%>
		<%
		for (Articolo a : articoli) {
		%>
		<tr>
			<td>
				<%
				a.getDescrizione();
				%>
			</td>
			<td>
				<%
				a.getQuantita();
				%>
			</td>
		</tr>

		<%
		}
		%>

	</table>

</body>
</html>