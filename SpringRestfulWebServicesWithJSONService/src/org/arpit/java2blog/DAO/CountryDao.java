package org.arpit.java2blog.DAO;

import java.util.List;

import org.arpit.java2blog.bean.Country;

public interface CountryDao {
	
	public List<Country> getCountries();
	public Country getCountryById(int id);

}
