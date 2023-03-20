
public class UseFunction {

	public static void main(String[] args) {
		
		
		System.out.println(FunctionalPractice.f1.apply("Helloooo"));
		System.out.println(FunctionalPractice.f1.andThen(FunctionalPractice.f2).apply("Helloooo"));

	}
}
