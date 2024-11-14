import java.util.Scanner;
import java.util.Random;
public class StonePaperScissor
{
    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
        //This vsrisble sys is to store random varible
        int sys;

        //This variable for count and increasing the winnig
        int syscount=0;
        int usercount=0;

        // while loop starting
        int count=1;
        while (count<=5)
        {
            System.out.print("Enter 1 for Stone 2 for Paper 3 for Scissor: ");
            int user = inpute.nextInt();
            if (user==1)
            {
                System.out.println("You choose Stone!");
            }
            else if (user ==2)
            {
                System.out.println("You choose Paper!");
            }
            else if (user==3)
            {
                System.out.println("You chose Scissor!");
            }
            else
            {
                System.out.println("You enter invailid value please try again and enter 1 to 3 any one value.");
            }

            Random system = new Random();

         sys = system.nextInt(3);
        // 0 for stone 1 for paper & 2 for scissor..

        //calculating the winner of sistuation
        if (user==1 && sys==0 || user==2 && sys==1 || user==3 && sys==2)
        {
            System.out.println("The match tied becouse you both are choose same.");
        }
        else if (user==1 && sys==1)
        {
            System.out.println("system choose Paper");
            System.out.println("You beat");
        }
        else if (user==2 && sys==2)
        {
            System.out.println("System choose scissor.");
            System.out.println("you beat");
        }
        else if (user==3 && sys==0)
        {
            System.out.println("System chose Stone");
            System.out.println("YOu beat.");

        }
        else if (user==1 && sys==2)
        {
            System.out.println("System choose Scissor");
            System.out.println("You won");
        }
        else if (user==2 && sys==0)
        {
            System.out.println("System choose Stone");
            System.out.println("You won");
        }
        else if (user==3 && sys==1)
        {
            System.out.println("System choose paper");
            System.out.println("you won");
        }

        //counting the winnning turm
        if (user==1 && sys==1 || user==2 && sys==2 || user==3 && sys==0)
        {
            syscount++;
        }
        else if (user==1 && sys==2 || user==2 && sys==0 || user==3 && sys==1)
        {
            usercount++;
        }

        //increasing while loop's counting
        count++;
        }

        if (syscount>usercount)
        {
            System.out.println("......................");
            System.out.println("Final Score You won "+usercount+" time and system won "+syscount+" time ");
            System.out.println("The system won overall.....");
        }
        else if (usercount>syscount)
        {
            System.out.println("......................");
            System.out.println("Final Score You won "+usercount+" time and system won "+syscount+" time ");
            System.out.println("You won overall...");
        }
        else
        {
            System.out.println("......................");
            System.out.println("Final Score You won "+usercount+" time and system won "+syscount+" time ");
            System.out.println("The match drawn overall...");
        }
       // System.out.println(sys);

    }
}
