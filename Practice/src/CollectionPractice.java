import java.util.ArrayList;
import java.util.List;

public class CollectionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1= new ArrayList();
		List l2= new ArrayList();
		l1.add("A");
		l1.add("b");
		l1.add("c");
		l1.add("d");
		
		l2.add("z");
		l2.add("y");
		l2.add("x");
		l2.add("w");
		
		l2.addAll(2, l1);
		
		System.out.println(l2);
	}

}
