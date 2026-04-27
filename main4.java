// find your age from current age to  birth age
import java.util.*;
 public class main4
{
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("enter a birth age:");
	        int birth = sc.nextInt();
	        System.out.println("enter a current age:");
	        int current = sc.nextInt();
	        
	        int age = current - birth;
	        
	        System.out.println("your age = " + age);
	
	}
}
