import java.util.Comparator;

public class Comp implements Comparator{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer i =10;
		Integer j =1;
		System.out.println(i.compareTo(j));
		System.out.println(new Comp().compare(i,j));
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Integer i = (Integer) o1;
		Integer j = (Integer) o2;
		
		String s1 = "akshay";
		String s2 ="akshaya";
		System.out.println(s1.compareTo(s2));
		
		return i.compareTo(j);
		
		// or
//		return -j.compareTo(i);
		
		// or
//		return j.compareTo(i);

//		if(i<j)
//			return 1;
//		else if(i>j)
//			return -1;
//		else
//			return 0;
		
	}
}
