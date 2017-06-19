package jersey.rest.client;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status.Family;

import rest.beans.Alumno;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class JerseyRestClient {
	
	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		alumno.setDni("45698732T");
		alumno.setNombre("Sherly");
		alumno.setApellidos("Holmes");
		alumno.setDireccion("Baker Street");
		
		
		Client client = Client.create();
		WebResource resource = client.resource("http://localhost:8080/Spring3RESTfulJSONService/instituto/rest/alumno/");
		
		resource.type(MediaType.APPLICATION_JSON_TYPE);
		resource.accept(MediaType.APPLICATION_JSON_TYPE);
		
		//ClientResponse response = resource.post(ClientResponse.class, alumno);
		
		ClientResponse response = resource.put(ClientResponse.class, alumno);
		
		//ClientResponse response = resource.delete(ClientResponse.class);
		
		
		if (response.getClientResponseStatus().getFamily() == Family.SUCCESSFUL) {
		    System.out.println("Success! " + response.getStatus());
		    System.out.println(response.getEntity(String.class));
		} else {
		    System.out.println("ERROR! " + response.getStatus());    
		    System.out.println(response.getEntity(String.class));
		}
		
		


	}

}