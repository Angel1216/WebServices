package com.crunchify.tutorials;

/**
 * @author Crunchify.com
 * 
 */
 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
 
import javax.print.attribute.standard.Media;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.crunchify.entities.Persona;

@Path("/")
public class CrunchifyRESTService {
	
	@POST
	@Path("/crunchifyService")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response crunchifyREST(InputStream incomingData) {
		StringBuilder crunchifyBuilder = new StringBuilder();
		try { 
			BufferedReader in = new BufferedReader(new InputStreamReader(incomingData));
			System.out.print("in.readLine() (SERVICE): ");
			System.out.println(in.readLine());
			String line = null;
			while ((line = in.readLine()) != null) {
				crunchifyBuilder.append(line);
			}
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}

		// return HTTP response 200 in case of success
		return Response.status(200).entity(crunchifyBuilder.toString()).build();
	}
	
	@GET
	@Path("/verify")
	@Produces(MediaType.TEXT_PLAIN)
	public Response verifyRESTService(InputStream incomingData) {
		String result = "CrunchifyRESTService Successfully started..";
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	
	@GET
	@Path("/saludo/{name}")
	@Produces(MediaType.TEXT_PLAIN)
	public Response saludo(@PathParam(value="name") String name) {
		String result = "Hola " + name;
 
		// return HTTP response 200 in case of success
		return Response.status(200).entity(result).build();
	}
	
	@GET
	@Path("/JSON")
	@Produces(MediaType.APPLICATION_JSON)
	public Response JSON() {
		String result = "Hola Angel";
 
		// Logica para obtener los datos de la persona
		Persona p = new Persona();
		p.setNombre("Angel");
		p.setApellido("Martinez");
		p.setEdad(21);
				
		// return HTTP response 200 in case of success
		return Response.status(200).entity(p.toString()).build();
	}

}
