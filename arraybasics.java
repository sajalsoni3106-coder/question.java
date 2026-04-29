public class arraybasics {
    public static void main(String[] args) {
        int arr[] = {12,15,16,17,20};
        int n = 5;
       //print numbers 
        for(int i=0;i<arr.length;i++){
                 System.out.println("original = " + arr[i] );
            //  System.out.println(arr.length);
        }
        //sum of no.
         int sum =0;
        for(int i=0;i<arr.length;i++){
             sum += arr[i];
        }
             System.out.println("sum = " + sum);
             //average
             double avg = sum/arr.length;
             System.out.println("average =" + avg);
 
             //maximam
             int max = arr[0];
             for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max = arr[i];
                }
             }
             System.out.println("maximum ="+ max);
        
            //minimam 
               int min = arr[0];
             for(int i=0;i<arr.length;i++){
                if(arr[i]<min){
                    min = arr[i];
                }
             }
             System.out.println("minimam ="+ min);
            
             
             //count even no.
             int count = 0;
             for(int i=0;i<arr.length;i++){
                if(arr[i] % 2==0){
                    count++;
                }
             }
             System.out.println("total no. of even no. :" + count);
             //odd
             int temp =0;
             for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 != 0) {   
                temp++;
            }
        }
        System.out.println("total Odd Numbers = " + temp);

        //reversed
      for(int i=arr.length-1;i>=0;i--){
        System.out.println("rev =" + arr[i]);
      }
//search
int search = 12;
for(int i=0;i<=0;i++){
if(arr[i]==search){
 System.out.println("found");
}else{
    System.out.println("not found");
}

//swaping
int first =arr[0] , last =arr[arr.length-1];
int value;
value =first;
first =last ;
last =value;

System.out.println("after swaping :" );
for( i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}


}         

             
    }
}


