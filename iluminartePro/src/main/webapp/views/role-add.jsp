<%@include file="header.jsp" %>
  <div class="flex-fill flex-grow-1 ms-3">
  
  <h1>Registro de Roles</h1>
  
  <form method="post" action="TipoRolController?accion=addRol">
  	
  	<div class="form-group">
  		<label for="nombre">Nombre Rol</label>
  		<input type="text" class="form-control" name="nombre" id="descripcion" placeholder="Ingrese el nombre del rol" value="${roles.idRol}"/>
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