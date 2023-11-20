package com.cg;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestJPQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager entitymanager=emfactory.createEntityManager();
		Query query=entitymanager.createQuery("Select UPPER(e.employeeName)from Employee e");
		List<String> list=query.getResultList();
		for(String e:list) {
			System.out.println("Employee NAME :"+ e);
		}
		Query query1=entitymanager.createQuery("Select MAX(e.salary)from Employee e");
		Double result=(Double)query1.getSingleResult();
		System.out.println("MAx Employee salary :"+result);

	}

}
