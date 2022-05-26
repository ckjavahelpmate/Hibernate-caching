package com.ty.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestCaching {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager1 = entityManagerFactory.createEntityManager() ;
		EntityManager entityManager2 = entityManagerFactory.createEntityManager() ;
		
		Student student1 = entityManager1.find(Student.class, 1) ; 
		System.out.println( student1 );
		
		Student student3 = entityManager1.find(Student.class, 3) ; 
		System.out.println( student3 );
		
		Student student2 = entityManager2.find(Student.class, 3) ; 
		System.out.println( student2 );
		
		Student student4 = entityManager2.find(Student.class, 1) ; 
		System.out.println( student4 );

	}

}
