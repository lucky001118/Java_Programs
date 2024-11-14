import java.util.Scanner;
// Question 01
class Employee
{
    int salary;
    String name;
    int getSalary()
    {
        return salary;
    }
    String getName()
    {
        return name;
    }
    void setName(String na)
    {
        name=na;
    }
}

//Question number 02
class CallPhone
{
    void ring()
    {
        System.out.println("The phone is ringing.......");
    }
    void vibrating()
    {
        System.out.println("The phone is vibrating.......");
    }
    void speek()
    {
        System.out.println("The persion is Speaking......");
    }
}

//Question number 03
class Square
{
    int side;
    public int area()
    {
        return side*side;
    }
    int perimeter()
    {
        return 4*side;
    }
}
public class PracticeClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //creating object of class Employee  qu---> 01
        Employee em = new Employee();
        em.salary=12000000;
        em.setName("Lucky");
        System.out.println("My name is "+em.getName());
        System.out.println("My salary is: "+em.getSalary());
        System.out.println();

        //creating object of class CallPhone   qu----> 02
        CallPhone call = new CallPhone();
        call.ring();
        call.vibrating();
        call.speek();
        System.out.println();

        //creating the object of class square  qu----> 03
        System.out.println("Enter the side of square: ");
        int si = input.nextInt();
        Square sw = new Square();
        sw.side= si;
        System.out.println("The area of square is: "+sw.area());
        System.out.println("The perieter of square is: "+sw.perimeter());
        System.out.println();

    }
}
