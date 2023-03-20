package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;

public class a_OneToManyUniDemo {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .addAnnotatedClass(Course.class)
				              .addAnnotatedClass(Review.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			
			session.beginTransaction();
		
			Course course1 = new Course("Physics");
			course1.addReview(new Review("Very Nice course..."));
			course1.addReview(new Review("Keep Updating..."));
			course1.addReview(new Review("Outof date information..."));

			session.save(course1);

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
