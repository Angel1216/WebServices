package org.arpit.java2blog.dao;  
  
import java.util.List;  
  
import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.bean.Contact;
import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Repository;  
  
@Repository  
public class CountryDAO {
  
 @Autowired  
 private SessionFactory sessionFactory;  
  
 public void setSessionFactory(SessionFactory sf) {  
  this.sessionFactory = sf;  
 }  
 
 /*
 public List<Country> getAllCountries() {  
  Session session = this.sessionFactory.getCurrentSession();  
  List<Country> countryList = session.createQuery("from Country").list();  
  return countryList;  
 }  
  
 public Country getCountry(int id) {  
  Session session = this.sessionFactory.getCurrentSession();  
  Country country = (Country) session.load(Country.class, new Integer(id));  
  return country;  
 }  
    
 */
 
 	public Contact addContact(Contact contact) {  
	  Session session = this.sessionFactory.getCurrentSession();  
	  session.persist(contact);  
	  return contact;  
 	}
 	
 	public void deleteContact(int id) {  
 		  Session session = this.sessionFactory.getCurrentSession();  
 		  Contact p = (Contact) session.load(Contact.class, new Integer(id));  
 		  if (null != p) {  
 		   session.delete(p);  
 		  }  
 	}
 	
 	public void updateContact(Contact contact) {  
 		  Session session = this.sessionFactory.getCurrentSession();  
 		  session.update(contact);  
 	}
}