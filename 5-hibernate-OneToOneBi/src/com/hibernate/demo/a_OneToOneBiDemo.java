package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class a_OneToOneBiDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			int id=2;
			session.beginTransaction();
			
			InstructorDetail istd = session.get(InstructorDetail.class, id);
			if(istd!=null) {
				Instructor ist = istd.getInstructor();
				System.out.println("Instructor is:" +ist);
			}
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}
		catch(Exception e) {
//			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
	}

}
