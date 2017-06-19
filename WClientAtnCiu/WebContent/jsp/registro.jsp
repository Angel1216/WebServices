<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<script src="../js/registro.js"></script>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script> <!-- "" -->
	
	<script type = "text/javascript">
/*        $(document).ready(function(){
            $('#Button1').click(function(otro){
                alert("Has escrito: ");
            });
        })*/    
    </script>
<title>Registro</title>
</head>
<body>
	<h1>Registro:</h1>
	<form id="frmRegistro">
			<table>
				<tr>
					<td><label for="txtNombre" id="lblNombre">Nombre: </label></td>
					<td><input type="text" name="txtNombre" id="txtNombre"></td>
				</tr>
				<tr>
					<td><label for="txtApellPaterno" id="lblApellPaterno">Apellido Paterno: </label></td>
					<td><input type="text" name="txtApellPaterno" id="txtApellPaterno"></td>
				</tr>
				<tr>
					<td><label for="txtApellMaterno">Apellido Materno: </label></td>
					<td><input type="text" name="txtApellMaterno" id="txtApellMaterno"></td>
				</tr>
				<tr>
					<td><label for="txtEmail">Email: </label></td>
					<td><input type="text" name="txtEmail" id="txtEmail"></td>
				</tr>
				<tr>
					<td><input type="radio" name="rdSexo" id="rdVaron" value="1"></td>
					<td><label for="rdVaron">Varón: </label></td>
				</tr>
				<tr>
					<td><input type="radio" name="rdSexo" id="rdMujer" value="2"></td>
					<td><label for="rdMujer">Mujer: </label></td>
				</tr>
				<tr>
					<td><input type="button" id="btnEnviar" onclick="addContact()" value="Enviar"></td>
				<!--  	<td><input type="reset" id="btnReset"></td>	-->
				</tr>
			</table>
			
			<div id="error-list">
			</div>
	</form>
	
	<h1>Eliminar:</h1>
	<form id="frmEliminar">
			<table>
				<tr>
					<td><label for="txtId" id="lblId">Id: </label></td>
					<td><input type="text" name="txtId" id="txtId"></td>
				</tr>
				<tr>
					<td><input type="button" id="btnEliminar" onclick="deleteContact()" value="Enviar"></td>
					<!--  <td><input type="reset" id="btnReset"></td>	-->
				</tr>
			</table>
			
			<div id="error-list">
			</div>
	</form>
	
	
	<h1>Actualizar:</h1>
	<form id="frmActualizar">
			<table>
				<tr>
					<td><label for="txtId2" id="lblId">Id: </label></td>
					<td><input type="text" name="txtId2" id="txtId2"></td>
				</tr>
				<tr>
					<td><label for="txtNombre2" id="lblNombre2">Nombre: </label></td>
					<td><input type="text" name="txtNombre2" id="txtNombre2"></td>
				</tr>
				<tr>
					<td><label for="txtApellPaterno2" id="lblApellPaterno2">Apellido Paterno: </label></td>
					<td><input type="text" name="txtApellPaterno2" id="txtApellPaterno2"></td>
				</tr>
				<tr>
					<td><label for="txtApellMaterno2">Apellido Materno: </label></td>
					<td><input type="text" name="txtApellMaterno2" id="txtApellMaterno2"></td>
				</tr>
				<tr>
					<td><label for="txtEmail2">Email: </label></td>
					<td><input type="text" name="txtEmail2" id="txtEmail2"></td>
				</tr>
				<tr>
					<td><input type="radio" name="rdSexo2" id="rdVaron2" value="1"></td>
					<td><label for="rdVaron2">Varón: </label></td>
				</tr>
				<tr>
					<td><input type="radio" name="rdSexo2" id="rdMujer2" value="2"></td>
					<td><label for="rdMujer2">Mujer: </label></td>
				</tr>
				<tr>
					<td><input type="button" id="btnEnviar2" onclick="updateContact()" value="Actualizar"></td>
				<!--  	<td><input type="reset" id="btnReset"></td>	-->
				</tr>
			</table>
			
			<div id="error-list">
			</div>
	</form>
	
</body>
</html>