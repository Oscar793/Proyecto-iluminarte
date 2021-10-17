<%@include file="header.jsp" %>
  <div class="flex-fill flex-grow-1 ms-3">
  
  <h1>Registro de Proveedor</h1>
  
  <form method="post" action="ProveedorController?accion=addProveedor">
  
  	<div class="form-group">
  		<label for="nombre">Nombre del Proveedor</label>
  		<input type="text" class="form-control" name="nombre" id="descripcion" placeholder="Ingrese el nombre del proveedor" value="${proveedor.nombreProveedor}"/>
  		
  		<label for="direccion">Dirección del Proveedor</label>
  		<input type="text" class="form-control" name="direccion" id="direccion" placeholder="Ingrese la direccion del proveedor" value="${proveedor.direccionProveedor}"/>
  		
  		<label for="telefono">Teléfono del Proveedor</label>
  		<input type="text" class="form-control" name="telefono" id="telefono" placeholder="Ingrese el telefono del proveedor" value="${proveedor.telefonoProveedor}"/>
  	 	
  	 	<label for="persona">Persona de Contactor</label>
  		<input type="text" class="form-control" name="persona" id="persona" placeholder="Ingrese la persona de contacto" value="${proveedor.personaContactoProveedor}"/>	
  		
  	</div>
  	
  	<div class="form-check">
  <input class="form-check-input" type="checkbox" name="chkEstado" id="chkEstado" checked>
  <label class="form-check-label" for="flexCheckChecked">
    Activo
  </label>
</div>

<div>
<button type="submit" class="btn btn-primary">Guardar</button>
</div>
  
  </form>
  </div> 
</div>


<%@include file="footer.jsp" %>