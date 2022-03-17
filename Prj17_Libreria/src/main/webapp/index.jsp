<%@ include file="header.jsp"%>

<%@ include file="menu.jsp"%>

<!-- qui inserisco il contenuto "dinamico" -->

<% if (request.getParameter("action") !=null ) { //if%>

<% if (request.getParameter("action").equals("addLibro")){ %>
<%@include file="form_libri.jsp"%>
<%} %>

<% if (request.getParameter("action").equals("listLibro")){ %>
<%@include file="list_libri.jsp"%>
<%} %>

<% } else { %>

<%@ include file="homepage.html"%>

<% } %>


<%@ include file="footer.jsp"%>

