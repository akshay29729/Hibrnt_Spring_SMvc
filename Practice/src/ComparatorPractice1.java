import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorPractice1{
	 static Comparator<Integer> comp = (x, y)->{
		return y.compareTo(x);
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		list.add(11);
		list.add(2);
		list.add(12);
		list.add(3);
		list.add(1);
		
//		list.sort(comp);
		Collections.sort(list,comp);
		System.out.println(list);	
	}

}
