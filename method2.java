
import java.util.*;
public class method2 {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password:");
        String password =sc.nextLine();
   if(password.length() <= 8){
    System.out.println("Password is valid");
} else {
    System.out.println("Invalid input, try again");
}
System.out.println("enter a marks :");
int marks =sc.nextInt();

if(marks>90){
    System.out.println("Grade A");
}else if(marks>=80 && marks<=90){
    System.out.println("Grade B");
}else{
    System.out.println("Grade c");
}


    }
}
