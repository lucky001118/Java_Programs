import java.util.Scanner;
class MyEx extends Exception
{
    @Override
    public String toString()
    {
        return "This is the Error of becouse you enter less the the 100 value retry!";
    }
}
public class IntroductionToException5
{
    public static void main(String[] args)
    {
        //creatin the own custom class
        Scanner inpute = new Scanner(System.in);
        boolean con=true;
       // while (con) {
            System.out.print("Enter the value of i: ");
            int i = inpute.nextInt();
            if (i < 100) {
                try {
                    throw new MyEx();
                   // con=false;
                } catch (MyEx e) {
                    System.out.println("This is the Exception: ");
                    e.toString();
                    e.printStackTrace();
                }

            }
        //}


    }
}
