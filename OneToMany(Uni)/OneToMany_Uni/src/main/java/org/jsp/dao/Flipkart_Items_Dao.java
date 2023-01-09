package org.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.jsp.dto.Flipkart;
import org.jsp.dto.Items;



public class Flipkart_Items_Dao {

	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public void saveFlipkart(Flipkart flipkart) {
		entityTransaction.begin();
		entityManager.persist(flipkart);
		entityTransaction.commit();
	}
	
	public void updateFlipkartItems(int id,List<Items>items) {
		entityTransaction.begin();
		Flipkart flipkart  =entityManager.find(Flipkart.class, id);
		List<Items> items2=flipkart.getItems();
		items2.addAll(items);
		flipkart.setItems(items2);
		entityManager.merge(flipkart);
		entityTransaction.commit();		
	}
	
	public void updateFlipkartUserDetails(Flipkart flipkart) {
		entityTransaction.begin();
		List<Items> items2=flipkart.getItems();
		flipkart.setItems(items2);
		entityManager.merge(flipkart);	
		entityTransaction.commit();
	}
	
	public void findFlipkart(int id) {
		Flipkart flipkart=entityManager.find(Flipkart.class, id);
		entityTransaction.begin();
 	   if(flipkart !=null)
 			{
 				System.out.println(flipkart);
 			}
 			else {
 				System.out.println("Id not found");
 			}
	}
	
	 public void deleteFlipkart(int id) {
		 Flipkart flipkart=entityManager.find(Flipkart.class, id);
	   		entityTransaction.begin();
	   		if(flipkart != null)
	   		{
	   			entityManager.remove(flipkart);
	   			entityTransaction.commit();
	   		}
	   		else {
	   			System.out.println("Object not found");
	   		}
	       }
	       
	 public List<Flipkart> findAll(Flipkart flipkart) {
			Query query=entityManager.createQuery("select a From Flipkart a");
			System.out.println(flipkart);
	 		return query.getResultList();
	 		
	 		
		}
	
	
}
