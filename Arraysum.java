import java.util.Scanner;
class Arraysum {
    @SuppressWarnings("resource")
    public static void main(String[] args){
       int n;
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter the size of the array : ");
       n = sc.nextInt();

       int[] arr = new int[n];
       System.out.println("Enter the array elements : ");

       int sum = 0;
       for(int i = 0; i < n ; i++){
        arr[i] = sc.nextInt();
       }

       for(int i = 0; i < n ; i++){
        sum += arr[i];
       }

       System.out.printf("The sum of all the array elements are %d", sum);
       
   }    
}
