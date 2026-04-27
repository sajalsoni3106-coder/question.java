
import java.util.*;

public class condition {
public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
  //Check whether a number is greater than another number.
    System.out.println(" enter a no. : ");
    int a =sc.nextInt();
    int b = sc.nextInt();

    if(a>b){
        System.out.println("no. is greater ");
    }else{
        System.out.println("no. is smaller");
    }

    //Use relational operators to compare age eligibility for voting.
    System.out.println("enter your age : ");
    int age = sc.nextInt();

    if(age>18){
        System.out.println("you are eligibiled to vote ");

    }else{
        System.out.println("you can not vote ");
    }

    //Use logical && to check whether marks are between 0 and 100.
    System.out.println("enter a no. ");
    int num = sc.nextInt();

    if(num>=0 && num<100){
        System.out.println("no. is come between 0 to 100 ");
    }else{
        System.out.println("never");
    }

    //Use logical || to check whether a character is a vowel.

    System.out.println("enter a character :");
    String element = sc.nextLine();
    String vowel ="AEIOUaeiou"; 
    if(vowel.contains(vowel)){
        System.out.println("element come in vowel");
    }else{
        System.out.println("not comes");
    }
}    
}
