package com.cg;
import com.cg.entity.Employee;
import com.cg.entity.Person;
import com.cg.entity.Student;
import com.cg.util.JPAUtil;
import jakarta.persistence.EntityManager;
public class AppDemo {
	public static void main(String[] args) {
			EntityManager em=JPAUtil.getEntityManagerFactory().createEntityManager();
			
			Person p=new Person();
			p.setName("Rupa");
			p.setGender("Female");
			
			Employee e=new Employee();
			e.setBonus(5678d);
			e.setDeptName(("IT"));
			e.setEmailId("rupasri@gmail.com");
			e.setName("rupa");
			e.setGender("Male");
			
			Student s=new Student();
			s.setName("anitha");
			s.setGender("Female");
			s.setFee(4566d);
			s.setSchoolName("zph school");
			s.setSectionName("A");
			
			em.getTransaction().begin();
			em.persist(p);
			em.persist(e);
			em.persist(s);
			em.getTransaction().commit();
			JPAUtil.shutdown();
			
			
			
			
	}

}
