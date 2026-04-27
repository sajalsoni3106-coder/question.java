import java.util.*;
public class logicaloper {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);

        System.out.println("enter username :");
        String username = sc.nextLine();
        System.out.println("enter password :");
        String password = sc.nextLine();

        if(username.length()<=5 && password.length()<=8){
            System.out.println("username and password is valid");

        }else{
            System.out.println("invalid sorry try again");
        }


    }
}
