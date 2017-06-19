package com.ws.service;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;

import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONArray;
import org.json.JSONObject;


/**
 * 
 * @author AML
 * 
 */

@Path("/")
public class CalculatorWService {
	
	@POST
	@Path("/sumar")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response sumar(InputStream numeros){
		
		System.out.println("Entra al Metodo SUMAR del WebService por la Tecnologia RESTful");
		int total = 0;
		
		StringBuilder numerosBuilder = new StringBuilder();
		try { 
			BufferedReader in = new BufferedReader(new InputStreamReader(numeros));
			numerosBuilder.append(in.readLine());
			System.out.print("numerosBuilder (SERVICE CALCULATOR): ");
			System.out.println(numerosBuilder);
			
			JSONObject obj = new JSONObject(numerosBuilder.toString());
			System.out.println("1.- : " + obj.getString("suma"));
			
			JSONObject objX = new JSONObject(obj.getString("suma").toString());
			System.out.println("2.- : " + objX.getString("x"));
			
			JSONObject objY = new JSONObject(obj.getString("suma").toString());
			System.out.println("3.- : " + objY.getString("y"));
			
			JSONObject objZ = new JSONObject(obj.getString("suma").toString());
			System.out.println("3.- : " + objZ.getString("z"));
			
			total = Integer.parseInt(objX.getString("x")) + Integer.parseInt(objY.getString("y")) + Integer.parseInt(objZ.getString("z")); 
			System.out.println("Suma Total (SERVICE): " + total);
			
/*			JSONObject jsonObjectNumeros = new JSONObject(numerosBuilder.toString());
			Iterator x = jsonObjectNumeros.keys();
			JSONArray jsonArray = new JSONArray();

			while (x.hasNext()){
			    String key = (String) x.next();
			    System.out.println("key: " + key);
			    jsonArray.put(jsonObjectNumeros.get(key));
			}
			
			
			
			System.out.print("Total Array: ");
			System.out.println(jsonArray.length());
			System.out.println("Casteo bien el JSONArray");

//			String line = null;
//			while ((line = in.readLine()) != null) {
//				crunchifyBuilder.append(line);
//			}
 * 
 */
		} catch (Exception e) {
			System.out.println("Error Parsing: - ");
		}

		// return HTTP response 200 in case of success
		return Response.status(200).entity(String.valueOf(total)).build();
	}
	
}
