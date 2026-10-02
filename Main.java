import java.util.Scanner;

public class Main{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        int age;
        System.out.print("Enter your age : ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("You are eligible for voting.");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
        
    }
}
