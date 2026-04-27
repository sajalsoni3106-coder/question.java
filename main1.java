
    // write a program to find a area of rectangle , triangle, square , circle
 import java.util.*;
 public class main1
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	//rectangle = lenght*height
	System.out.println("enter lenght and breadth of rectangle:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	
	int areaOfRectangle=l*b;
	System.out.println("areaofrectangle = " + areaOfRectangle);
	
	//triangle = 1/2*base*height
		System.out.println("enter base and height of triangle:");
	int base = sc.nextInt();
	int h = sc.nextInt();
	
	double areaOftriangle=0.5*base*h;
		System.out.println("areaoftriangle = " + areaOftriangle);
	
	//square = side * side
		System.out.println("enter side of square: ");
	int s = sc.nextInt();
	
	int areaOfsquare=s*s;
		System.out.println("areaofsquare = " + areaOfsquare);
	
	//circle = pai*radius*radius
		System.out.println("enter radius of circle: ");
	int r = sc.nextInt();

	double areaOfcircle=Math.PI*r*r;
	System.out.println("areaofcircle = " + areaOfcircle);
	
	
	
	
	}
}

