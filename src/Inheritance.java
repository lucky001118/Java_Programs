class Base
{
    int a;
    int b;
    Base()
    {
        System.out.println("This is constructor of base class..");
    }
    Base(int x)
    {
        System.out.println(x);
    }
    void mathodOfBase1()
    {
        this.a=400;
        System.out.println("This the mathod of base class ------01");
        System.out.println(a);
    }
    void methodOfBse2()
    {
        this.b=500;
        System.out.println("This the method of class base --------02");
    }
}
class Deriveds extends Base
{
    Deriveds()
    {
        super(35);
        System.out.println("this is the dirived class constructor..");

    }
    Deriveds(int x, int y)
    {
        super( x);
        System.out.println(x+", "+y);
       //
    }
     void mathodOfDerived1()
    {
        super.b=2889;
        System.out.println("This is the method of driven class method no. ---01");
        System.out.println(b);
    }
    void mathodOfDrived2()
    {
        System.out.println("This is the method of driven class method no. ------02");
        super.a=9000;
        System.out.println(a);
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
      //  Base b1 = new Base();
       // b1.mathodOfBase1();
       // b1.methodOfBse2();

        Deriveds d1 = new Deriveds(23,34);
       // d1.mathodOfDerived1();
      // d1.mathodOfBase1();
        //d1.mathodOfDrived2();
       // d1.methodOfBse2();

    }
}
