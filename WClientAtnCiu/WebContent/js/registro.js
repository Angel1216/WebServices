
/// http://localhost:8080/WClientAtnCiu/jsp/registro.jsp

function addContact() {
	
	var txtNombre = $('#txtNombre').val();
	var txtApellPaterno = $('#txtApellPaterno').val();
	var txtApellMaterno = $('#txtApellMaterno').val();
	var txtEmail = $('#txtEmail').val();
	var rdSexo = $('input:radio[name=rdSexo]:checked').val();
	
	
	var contact = '{"nombre":"'+txtNombre+'","apPaterno":"'+txtApellPaterno+'","apMaterno":"'+txtApellMaterno+'","email":"'+txtEmail+'","sexo":"'+rdSexo+'"}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/WServiceAtnCiu/addContact",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }

    });
}

function deleteContact() {
	
	var txtId = $('#txtId').val();
	
    jQuery.ajax({
        type: "DELETE",
        url: "http://localhost:8080/WServiceAtnCiu/deleteContact/"+txtId,
        success: function (data, status, jqXHR) {
        	alert("Eliminación realizada con éxito");
        },
    
        error: function (jqXHR, status) {            
        	alert("Error");
        }

    });
}


function updateContact() {
	
	var txtId = $('#txtId2').val();
	var txtNombre = $('#txtNombre2').val();
	var txtApellPaterno = $('#txtApellPaterno2').val();
	var txtApellMaterno = $('#txtApellMaterno2').val();
	var txtEmail = $('#txtEmail2').val();
	var rdSexo = $('input:radio[name=rdSexo2]:checked').val();
	
	
	var contact = '{"id":"'+txtId+'","nombre":"'+txtNombre+'","apPaterno":"'+txtApellPaterno+'","apMaterno":"'+txtApellMaterno+'","email":"'+txtEmail+'","sexo":"'+rdSexo+'"}';
	
    jQuery.ajax({
        type: "PUT",
        url: "http://localhost:8080/WServiceAtnCiu/updateContact",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	// rest
        },
    
        error: function (jqXHR, status) {            
        	// rest
        }

    });
}


function ejemploJQuery(){
	$('<p>').text('Ejemplo del mensaje en JQuery').appendTo('#error-list').asError();
}