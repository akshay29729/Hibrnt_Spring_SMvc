package com.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class b2_ReadStudentDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {
			System.out.println("Creating new student object....");	
			session.beginTransaction();
			
			// Retrieve all students
			System.out.println("Retrieve all students....");
			List<Student> students = session.createQuery("from Student").getResultList();
			for(Student s: students){
				System.out.println(s);
			}
			
			//Retrieve all students with last name shinde
			
			System.out.println("Retrieve all students with last name 'shinde'....");
			List<Student> students1 = session.createQuery("from Student s where s.lastName='Shinde'").getResultList();
			for(Student s: students1){
				System.out.println(s);
			}
			
            //Retrieve all students with last name 'shinde' or first name is amit
			
			System.out.println("Retrieve all students with last name 'shinde' or first name is 'amit'....");
			List<Student> students2 = session.createQuery("from Student s where s.lastName='Shinde' "
					+ "OR s.firstName='Amit'").getResultList();
			for(Student s: students2){
				System.out.println(s);
			}
			
			session.getTransaction().commit();
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
