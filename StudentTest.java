import java.util.Scanner;
class Student{
    String studentName;
    int rollNo, marksChemistry, marksMaths, marksPhysics, marksBiology, totalMarks ;
    float percentage;
    char  grade;

    @SuppressWarnings("resource")
    void inputDetails () {
         Scanner inp = new Scanner(System.in);
         //student name input

         System.out.print("Enter student name: ");
         studentName = inp.nextLine();


         //student rollno input

         System.out.print("Enter roll number: ");
         rollNo = inp.nextInt();

        //physics marks input

         System.out.print("Enter physics marks: ");
         marksPhysics = inp.nextInt();

         //maths marks input

         System.out.print("Enter maths marks: ");
         marksMaths = inp.nextInt();

         //biology marks input

         System.out.print("Enter biology marks: ");
         marksBiology = inp.nextInt();

         //chemistry marks input

         System.out.print("Enter chemistry marks: "); 
         marksChemistry = inp.nextInt();
        
        }

        void calcTotalPerc (){
            totalMarks = marksChemistry + marksMaths + marksPhysics + marksBiology;

            percentage = ((float)totalMarks/ 400) * 100;
        }

        void getGrade() {
            if(percentage >= 90){
                grade = 'A'; 
            }

            else if(percentage >= 80 && percentage < 90){
                grade = 'B';
            }
            else if(percentage >= 70 && percentage < 80){
                grade = 'C';
            }

            else if(percentage >= 60 && percentage < 70){
                grade = 'D';
            }

            else{
                grade = 'F';
            }
        }

        void dispalyReportCard (){

            System.out.println("\nReport Card");
            System.out.printf("Student Name : %s \nRollno : %d\n",studentName, rollNo);
            System.out.printf("Maths marks : %d \nPhysics marks : %d \nBiology marks : %d \nChemistry marks : %d\n",marksMaths, marksPhysics, marksBiology, marksChemistry);
            System.out.printf("Total marks : %d \nPercentage : %.2f \nGrade : %c",totalMarks, percentage, grade);
        }
    
} 
 


 class StudentTest {
   public static void main(String[] args){
     Student s1 = new Student();
     s1.inputDetails();
     s1.calcTotalPerc();
     s1.getGrade();
     s1.dispalyReportCard();
   }   
}
