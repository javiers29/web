<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
 body{
 background-color:#9BC8F4;
 }
</style>
</head>
<body>

<%
//Recoger el nombre y dni
String nombre = (String) request.getAttribute("nombre");
String dni = (String) request.getAttribute("dni");
%>

<h3><%=nombre%></h3><br>
<h3><%=dni%></h3>

</body>
</html>