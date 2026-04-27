import java.util.*;

public class operQ2 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      //Calculate Simple Interest

        System.out.println("enter a pricipal , rate , time :");
        double p =sc.nextDouble();
        double r =sc.nextDouble();
        double t =sc.nextDouble();

        double SI =(p * r * t) / 100;
        System.out.println("simple interest = " + SI);

        //Calculate Area of Triangle

        System.out.println("Enter base and height:");
        double b= sc.nextDouble();
        double h = sc.nextDouble();

        double area = (b * h) / 2;
        System.out.println("Area of Triangle = " + area);

        //Final Price After Discount

        System.out.println("Enter price and discount :");
        double price = sc.nextDouble();
        double discount = sc.nextDouble();

        double total = price - (price * discount / 100);
        System.out.println("Final Price = " + total);
        
     }
}
