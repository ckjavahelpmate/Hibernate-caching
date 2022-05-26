package com.ty.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSavestudent {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		Student student = new Student() ;
		student.setName("kanakambari");
		student.setAge(22);
		
		entityTransaction.begin();
		
		entityManager.persist(student);
		
		entityTransaction.commit();
		
	}

}
