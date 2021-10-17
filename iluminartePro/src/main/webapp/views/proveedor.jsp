<%@include file="header.jsp" %>

<div class="flex-fill flex-grow-1 ms-3">

  <h1>Lista de Proveedores</h1>
  <a type="button" class="btn btn-primary" href="ProveedorController?accion=abrirForm">
  <i class="bi bi-plus-circle"></i> 
  Agregar Proveedor
  </a>

 <table class="table table-hover table-bordered">
 
       <tr>
            <th>Id</th>
            <th>Nombre del Proveedor</th>
            <th><center>Direccion</center></th>  
            <th><center>Telefono</center></th>
            <th><center>Persona de Contacto</center></th> 
            <th><center>Estado</center></th>            
            <th colspan="5"><center>Acciones</center></th>
        </tr>
        
<c:forEach var="proveedor" items="${proveedores}">         
        
        <tr>
        <td>${proveedor.getIdProveedor()}</td>
        <td>${proveedor.getNombreProveedor()}</td>
     	<td>${proveedor.getDireccionProveedor()}</td>
     	<td>${proveedor.getTelefonoProveedor()}</td>
     	<td>${proveedor.getPersonaContactoProveedor()}</td>
     	
     	<c:if test="${proveedor.getEstadoProveedor() == true}">
           <td><span class="badge bg-success active">Proveedor Activo</span></td> 
        </c:if>
        <c:if test="${proveedor.getEstadoProveedor() == false}">
            <td><span class="badge bg-danger active">Proveedor Inactivo</span></td> 
        </c:if>
     	
    	<td>
        <c:if test="${proveedor.getEstadoProveedor() == true}">
           <a rol="button" 
           class="btn btn-danger btn-sm" 
           onclick="cambiareproveedor(event,${proveedor.getIdProveedor()},${proveedor.getEstadoProveedor()})"> 
        Inactivar
        </a>
        </c:if>
        <c:if test="${proveedor.getEstadoProveedor() == false}">
            <a rol="button" 
            class="btn btn-success btn-sm" 
            onclick="cambiareproveedor(event,${proveedor.getIdProveedor()},${proveedor.getEstadoProveedor()})">
        Activar
        </a>
        </c:if> 
        </td>
      
        
        <td>
        <a rol="button" 
        class="btn btn-warning" 
        href="ProveedorController?accion=verProveedor&id=${proveedor.getIdProveedor()}">
        <i class="bi bi-pencil"></i> 
        </a>

	    <a rol="button" 
	    class="btn btn-danger" 
	    onclick="borrarProveedor(event,${proveedor.getIdProveedor()})">
	    <i class="bi bi-trash"></i> 
	    </a>
	    
	    </td>
        <tr>
        
</c:forEach>    


</table>


</div> 


<%@include file="footer.jsp" %>