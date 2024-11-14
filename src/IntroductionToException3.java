import java.util.Scanner;
public class IntroductionToException3
{
    public static void main(String[] args)
    {
        //here we will learn how we can handel specific error
        int [] marks= new int[4];
        marks[0]=98;
        marks[1]=8678;
        marks[2]=26826;
        marks[3]=7378;
        int i;
        Scanner inpute = new Scanner(System.in);

        System.out.print("Enter the index value for the array value should be between 0 to 3: ");
        i=inpute.nextInt();

        System.out.println("Enter the value for devide the function remember it has not the zero: ");
        int devid=inpute.nextInt();

        System.out.println("Enter the redius to calculate the area of circle: ");
        int r=inpute.nextInt();

        try {
            System.out.println("The value of index is: "+marks[i]);
            System.out.println("The result of devid two number is: "+marks[i]/devid);
            System.out.println("The area of the circle is = "+Math.PI*r*r);
                    }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch (NegativeArraySizeException e)
        {
            System.out.println(e);
        }

        System.out.println();
        System.out.println("I'm the ending tag of program..........");

    }
}
