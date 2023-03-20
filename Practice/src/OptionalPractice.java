import java.util.Optional;

public class OptionalPractice {
	
	public static Optional<String> ofNullableMethod() {
		return Optional.ofNullable(null);
	}
	
	public static Optional<String> ofMethod() {
		return Optional.of("Akshay");
	}

	public static Optional<String> emptyMethod() {
		return Optional.empty();
	}
	
	public static String orElse(){
		
//		Optional<Student> std = Optional.ofNullable(Student.getSingleSTudent());
		Optional<Student> std = Optional.ofNullable(null);
	    return std.map(Student::getName).orElse("AKshay");
	}
	
    public static String orElseThrow(){
		
//		Optional<Student> std = Optional.ofNullable(Student.getSingleSTudent());
		Optional<Student> std = Optional.ofNullable(null);
	    return std.map(Student::getName).orElseThrow(()-> new RuntimeException("No Object found"));
	}
    
    public static void optionalFilter() {
    	Optional<Student> std= Optional.ofNullable(Student.getSingleSTudent());
    	
    	std.map(Student::getName).filter((s)-> s!="Akshay").ifPresent(s-> System.out.println(s));
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		Optional<String> optional = emptyMethod();
//		System.out.println(optional);
////		System.out.println(optional.get());
		
//		System.out.println(orElseThrow());
		
		
		optionalFilter();
	}

}
