// write a program to find a perimeter of rectangle , triangle, square , circle
 import java.util.*;
 public class main2
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	// rectangle p=2(lenght + breath)
	System.out.println("enter lenght and breadth of rectangle:");
	int l = sc.nextInt();
	int b = sc.nextInt();
	
	int perimeterOfRectangle=2*(l+b);
	System.out.println("perimeterofrectangle = " + perimeterOfRectangle);
	
	//triangle p = side1 + side2 + side3
		System.out.println("enter base and height of triangle:");
	int side1 = sc.nextInt();
	int side2= sc.nextInt();
	int side3= sc.nextInt();
	
	int perimeterOftriangle= side1 + side2 + side3;
		System.out.println("perimeteroftriangle = " + perimeterOftriangle);
	
	//square = 4* side
		System.out.println("enter side of square: ");
	int s = sc.nextInt();
	
	int perimeterOfsquare=4*s;
		System.out.println("perimeterofsquare = " + perimeterOfsquare);
	
	//circle = 2*pai*radius
		System.out.println("enter radius of circle: ");
	int r = sc.nextInt();

	double perimeterOfcircle=2*Math.PI*r;
	System.out.println("perimeterofcircle = " + perimeterOfcircle);
	
	
	}
}

