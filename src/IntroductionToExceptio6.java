import java.util.Scanner;
class MyExp extends Exception
{
    public String toString()
    {
        return "This is My custom Exceprion handller: The number of redius is the negitive....";
    }
}
public class IntroductionToExceptio6
{
    public static double calculate(int r) throws MyExp
    {
        if (r<0)
        {
            throw new MyExp();
        }
        double result= Math.PI*r*r;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
        System.out.print("Enter the r for calculating the area of circle,but there is the case that the r is not negetive: ");
        int re=inpute.nextInt();

        try
        {
            double ree =calculate(re);
            System.out.println("The result is "+ree);
        }
        catch (MyExp e)
        {
            System.out.println(e);
            e.toString();
            e.printStackTrace();
        }
        finally {
            System.out.println();
            System.out.println("This is the finally block it should must run if why not exception occured.");
        }

    }
}
