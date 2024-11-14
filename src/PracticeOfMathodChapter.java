import java.util.Scanner;
public class PracticeOfMathodChapter
{
    //for printing the piramide of star using the method of java
 /*
    static void printStar()
    {
        for (int i = 0; i<=8;i++)
        {
            for (int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

  */

    /*
    //to print the table using the mathods in java
    static void table(int a)
    {
        for (int ii=1;ii<=10;ii++)
        {
            System.out.println(ii+"*"+a+"="+(ii*a));
        }

    }
    */

    /*
    //question number 3
    static int sum(int n)
    {
        if (n==1)
        {
            return 1;
        }
        else if (n==0)
        {
            return 0;
        }
        else
        {
         return n+sum(n-1);
        }
    }
     */
/*
    //printing reverce star partten
    static void reStar()
    {
        for (int i=8;i>0;i--)
        {
            for (int j=0;j<i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
 */
    /*
    //fibonacci number ---> question number 5
    static int fibonacciNumber(int n)
    {
        if (n==1 || n==2)
        {
            return 1;
        }
        else
        {
            return fibonacciNumber(n-1)+fibonacciNumber(n-2);
        }
    }
     */

    /*
    //avrage calculation----> question number 6
    static int average(int ...arr)
    {
        int addition=0;
        for (int a :arr)
        {
            addition = addition+a;
        }
        int res = addition/arr.length;
        return res;
    }
     */
    // question ---->9
    static float tempratureCalculator(float celcious)
    {
        float calcu =celcious*9/5+32;
        return calcu;
    }

    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
        //calling the printStar mathod ----> question number 2
      //printStar();

        //calling the table mathod ------> question number 1
       // System.out.println("Enter the table name you want to know: ");
        //int tableValue= inpute.nextInt();
        //table(tableValue);

        /*
        //to calculate sum of n turm  ---> question number 3
        System.out.println("Please enter the no where you want to calculate sum: ");
        int netural = inpute.nextInt();
        int total=sum(netural);
        System.out.println(total);
         */

        /*
        //calling revStar ---->question number 04
        reStar();
         */

        /*
        //calling the fibonacci function
        System.out.print("Enter that number which number's you want to know fibonacci number: ");
        int enter = inpute.nextInt();
        int result = fibonacciNumber(enter);
        System.out.println(result);
         */

        /*
        //callig avrg function--> question number 6
        int avg =average(89,23,23,243,44,343,53);
        System.out.println(avg);
         */

        //celsiouse to ferhenhite converter ---> question 9
        System.out.println("Enter The celciouse temprature: ");
        float cel = inpute.nextFloat();
        float fer = tempratureCalculator(cel);
        System.out.println(fer);

    }
}
