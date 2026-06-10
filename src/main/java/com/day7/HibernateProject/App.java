package com.day7.HibernateProject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.day7.HibernateProject.entity.Category;
import com.day7.HibernateProject.entity.Product;
import com.day7.HibernateProject.entity.ProductId;
import com.day7.HibernateProject.entity.User;



public class App {
    public static void main(String[] args) {
 
//    	Configuration hibernateConfiguration = new Configuration();
//    	hibernateConfiguration.configure("First.cfg.xml");
//    	hibernateConfiguration.addAnnotatedClass(Category.class);
//    	
//    	try(SessionFactory sessionFactory = hibernateConfiguration.buildSessionFactory();
//    			Session hibernateSession = sessionFactory.openSession()){
//    		
//    		Query<Category> allcategories = hibernateSession.createQuery("from Category",Category.class);
//    		
//    		List<Category> resultList = allcategories.getResultList();
//    		
//    		resultList.forEach(System.out::println);
    //	}

    	
    	Configuration hibernateConfiguration = new Configuration();
    	hibernateConfiguration.configure("First.cfg.xml");
    	hibernateConfiguration.addAnnotatedClass(User.class);
    	hibernateConfiguration.addAnnotatedClass(Category.class);
    	hibernateConfiguration.addAnnotatedClass(Product.class);
    	
    	try(SessionFactory sessionFactory = hibernateConfiguration.buildSessionFactory();
    			Session hibernateSession = sessionFactory.openSession()){
    		
    		ProductId pId = new ProductId(3,7);
    		Product objProduct = new Product();
    		
    		objProduct.setpId(pId);
    		objProduct.setProductName("Nike");
    		
    		objProduct.setProductImageUrl("abajc");
    		objProduct.setProductPrice("12000");
    		
    		Transaction transaction = hibernateSession.beginTransaction();
    		
    		hibernateSession.persist(objProduct);
    		transaction.commit();
    		System.out.println("record saved");
    		
    	}
    }
}
