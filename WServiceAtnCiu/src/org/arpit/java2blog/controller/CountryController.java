package org.arpit.java2blog.controller;  

/**
 * http://localhost:8080/WServiceAtnCiu/addCountry
 * 
 
{
  "countryName": "India",
  "population": 20000
}
 
 */
  
import java.util.List;  
//import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.bean.Contact;
import org.arpit.java2blog.service.CountryService;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RestController;  
  
@RestController  
public class CountryController {  
   
 @Autowired  
 CountryService countryService;  
 /*  
 @RequestMapping(value = "/getAllCountries", method = RequestMethod.GET, headers = "Accept=application/json")  
 public List<Country> getCountries() {  
    
  List<Country> listOfCountries = countryService.getAllCountries();  
  return listOfCountries;  
 }  
  
 @RequestMapping(value = "/getCountry/{id}", method = RequestMethod.GET, headers = "Accept=application/json")  
 public Country getCountryById(@PathVariable int id) {  
  return countryService.getCountry(id);  
 }  
 
*/
 
 @RequestMapping(value = "/addContact", method = RequestMethod.POST, headers = "Accept=application/json")  
 public void addContact(@RequestBody Contact contact) {   
  countryService.addContact(contact);  
 }
 
 @RequestMapping(value = "/deleteContact/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
 public void deleteContact(@PathVariable("id") int id) {  
  countryService.deleteContact(id);    
 }
 
 @RequestMapping(value = "/updateContact", method = RequestMethod.PUT, headers = "Accept=application/json")  
 public void updateContact(@RequestBody Contact contact) {  
  countryService.updateContact(contact);  
 }
 
}