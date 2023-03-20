package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class c_UpdateStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {
			int studentId = 1;
			session.beginTransaction();
			
			System.out.println("Updating student object....");
			Student std = session.get(Student.class, studentId);
			System.out.println("Original student object...."+std);
			
			std.setFirstName("Akshay");
			System.out.println("Updated student object...."+std);
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
