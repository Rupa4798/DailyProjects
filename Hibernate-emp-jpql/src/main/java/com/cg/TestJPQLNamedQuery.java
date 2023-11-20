package com.cg;

import java.util.List;

import com.cg.entity.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class TestJPQLNamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("PERSISTENCE");
		EntityManager entitymanager=emfactory.createEntityManager();
		
		Query query=entitymanager.createNamedQuery("find employee by id");
		
		
		query.setParameter("id", 1);
		List <Employee> list=query.getResultList();
		for(Employee e : list) { 
			System.out.println("Employee id "+ e.getEmployeeId());
			System.out.println("Employee Name "+ e.getEmployeeName());

			System.out.println("Employee Salary "+ e.getSalary());

		}
		
		
		

	}

}
