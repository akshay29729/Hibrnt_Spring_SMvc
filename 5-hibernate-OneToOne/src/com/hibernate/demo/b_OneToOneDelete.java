package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class b_OneToOneDelete {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			int id=1;
			session.beginTransaction();
			
			Instructor ist = session.get(Instructor.class, id);
			session.delete(ist);
			
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
