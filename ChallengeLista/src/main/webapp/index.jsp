<%@ include file="header.jsp"%>

<%@ include file="menu.jsp"%>

<!-- qui inserisco il contenuto "dinamico" -->

<% if (request.getParameter("action") !=null ) { //if%>

<% if (request.getParameter("action").equals("addOggetti")){ %>
<%@include file="form_oggetti.jsp"%>
<%} %>

<% if (request.getParameter("action").equals("list_oggetti")){ %>
<%@include file="list_oggetti.jsp"%>
<%} %>

<% } else { %>

<%@ include file="ChallengeList.html"%>

<% } %>


<%@ include file="footer.jsp"%>