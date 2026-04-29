import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("hello java");


        String name =sc.nextLine();
        System.out.println("hello ," + name);


        int num = sc.nextInt();
        System.out.println("square of a no. = " + (num * num));


        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }


        System.out.println("enter a and b large of two no. :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean result = a>b;


        System.out.println("enter a p r t of simple interest :");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        double SI = (p*r*t)/100;
        System.out.println("simple interest ="+SI);

        
        System.out.println("enter a num to calculated factorial : " );
        int fact =1;
        for(int i=1;i<=5;i++){
          fact *=i;
        }
        System.out.println("factorial ="+ fact);


        System.out.println("enter a no. to check no. is prime :");
          int number = sc.nextInt();
        if(number<=1){
            for(int i=2;i<=number/2;i++){
                if(number%i==0){
                    System.out.println("not prime");
                }else{
                    System.out.println("prime");
                }
            }   
        }


         System.out.println("enter a no. to mulipication :");
         int multi = sc.nextInt();
         for(int i =1;i<=10;i++){
            int multipication = multi*i;
            System.out.println(multi + "*" + i + "=" + multipication);
         }


         System.out.println("enter a no. to sum of digit:");
         int n= sc.nextInt();
         int sum =0;
         while(n>0){
            sum += n%10;
            n /=10;
         }
        System.out.println("sum of digit =" + sum);


        System.out.println( "marks that obtain : ");
        int m1=56 , m2=89 , m3=79;
         int total =m1+m2+m3;
         double percentage = (total *100) / 300;
         System.out.println("total = " + total +" , "+ "percentage = " + percentage + "%");
         
        
         System.out.println( "reversed no. : " );
         int numb = 123;
         int rever = 0;
        
         while(numb>0){
          int digit = numb % 10;
           rever = rever * 10 + digit;
           numb  = numb / 10;
         }
            System.out.println("original no. =" + numb + "," + "reversed no. =" + rever);
         



        }
    }

