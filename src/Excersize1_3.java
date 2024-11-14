import java.util.Scanner;
public class Excersize1_3
{
    public static void main(String[] args)
    {

        Scanner inpute= new Scanner(System.in);
        /*
           System.out.println("The excercise 1.3...");
        String user1= inpute.nextLine();
        System.out.println("Please enter you gender male/female: ");
        String user2= "male";
        String gender = inpute.next();
        if(gender == user2) {
            System.out.println("Hellow, mr. " + user1 + ", how are you? Nice to meet you.");
        }
        else if(gender=="female") {
            System.out.println("Hello miss. " + user1 + ", how are you? Nice to meet you.");
        }
        else
           System.out.println("Hello, "+user1+" how are you? Nice to meet you.");
        */

        /*
        //program to convar kilometer to mile
        //1km=0.621371mi
        //1mi=1.609344km
        System.out.println("Enter the Kilometer value to convert that in Mile: ");
        float km = inpute.nextFloat();
        //Kilometer to Mile
        float result = km*(0.621371f);
        System.out.println("The Kilometer "+km+" to Mile distance is: "+result);

         */

        //progra to check enter number is integer or not
        System.out.println("Enter the integer number or any you want: ");
       // int number =inpute.nextInt();
        boolean b1= inpute.hasNextInt();
        System.out.println(b1);
        if(b1 == true)
        {
            System.out.println("This number is not integer.");
        }
        else
        {
            System.out.println("This number is not integer.");
        }

    }
}
