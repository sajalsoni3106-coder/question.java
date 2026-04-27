
import java.util.*;
public class IncreDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("enter a value of x :");
        int x = sc.nextInt();

        System.out.println("increment = " + (++x));
        
         System.out.println("decriment = " + (--x));
        

        //Pre‑Increment and Post‑Increment
System.out.println("enter a Pre‑Increment and Post‑Increment value : ");
        int a = sc.nextInt();

        System.out.println("Original a = " + a);
        System.out.println("Post-Increment (a++) = " + (a++)); // use then increase
        System.out.println("After Post-Increment, a = " + a);
        System.out.println("Pre-Increment (++a) = " + (++a));  // increase then use
        System.out.println("After Pre-Increment, a = " + a);

        //Compound Assignment Operators

     
        int num = 20;

        num += 5;  
        System.out.println("After += : " + num);
        num -= 3; 
        System.out.println("After -= : " + num);
        num *= 2;  
        System.out.println("After *= : " + num);
        num /= 4; 
        System.out.println("After /= : " + num);
        num %= 3;  
        System.out.println("After %= : " + num);

        //Ternary Operator – Larger of Two Numbers

        System.out.println("Enter two numbers:");
        int  M= sc.nextInt();
        int N = sc.nextInt();

        int larger = (M > N) ? M : N;
        System.out.println("Larger number is: " + larger);

        //Ternary Operator – Even or Odd

        System.out.println("enter a number :");
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("odd");
        }else{
            System.out.println("even");
        }
    }
}

    

        
    
