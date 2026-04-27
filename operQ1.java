
import java.util.*;
public class operQ1 {
    public static void main(String[] args) {
        
        //Add, subtract, multiply, divide, and find remainder of two integers
        Scanner sc = new Scanner(System.in);

        System.out.println("enter two integers a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("addtion = " + (a+b));
        System.out.println("subtract= " + (a-b));
        System.out.println("multipled = " + (a*b));
        System.out.println("devision = " + (a/b));
        System.out.println("remainder = " + (a%b));
        
        //Calculate the square and cube of a number using arithmetic operators.

        System.out.println("enter value to find square and cube : ");
        int S = sc.nextInt();
        int C = sc.nextInt();

        int square = S*S;
        int cube = C*C*C;

        System.out.println("square = " + square + "cube = " + cube);



    }
}
