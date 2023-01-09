package org.jsp.controller;

import java.util.ArrayList;
import java.util.List;

import org.jsp.dao.Flipkart_Items_Dao;
import org.jsp.dto.Flipkart;
import org.jsp.dto.Items;

public class Flipkart_Items_Controller {

	public static void main(String[] args) {
		
		Flipkart flipkart=new Flipkart();
		flipkart.setId(1001);
		flipkart.setName("shubam");
		flipkart.setEmail("ravi@gmail.com");
		flipkart.setPassword("1234yug");
		flipkart.setMobileno(456123789);		
		
		Items items=new Items();
		items.setId(2000);
		items.setName("jhgj");
		items.setPrice(200);
		items.setBrand("mscjhollection");

		Items items2=new Items();
		items2.setId(2001);
		items2.setPrice(250);
		items2.setBrand("mscollection");
		items2.setName("earring");
		
		List<Items>list=new ArrayList<Items>();
		list.add(items);
		list.add(items2);
		flipkart.setItems(list);		
		
		Flipkart_Items_Dao dao=new Flipkart_Items_Dao();
	//	dao.saveFlipkart(flipkart);
	//	dao.updateFlipkartItems(1001, list);
	//	dao.updateFlipkartUserDetails(flipkart);
	//	dao.findFlipkart(1001);
	//	dao.findAll(flipkart);
	//	dao.deleteFlipkart(1001);
		
		
	}
}
