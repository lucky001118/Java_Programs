import java.util.Scanner;
//This line importing Scanner class to perform input from user
public class InputMathods
{
    public static void main(String[] args)
    {
        System.out.println("Tacking inputs from users....");
        Scanner inpute = new Scanner(System.in);
        //This line creating the object of Scanner class.
        System.out.println("Enter any integer variable: ");
        int variable1= inpute.nextInt();    //this will taking input as integer values
        System.out.println("Enter any floating variable: ");
        float variable2= inpute.nextFloat();  //Floating values
        System.out.println("Enter any byte value either 0 or 1: ");
        byte variable3= inpute.nextByte();   //Byte valure
        System.out.println("Enter the any word: ");
        /*
        string str = inpute.next();
        System.out.println("Enter all line in inpute: ");
        string str2 = inpute.nextLine();     */
        System.out.println("The integer value: "+variable1+" The float is: "+variable2+" The byte is: "+variable3);



    }
}
