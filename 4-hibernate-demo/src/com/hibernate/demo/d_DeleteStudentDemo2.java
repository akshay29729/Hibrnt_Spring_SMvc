package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Student;

public class d_DeleteStudentDemo2 {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {
			int studentId = 1;
			session.beginTransaction();
			
			System.out.println("Delete student with ID=1....");
			Student std = session.get(Student.class, studentId);
			session.delete(std);
			
			System.out.println("Delete student with ID=2....");
			session.createQuery("delete from Student  where id=2").executeUpdate();
			
			session.getTransaction().commit();
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
