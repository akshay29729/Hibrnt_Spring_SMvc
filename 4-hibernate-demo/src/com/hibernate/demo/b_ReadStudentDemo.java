package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class b_ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {
			System.out.println("Creating new student object....");
			
			Student std = new Student("Samra","Donde","samra@mail.com");
			
			session.beginTransaction();
			session.save(std);
			session.getTransaction().commit();
			
			// Saved student primary key
			System.out.println("Student primary kry: "+std.getId());
			
			Session session2 = sf.getCurrentSession();
			session2.beginTransaction();
			Student std2 = session2.get(Student.class,std.getId());
			System.out.println("Student Added: "+std2);
			
			session2.getTransaction().commit();
			
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
