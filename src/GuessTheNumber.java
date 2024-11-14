import java.util.Scanner;
import java.util.Random;
class Guess
{
    Random system = new Random();
    int systemnumber = system.nextInt(99); //genratin the random number by system.

  /* public void setInpute()
    {
        Scanner inpute = new Scanner(System.in);
        System.out.println("Enter your number as you want: ");
        int userInpute = inpute.nextInt();    // inclosing the user number in the userInput variable

    }

   */

  public  void setSystemnumber()
    {
        System.out.println(systemnumber);
    }

      public void predict()
    {
        int turm=1,count=0;
       // setInpute();
        Scanner inpute = new Scanner(System.in);


        while( turm!=0)
        {
            System.out.print("Enter your number as you want: ");
            int userInpute = inpute.nextInt();

            if(systemnumber == userInpute )
            {
                turm = 0;
                System.out.println("You guess that number....");
                System.out.println("Thanks for playing......");
                break;
            }
            else if (systemnumber>userInpute)
            {
                System.out.println("You are enter smaller number then computer genrated number..");
                System.out.println();
            }
            else if (userInpute>systemnumber)
            {
                System.out.println("You are enter bigger number then computer genrated number...");
                System.out.println();
            }
            turm++;
            count=turm;
        }
        probWin(count);
       // System.out.println(count);
    }
    void probWin(int count1)
    {
       if (count1==0)
       {
           System.out.println("CHITTIN KARTA HAI TU!, Kripaya Khel bhavna bnaye rakhe. ");
       }
        else if(count1>=1 && count1<=5)
        {
            System.out.println("You have sarp mind bro...");
        }
        else if (count1>=6 && count1<=10)
        {
            System.out.println("Nice play!....");
        }
        else
        {
            System.out.println("you are taking so much time, ' MAR JA DOOB KE!'....");
        }
    }

}
public class GuessTheNumber
{
    public static void main(String[] args)
    {
        Guess G1 = new Guess();
        G1.predict();
    }
}
