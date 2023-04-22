<%@page import="com.dao1.Dao1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <jsp:useBean id="m1" class="com.model1.Model1"></jsp:useBean>
      <jsp:setProperty property="*" name="m1"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%
	
		
		int status =Dao1.updatedata(m1);
		
		if(status>0)
		{
			response.sendRedirect("index.jsp");
		}
		else
		{
			out.print("Error");	
		} 
		
		
	
	%>

</body>
</html>