import java.util.Scanner;
public class ParsentageCalculate
{
    public static void main(String[] args)
    {
        //The first problem solving program in java.
        Scanner inpute = new Scanner(System.in);
        System.out.println("We are creating the program to calculate the persentage of marks.");
        System.out.println("The student has five marks: 1.Science 2.Maths 3.Computer 4.English 5.Hindi..");
        System.out.println("Each subject carries 100 marks.\nProcessing start......");
        System.out.println("Enter the Marks of Science of you got: ");
        int science = inpute.nextInt();
        System.out.println("Enter the marks of Maths of you got: ");
        int maths = inpute.nextInt();
        System.out.println("Enter the Marks of Computer of you got: ");
        int computer = inpute.nextInt();
        System.out.println("Enter the Marks of English of you got: ");
        int english = inpute.nextInt();
        System.out.println("Enter the Marks of Hindi of you got: ");
        int hindi = inpute.nextInt();

        int total_marks= science+maths+computer+english+hindi;
        float per = (total_marks)/5f;

        System.out.println("The Total marks you got in 500 is: "+total_marks);
        System.out.println("The persentsge of Student is: "+per+"%");

    }
}
