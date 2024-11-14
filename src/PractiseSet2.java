import java.util.Scanner;
public class PractiseSet2
{
    public static void main(String[] args)
    {
        Scanner inpute = new Scanner(System.in);
     float a = 7/4*9/2; //follows the java presedant table.
        System.out.println(a);

        //question --> 4
        float V = inpute.nextFloat();
        float u = inpute.nextFloat();

        float result = (V*V-u*u)/2*V*u;
        System.out.println(result);

        //Question ---> 5
        float result2 = 7*49/7+35/7;
        System.out.println(result2);
    }
}
