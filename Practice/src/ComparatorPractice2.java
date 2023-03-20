import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice2{
	 static Comparator<Student> nameComparator = (x, y)->{
		return x.getName().compareTo(y.getName());
	};
	
	 static Comparator<Student> gradeComparator = (x, y)->{
		    Double d1 = x.getGrade();
		    Double d2 = y.getGrade();
		    return -d1.compareTo(d2);
		};

	public static void main(String[] args) {	
		
		List<Student> list = Student.getStudents();
		
		System.out.println(list);
		Collections.sort(list,nameComparator.thenComparing(gradeComparator) );
		System.out.println(list);
	}

}
