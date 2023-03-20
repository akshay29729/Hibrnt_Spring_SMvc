package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;

public class b_OneToManyAddCourses {

	public static void main(String[] args) {
		
		SessionFactory sf = new Configuration()
				              .configure("hibernate.cfg.xml")
				              .addAnnotatedClass(Instructor.class)
				              .addAnnotatedClass(InstructorDetail.class)
				              .addAnnotatedClass(Course.class)
				              .buildSessionFactory();
		
		Session session = sf.getCurrentSession();
		
		try {	
			int id=1;
			session.beginTransaction();
			
			Instructor ist = session.get(Instructor.class, id);
			
			Course course1 = new Course("Physics");
			Course course2 = new Course("Mathematics");
			Course course3 = new Course("Chemistry");
			
			ist.addCourse(course1);
			ist.addCourse(course2);
			ist.addCourse(course3);
			
			session.save(course1);
			session.save(course2);
			session.save(course3);
			
			
			session.getTransaction().commit();
			
			System.out.println("Done....");
			
		}catch(Exception e) {
//			System.out.println(e.getMessage());	
			e.printStackTrace();
		}
		finally {
			session.close();
			sf.close();
		}
		
	}

}
