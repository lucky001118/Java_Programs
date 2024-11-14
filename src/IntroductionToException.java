import  java.util.Scanner;
public class IntroductionToException
{
    public static void main(String[] args) {
        /*In java there is the mainlly three type errors are occure
        1. Syntax error
        2. Logical error
        3. Runtime error(Exception)
         */

        //creating the Syntax error
        /*
        int a=40
        int b=60;
        //this error produce blocking block in the programs it mean it dosen't run the program
         */

        //creating the Logical Error
        /*
        logical Error is creats when the wrong logic apply in a program
        i wants to find prime number but write here the logic

        int primeNumber = num*2+1;
         */

        //Runtime Error
        /*
        the runtime error dosent detect by compiler at the time of code writing of a programmer
        it get detected when use intered the number which is the invailid in java
         */
        int a,b,result;
        Scanner inpute =new Scanner(System.in);
        System.out.println("Please inter value of a and b: ");
        a=inpute.nextInt();
        b=inpute.nextInt();
        result=a/b;  //This logic is lookin fine but if the value of b=0 then it will throws the Exception
        System.out.println("The result is of "+a+"/"+b+"="+result);

    }
}
