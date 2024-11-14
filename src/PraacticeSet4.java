import java.util.Scanner;
public class PraacticeSet4
{
    public static void main(String[] args) {
        Scanner inpute = new Scanner(System.in);

      /*  int a=11;
        if(a==11)
        {
            System.out.println("yes");
        }
       */

        /*
        //student faill pass..
        System.out.println("Enter the marks of the science: ");
        int science = inpute.nextInt();
        System.out.println("Enter the number of maths: ");
        int mahts = inpute.nextInt();
        System.out.println("Enter the number of Computer: ");
        int computer = inpute.nextInt();
        int total = science+mahts+computer;
        float per=total/3;
        System.out.println("You got the percentage is: "+per+"%");


        if(per>=33 && per<=40)
        {
            System.out.println("You are pass with avrage marks.");
        }
        else if(per>=41 && per<=60)
        {
            System.out.println("You are pass with B gread, keep practice..");
        }
        else if(per>=61 && per<=85)
        {
            System.out.println("Well done! you are pass with A gred.");
        }
        else if(per>=86 && per<=100)
        {
            System.out.println("You are scoller keep dning the practice... ");
        }
        else
        {
            System.out.println("do hard work you got faillllll.");
        }

*/
        //tax calculation
        /*
        System.out.println("Enter your inome: ");
        int salarery = inpute.nextInt();
        if (salarery>=250000 && salarery<=500000)
        {
            int tax = salarery*5/100;
            System.out.println("The tex is: "+tax);
        }

        else if (salarery>=500001 && salarery<=1000000)
        {
           int tax = salarery*20/100;
            System.out.println("The total tax is: "+tax);
        }
        else if (salarery>=1000001)
        {
            int tax = salarery*30/100;
            System.out.println("The tax is: "+tax);
        }
        else
        {
            System.out.println("No need to pay tax");
        }
*/
        //day calculation
        /*
        System.out.println("1. monday,2. tuesday, 3. thursday, 4. wednesday, 5. fryday, 6. saturday, 7. sunday: ");
        int day = inpute.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("This day is Monday...");
                break;
            case 2:
                System.out.println("This day is Tuesday...");
                break;
            case 3:
                System.out.println("This day is Thursday...");
                break;
            case 4:
                System.out.println("This day is Wednesday...");
                break;
            case 5:
                System.out.println("This day is Friday...");
                break;
            case 6:
                System.out.println("This day is Saturday...");
                break;
            case 7:
                System.out.println("This day is sunday...");
            default:
                System.out.println("You are enterd invalid number please enter between 1 to 7");
        }
        */

        //find out  the website type
        System.out.println("Ener the extention of website: ");
        String web =inpute.next();
        switch (web)
        {
            case ".com":
                System.out.println("commercial website");
                break;
            case ".in":
                System.out.println("Indian website.");
                break;
            case ".org":
                System.out.println("Organization website");
            break;
                default :
                    System.out.println("This website is not in out database i thing it is new type of website");



        }

    }
}