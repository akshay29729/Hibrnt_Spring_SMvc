package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class a1_PrimaryKeyDemo {

	public static void main(String[] args) {
		// Added GeneratedValue annotation in student class
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {
			System.out.println("Creating new student object....");
			
			Student std1 = new Student("Amar","Bhide","amar@mail.com");
			Student std2 = new Student("Andy","Nile","andy@mail.com");
			Student std3 = new Student("Amit","Shan","amit@mail.com");

			
			session.beginTransaction();
			session.save(std1);
			session.save(std2);
			session.save(std3);
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
