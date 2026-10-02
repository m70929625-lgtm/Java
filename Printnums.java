import java.util.Scanner;
class Printnums{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        int n;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the length of numbers to be printed : ");
        n = inp.nextInt();
        for(int i = 1; i <= n; i++ ){
            System.out.println(i);
        }
    }
}