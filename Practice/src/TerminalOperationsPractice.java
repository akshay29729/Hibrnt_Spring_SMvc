import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperationsPractice {
	
//	public static String joining_1() {
//		
//	 return	Student.getStudents().stream()
//		       .map(Student::getName)
//		       .collect(Collectors.joining(","));
//	}
//	
//	public static long counting_1() {
//		
//		 return	Student.getStudents().stream()
//			       .map(Student::getName)
//			       .collect(Collectors.counting());
//	}
//
//	public static List<String> mapping_1() {
//		
//		 return	Student.getStudents().stream()
//			       .collect(Collectors.mapping(Student::getName,Collectors.toList()));
//	}
	
//	public static Optional<Student> minBy_1() {
//		
//		return Student.getStudents().stream()
//		       .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
//	}
//	
//    public static Optional<Student> maxBy_1() {
//		
//		return Student.getStudents().stream()
//		       .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
//	}
//    
//    public static double averaging_1(){
//		
//		return Student.getStudents().stream()
//		       .collect(Collectors.averagingDouble(Student::getGpa));
//	}
//    
//    public static double summing_1(){
//		
//		return Student.getStudents().stream()
//		       .collect(Collectors.summingDouble(Student::getGpa));
//	}
	
	
	public static Map<Double, List<Student>> groupBy_1() {
		return Student.getStudents().stream()
		       .collect(Collectors.groupingBy(Student::getGpa));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println(joining_1());
//		System.out.println(counting_1());
//		System.out.println(mapping_1());
		
		
//		Optional<Student> student1 = minBy_1();
//		if(student1.isPresent())
//			System.out.println(student1.get());
//		
//		Optional<Student> student = maxBy_1();
//		if(student.isPresent())
//			System.out.println(student.get());
		
		
//		System.out.println(averaging_1());
//		System.out.println(summing_1());
		
		
		Map<Double, List<Student>> map = groupBy_1();
		System.out.println(map);
	}

}
