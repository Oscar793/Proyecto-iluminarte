<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Editar Producto</title>
</head>
<body>
<h1>Editar Producto</h1>

<form action="Productos" method="post" >
<c:set var="producto" value="${producto}"></c:set>

<input type="hidden" name="opcion" value="editar">

<table>


<tr> 
 <td>Nombre Producto:</td>
 <td><input type="text" name="nombre" size= "50" value="${producto.nombre}"></td>
</tr>

<tr> 
 <td>Precio:</td>
 <td><input type="text" name="Precio" size= "50" value="${producto.Precio}"></td>
</tr>

<tr> 
 <td>Descripcion:</td>
 <td><input type="text" name="Descripcion" size= "50" value="${producto.Descripcion}"></td>
</tr>


<tr> 
 <td>Imagen:</td>
 <td><input type="text" name="Imagen" size= "50" value="${producto.Imagen}"></td>
</tr>

</table>

<input type="submit" value="Guardar">
</form>
</body>
</html>