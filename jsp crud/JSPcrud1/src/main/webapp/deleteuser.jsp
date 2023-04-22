<%@page import="com.dao1.Dao1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

			<%
					String id = request.getParameter("id");
					int id2 = Integer.parseInt(id);
					Dao1.deletedata(id2);
					response.sendRedirect("home.jsp"); 
			%>


</body>
</html>