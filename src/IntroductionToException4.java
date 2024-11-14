import java.util.Scanner;
public class IntroductionToException4
{
    public static void main(String[] args)
    {
        //Nested try-catch block
        Scanner inpute = new Scanner(System.in);
        System.out.print("Enter the number but the number can't equal to zero: ");
        int in=inpute.nextInt();

        try {
            System.out.println("This is the first try block, here is not present the exception for any case..");
            System.out.println();
            try
            {
                int result = 78688/in;
                System.out.println("The result of devition is: "+result);
            }
            catch (ArithmeticException e)
            {
                System.out.println("The Exception is: "+e);
                e.printStackTrace();
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
