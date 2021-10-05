<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Crear Producto</title>
</head>
<body>
<h1>Crear Productos</h1>
<form action="Productos" method="post" >
<input type="hidden" name="opcion" value="guardar">

<table>


<tr> 
 <td>Nombre Producto:</td>
 <td><input type="text" name="nombre" size= "50"></td>
</tr>

<tr> 
 <td>Precio:</td>
 <td><input type="text" name="Precio" size= "50"></td>
</tr>

<tr> 
 <td>Descripcion:</td>
 <td><input type="text" name="Descripcion" size= "50"></td>
</tr>


<tr> 
 <td>Imagen:</td>
 <td><input type="text" name="Imagen" size= "50"></td>
</tr>

</table>

<input type="submit" value="Guardar">
</form>
</body>
</html>