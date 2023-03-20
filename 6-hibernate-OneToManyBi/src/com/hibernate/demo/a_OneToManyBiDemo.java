package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class a_OneToManyBiDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .addAnnotatedClass(Course.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			Instructor instructor = new Instructor("Akshay","Shinde","akshay@mail.com");
			InstructorDetail instductorDetails = new InstructorDetail("www.solveMTP.com/youtube","Reading");
			
			instructor.setInstructorDetail(instductorDetails);
			
			session.beginTransaction();
			session.save(instructor);
			
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
