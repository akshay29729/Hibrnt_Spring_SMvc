package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class c_ManyToManyDeleteCourse {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .addAnnotatedClass(Course.class)
				              .addAnnotatedClass(Review.class)
				              .addAnnotatedClass(Student.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			int id=10;
			session.beginTransaction();
			
			Course course = session.get(Course.class, id);
			
			session.delete(course);
			
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}finally {
			sf.close();
		}
		
	}

}
