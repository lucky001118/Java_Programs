import  java.util.Scanner;
public class Excersize_2
{
    public static void main(String[] args)
    {
        Scanner inpute =new Scanner(System.in);
        // increment operator
        int var = inpute.nextInt();
        //it prints the as you enterd in the keybord
        System.out.println(var++);
        // it prints ((you enter in keyboard)+1). becouse var++ that mean it will first prints the entered value then it encrement hte var value.
        System.out.println(var);
        //now it will increament the curent var's value and then prints that
        System.out.println(++var);

        int var1 = ++var*10; //it will follow the precedance associativiti table of java
        System.out.println("Result is the ++var*10 : "+var1);

    }
}
