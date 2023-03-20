import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private double Gpa;
	private double Grade;
	
	public Student(String name, double d, double e) {
		this.name = name;
		Gpa = d;
		Grade = e;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGpa() {
		return Gpa;
	}
	public void setGpa(double gpa) {
		Gpa = gpa;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", Gpa=" + Gpa + ", Grade=" + Grade + "]";
	}
	
	public static List<Student> getStudents(){
		Student s1 = new Student("Merry",3.5,7.5);
		Student s2 = new Student("Jerry",3.0,7.5);
		Student s3 = new Student("Perry",4.5,8.0);
		Student s4 = new Student("Terry",4.5,8.5);
		Student s5 = new Student("Merry",2.5,7.8);

		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
		return students;
	}
	
	public static Student getSingleSTudent() {
		return new Student("Merry",3.5,7.5);
	}
}
