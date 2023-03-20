import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalPractice {

	
	// 1- Consumer 
//	public static Consumer<String> c1 = (string)->{
//		System.out.println(string.toUpperCase());
//	};
//	
//	
//	public static BiConsumer<Integer,Integer> c2 = (x,y)->{
//		System.out.println("Multiplication of x:"+x+" and y:"+y+" is "+x*y);
//	};
//	
//	public static BiConsumer<Integer,Integer> c3 = (x,y)->{
//		System.out.println("Division of x:"+x+" and y:"+y+" is "+x/y);
//	};
	
	// 2-Predicate
//	public static Predicate<String> p1 =(s)->{
//		return s.toLowerCase().charAt(0)=='a';
//	};
//	
//	public static Predicate<Integer> p2 =(s)->{
//		return s%2==0;
//	};
//	
//	public static Predicate<Integer> p3 =(s)->{
//		return s%5==0;
//	};
//	
//	public static  boolean isDivisibleBy2And5(int x) {
//		return p2.and(p3).test(x);
//	}
//	
//	public static  boolean isDivisibleBy2OR5(int x) {
//		return p2.or(p3).test(x);
//	}
	
//	public static BiPredicate<Integer,Integer> p4 = (x,y)->{
//		if(x%y==0||y%x==0) {
//			return true;
//		}
//		return false;
//	};
//	
//	public static boolean areMultiples(int x,int y) {
//		return p4.test(x, y);
//	}
	
	
	// 3-Function
	
	public static Function<String,String>  f1 = (s)->{
		return s.toUpperCase();
	};
	
	public static Function<String,String>  f2 = (s)->{
		return s.substring(0, 3).concat("_Shinde");
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1-Consumer
//		c1.accept("Akshay");
//		c2.accept(4, 5);
//		c2.andThen(c3).accept(10, 4);
		
		
		// 2-Predicate
//		System.out.println(p1.test("Shankar"));
//		System.out.println(p2.test(5));
//		System.out.println(new FunctionalPractice().isDivisibleBy2And5(8));
//		System.out.println(new FunctionalPractice().isDivisibleBy2OR5(8));
		
//		System.out.println(new FunctionalPractice().areMultiples(16, 66));
//		System.out.println(p4.test(16, 66));
		
		
		//3-Function
		
//		System.out.println(f1.apply("Akshay"));
//		System.out.println(f1.andThen(f2).apply("Akshay"));
//		System.out.println(f1.compose(f2).apply("Akshay"));
		
		

	}

}
