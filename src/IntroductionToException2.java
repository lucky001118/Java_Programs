import java.util.Scanner;
public class IntroductionToException2
{
    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
        System.out.printf("Please enter value for a and b: ");
        int a= inpute.nextInt();
        int b= inpute.nextInt();
        try
        {
            int result = a/b;
            System.out.println("The result of the equation "+a+"/"+b+"="+result);
        }
        catch (ArithmeticException e)
        {
            System.out.println("This is not vailid on java Arithmetic case...");
            System.out.println(e);
        }

        System.out.println();
        System.out.println("I'm in Ending of the Program....");
    }
}
