package org.arpit.java2blog.controller;

/**	Invocacion
 * 	http://localhost:8080/SpringRestfulWebServicesWithJSONService/
 * 	http://localhost:8080/SpringRestfulWebServicesWithJSONService/countries
 * 	http://localhost:8080/SpringRestfulWebServicesWithJSONService/country/2
 */

import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.bean.Country;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// User's Objects
import org.arpit.java2blog.DAO.CountryDao;
import org.arpit.java2blog.DAOImpl.CountryDaoImpl;

@RestController  
public class CountryController {  

	// Service
	CountryDao countryDao = new CountryDaoImpl();

	@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")  
	public List<Country> getCountries(){  
		List<Country> lstCountry = new ArrayList<Country>(); 
		lstCountry = countryDao.getCountries();
		return lstCountry;  
	}
 
	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET,headers="Accept=application/json")  
	public Country getCountryById(@PathVariable int id){  
		Country country = new Country();
		country = countryDao.getCountryById(id);
		return country;
	}  
}