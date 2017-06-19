
/// http://localhost:8080/SpringWSRestfulHibernateJSONClient/jsp/registro.jsp

function getContact() {

     jQuery.ajax({
         type: "GET",
         url: "http://localhost:8080/SpringRestfulWebServicesWithJSONService/countries",
         //data: contact.toJsonString(),
         //contentType: "application/json; charset=utf-8",
         //dataType: "json",
        /* success: function (data, status, jqXHR) {
              // do something
         },
     
         error: function (jqXHR, status) {            
              // error handler
         }*/

     });
}

function addCountry() {
		
	var contact = '{"countryName": "ClientConsumRESTful","population": 30}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://192.168.15.104:8080/SpringWSRestfulHibernateJSONService/addCountry",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	alert("Insersion Realizada con Exito: ");
        },
    
        error: function (jqXHR, status) {            
             // error handler
        }
    });
}

function addContact() {
	
	var txtNombre = $('#txtNombre').val();
	var txtApellPaterno = $('#txtApellPaterno').val();
	var txtApellMaterno = $('#txtApellMaterno').val();
	var txtEmail = $('#txtEmail').val();
	var rdSexo = $('input:radio[name=rdSexo]:checked').val();
	
	
	var contact = '{"nombre":"'+txtNombre+'","apPaterno":"'+txtApellPaterno+'","apMaterno":"'+txtApellMaterno+'","email":"'+txtEmail+'","sexo":"'+rdSexo+'"}';
	
    jQuery.ajax({
        type: "POST",
        url: "http://localhost:8080/SpringWSRestfulHibernateJSONService/addContact",
        data: contact.toString(),
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        success: function (data, status, jqXHR) {
        	alert("Insersion Realizada con Exito: ");
        },
    
        error: function (jqXHR, status) {            
             // error handler
        }

    });
}

function ejemploJQuery(){
	$('<p>').text('Ejemplo del mensaje en JQuery').appendTo('#error-list').asError();
}