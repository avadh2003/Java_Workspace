<%@page import="com.model.Model"%>
<%@page import="com.dao.Dao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%-- <jsp:useBean id="m" class=com.model.Model/>
    <jsp:setProperty property="*" name="m"/>
  --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	
	<%

	String email =request.getParameter("email");
	String password =request.getParameter("password");
	
	Model m =new Model();
	m.setEmail(email);
	m.setPassword(password);
	
	Model m2 = Dao.login(m);
	
	

		 if(m2!=null)
		{
			response.sendRedirect("home.jsp");
		}
		 else
		 {
			 response.sendRedirect("error.jsp");
		 } 
	 
	
	%>
			



</body>
</html>