<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Confirmation</title>
</head>
<body>
The Student is : ${param.firstname}  ${param.lastname}

<br>
 the Student Country: ${param.country}
 <br>
 the Student language: ${param.favouriteone }
 <br>
 <%--the favourites LNGUAGES ARE--%>
  <%
 
 String[] langs = request.getParameterValues("favourites");
   for(String tempLang: langs){
	   out.print(tempLang);
   }

 %>
</body>
</html>