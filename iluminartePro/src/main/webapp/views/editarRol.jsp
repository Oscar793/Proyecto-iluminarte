
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Rol</title>
</head>
<body>
<h1>Editar Rol</h1>

<form action="TipoRol" method="post" >
<c:set var="tiporol" value="${tiporol}"></c:set>

<input type="hidden" name="opcion" value="editar">

<table>


<tr> 
 <td>Nombre Rol:</td>
 <td><input type="text" name="nombre" size= "50"  value="${tiporol.nombre}"></td>
</tr>

</table>

<input type="submit" value="Guardar">
</form>

</body>
</html>