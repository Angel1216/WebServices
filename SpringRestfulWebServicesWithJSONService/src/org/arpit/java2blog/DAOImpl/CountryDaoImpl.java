package org.arpit.java2blog.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.DAO.CountryDao;
import org.arpit.java2blog.bean.Country;

public class CountryDaoImpl implements CountryDao {

	@Override
	public List<Country> getCountries() {
		List<Country> listOfCountries = new ArrayList<Country>();  
		listOfCountries=createCountryList();  
		return listOfCountries;
	}

	@Override
	public Country getCountryById(int id){
		List<Country> listOfCountries = new ArrayList<Country>();  
		  listOfCountries=createCountryList();  
		  
		  for (Country country: listOfCountries) {  
		   if(country.getId()==id)  
		    return country;  
		  }  
		    
		  return null;
	}
	
	// Utiliy method to create country list.  
	 public List<Country> createCountryList()  
	 {  
	  Country indiaCountry=new Country(1, "India");  
	  Country chinaCountry=new Country(4, "China");  
	  Country nepalCountry=new Country(3, "Nepal");  
	  Country bhutanCountry=new Country(2, "Bhutan");  
	  
	  List<Country> listOfCountries = new ArrayList<Country>();  
	  listOfCountries.add(indiaCountry);  
	  listOfCountries.add(chinaCountry);  
	  listOfCountries.add(nepalCountry);  
	  listOfCountries.add(bhutanCountry);  
	  return listOfCountries;  
	 }
}
