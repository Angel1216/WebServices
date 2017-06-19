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
	<h1>Captura los siguientes datos:</h1>
	
	<form method="get">
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
					<td><input type="button" id="btnEnviar" onclick="addCountry()" value="Enviar"></td>
					<td><input type="reset" id="btnReset"></td>
				</tr>
			</table>
			
			<div id="error-list">
			</div>
	</form>
	
</body>
</html>