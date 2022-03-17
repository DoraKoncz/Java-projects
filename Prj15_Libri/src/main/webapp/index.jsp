<%@page import="model.Libro"%>
<%@page import="controller.LibriCtrl"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
h2 {color:red;} 
</style>
</head>
<body>

	<h1>Libreria!</h1>
	
		<form action="">
	
	<input type="text" name="titolo" placeholder="titolo">
	<input type="text" name="prezzo" placeholder="prezzo">
	<input type="submit" value="aggiungi libro">
	
	</form>
	//se rimane così si sovrascrive
	<% LibriCtrl controller = new LibriCtrl(); %> 
	
	<%
	
	if(request.getParameter("titolo") !=null){
		
		String titolo = request.getParameter("titolo");
		
		//Libro libro = new Libro(titolo, 10);
		
		controller.addLibro(titolo, 10);
		
	}
	
	%>
	
	<% %>
	
<% for (Libro l:controller.getLibri()) { %>
	
	<h2><%= l.getTitolo() %></h2>
	
	<% }%>

</body>
</html>