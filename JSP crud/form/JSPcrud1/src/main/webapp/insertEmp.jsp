<%@page import="com.dao1.Dao1"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="m1" class="com.model1.Model1"/>
<jsp:setProperty property="*" name="m1"/>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
	
	<%
	
		int status = Dao1.savedata1(m1);
	

		if(status>0)
		{
			response.sendRedirect("home.jsp");
		}
		else
		{
			/* response.sendRedirect("error.jsp"); */
		}

	%>

</body>
</html>