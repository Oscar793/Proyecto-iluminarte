<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

</head>
<body>

<title>Listar Producto</title>


<table border="1">

<tr>
    <td>Id Producto</td>
    <td>Categoria</td>
    <td>Proveedor</td>
    <td>Nombre Producto</td>   
    <td>Precio</td>  
    <td>Descripcion</td>
    <td>Imagen Producto</td>  
                
</tr>


<c:forEach var="producto" items="${lista}">

<tr>
<td> <a href="productos?opcion=meditar&id= <c:out value="${producto.idProducto }"></c:out> ">  <c:out value="${producto.idProducto }"></c:out> </a> </td>  
<td><c:out value="${producto.idCategoriaFK }"></c:out> </td> 
<td><c:out value="${producto.idProveedorFK }"></c:out> </td> 
<td><c:out value="${producto.nombreProducto}"></c:out> </td>  
<td><c:out value="${producto.precioProducto}"></c:out> </td>  
<td><c:out value="${producto.descripcionProducto }"></c:out> </td>  
<td><c:out value="${producto.imagenProducto }"></c:out> </td>  

</tr>

</c:forEach>



</table>
</body>
</html>