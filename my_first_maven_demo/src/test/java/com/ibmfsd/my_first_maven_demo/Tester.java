package com.ibmfsd.my_first_maven_demo;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Tester 
{
    public static void main( String[] args )
    {try {
       SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
       Session session = factory.openSession();
      // Employee employee = new Employee("Sachin","Tendulkar","sachin@gmail.com","India");
     //Employee employee1 = new Employee("Ajeet","Giri","ajeet@gmail.com","India");
       session.getTransaction().begin();
      //Integer  a = (Integer)session.save(employee);
      //session.persist(employee1);
      //System.out.println("Inserted");
      session.getTransaction().commit();
       Query query =session.createQuery("from Employee");
       List<Employee> list = query.getResultList();
       for (Employee e:list)
       {
    	   System.out.println(e);
       }
    }catch (Exception e) {
    	
    	e.printStackTrace();
    	
    }
}
}

