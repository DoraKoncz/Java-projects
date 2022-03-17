<%@page import="model.Todo"%>
<%@page import="controller.TodoCtrl"%>

<table>
<%

	if (session.getAttribute("controller")!=null){
		
		
		TodoCtrl ctrl = (TodoCtrl) session.getAttribute("controller");
		
		for (Todo df : ctrl.getTodos()) {
			out.print("<tr>");
			// " + df.getId() + "'>"
			out.print("<td>");
			out.print("<a href='doComplete.jsp0?idTodo=1'>");
			out.print(df.isDone());
			out.print("</a>");
			
			out.print("</td>");
			
			out.print("<td>");
			out.print(df.getId());
			out.print("</td>");
			
			out.print("<td>");
			out.print(df.getDescription());
			out.print("</td><br>");
			
			out.print("</tr>");
			
		}
				
	}

%>
</table>