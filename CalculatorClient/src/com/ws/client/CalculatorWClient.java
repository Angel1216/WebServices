package com.ws.client;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

public class CalculatorWClient {
	
	public static void main(String[] args) {
		String string = "";
		try {
 
			// Step1: Let's 1st read file from fileSystem
			// Change CrunchifyJSON.txt path here
			InputStream crunchifyInputStream = new FileInputStream("/Users/Angel/Documents/CalculatorJSON.txt");
			InputStreamReader crunchifyReader = new InputStreamReader(crunchifyInputStream);
			BufferedReader br = new BufferedReader(crunchifyReader);
			String line;
			while ((line = br.readLine()) != null) {
				string += line + "\n";
			}
 
			JSONObject jsonObject = new JSONObject(string);
			System.out.print("jsonObject CALCULATOR (CLIENTE): ");
			System.out.println(jsonObject);
 
			// Step2: Now pass JSON File Data to REST Service
			try {
				URL url = new URL("http://localhost:8080/CalculatorService/api/sumar");
				URLConnection connection = url.openConnection();
				connection.setDoOutput(true);
				connection.setRequestProperty("Content-Type", "application/json");
				connection.setConnectTimeout(1000000);
				connection.setReadTimeout(1000000);
				OutputStreamWriter out = new OutputStreamWriter(connection.getOutputStream());
				out.write(jsonObject.toString());
				out.close();
 
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
 
				String result = in.readLine();
				
				System.out.println("Resultado (CLIENT): " + result);
				
//				while (in.readLine() != null) {
//				}
				
				System.out.println("\nCalculator REST Service Invoked Successfully..");
				in.close();
			} catch (Exception e) {
				System.out.println("\nError while calling Calculator REST Service");
				System.out.println(e);
			}
 
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
