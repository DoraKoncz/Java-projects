<%@page import="controller.ListaCtrl"%>
<%
String lista = null;

if (request.getParameter("oggetti") != null) {
	oggetti = request.getParameter("oggetti");
}
if(oggetti != null)
	ListaCtrl.addOggetti(oggetti);


response.sendRedirect("index.jsp?action=list_oggetti");
%>

