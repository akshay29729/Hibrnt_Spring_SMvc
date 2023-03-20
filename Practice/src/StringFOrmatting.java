
public class StringFOrmatting {
   public static void main(String[] arge) {
	   int i = 1234569;
	   int j=345;
	   int k=-345;
	   System.out.println(String.format("%,d",i));
	   //1
	   System.out.println(String.format("%06d",j));
	   System.out.println(String.format("%06d",k));
	   //2
	   System.out.println(String.format("%(d",j));
	   System.out.println(String.format("%(d",k));
	   System.out.println(String.format("%( d",j));
	   System.out.println(String.format("%( d",k));
	   
	   //3
	   System.out.println(String.format("%+d",j));
	   System.out.println(String.format("%+d",k));
	   
	   //4
	   System.out.println(String.format("%d,%d,%d",i,j,k));
	   System.out.println(String.format("%2$d,%1$d,%3$d",i,j,k));
	   System.out.println(String.format("%2$d,%3$d,%3$d",i,j,k));
	   System.out.println(String.format("%2$d,%<d,%3$d",i,j,k));
   }
}
