<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Roles</title>
</head>
<body>
<h1>Listar Roles</h1>


<table border="1">

<tr>
    <td>Id</td>
    <td>Nombre</td>   
</tr>

<c:forEach var="tiporol" items="${lista}">

<tr>
<td> <a href="TipoRol?opcion=meditar&idRol=<c:out value="${ tiporol.idRol}"></c:out>"> <c:out value="${ tiporol.idRol}"></c:out>  </a> </td> 
<td><c:out value="${tiporol.nombreRol }"></c:out> </td>  
</tr>





</c:forEach>



</table>
</body>
</html>