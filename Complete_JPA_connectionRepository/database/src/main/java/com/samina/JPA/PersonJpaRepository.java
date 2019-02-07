package com.samina.JPA;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.samina.Entity.Person;

@Repository
@Transactional
@ComponentScan("com.samina.Entity")
public class PersonJpaRepository {
	
	//connect to the database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);//JPA
	}
}