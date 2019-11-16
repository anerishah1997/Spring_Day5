package com.lti.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	
	// This method will be executed for the first and last time when this class is called for the first time.
	static{
		factory = Persistence.createEntityManagerFactory("JPA-PU");
	}
	
	public static EntityManager getEntityManager(){
		if(entityManager == null || !entityManager.isOpen())
			entityManager = factory.createEntityManager();
		return entityManager;
	}

}
