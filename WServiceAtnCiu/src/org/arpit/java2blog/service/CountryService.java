package org.arpit.java2blog.service;  
  
import java.util.List;  
import org.arpit.java2blog.dao.CountryDAO;  
import org.arpit.java2blog.bean.Country;  
import org.arpit.java2blog.bean.Contact;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import org.springframework.transaction.annotation.Transactional;  
  
@Service("countryService")  
public class CountryService {  
  
 @Autowired  
 CountryDAO countryDao;  
   
 /*
 @Transactional  
 public List<Country> getAllCountries() {  
  return countryDao.getAllCountries();  
 }  
  
 @Transactional  
 public Country getCountry(int id) {  
  return countryDao.getCountry(id);
 }    
 
 */

 @Transactional  
 public void addContact(Contact contact) {  
  countryDao.addContact(contact);  
 }
 
 @Transactional  
 public void deleteContact(int id) {  
  countryDao.deleteContact(id);  
 }
 
 
 @Transactional  
 public void updateContact(Contact contact) {  
  countryDao.updateContact(contact);  
  
 }
}