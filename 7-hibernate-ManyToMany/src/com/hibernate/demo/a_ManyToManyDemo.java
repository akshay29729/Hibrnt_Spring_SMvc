package com.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.demo.entity.Course;
import com.hibernate.demo.entity.Instructor;
import com.hibernate.demo.entity.InstructorDetail;
import com.hibernate.demo.entity.Review;
import com.hibernate.demo.entity.Student;

public class a_ManyToManyDemo {

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
			
			session.beginTransaction();
		
			Course course1 = new Course("Physics");
			session.save(course1);
			
			System.out.println("Saved Course: "+ course1);

			Student std1 = new Student("Akshay","Shinde","akshay@gmail.com");
			Student std2 = new Student("Amar","Shinde","amar@gmail.com");
			
			course1.addStudent(std1);
			course1.addStudent(std2);
			
			session.save(std1);
			session.save(std2);

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
