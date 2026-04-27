import java.util.*;
public class division {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //Program: Check if a number is divisible by both 3 and 5
        System.out.println("enter a number :");
        int num = sc.nextInt();
        
        if(num  % 3 ==0 && num % 5 ==0){
            System.out.println("division is accur");
        }else{
            System.out.println("not");
        }

        //Program: Check if a number is divisible by either 7 or 11
        System.out.println("enter a number :");
        int div =sc.nextInt();
        
        if(div  % 7 ==0  || div % 11 ==0){
            System.out.println("division is accur");
        }else{
            System.out.println("not");
    }
}
}
