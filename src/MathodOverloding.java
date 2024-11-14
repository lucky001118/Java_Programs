public class MathodOverloding
{
    //making mathod overloding mathods...
    static void sum()
    {
        System.out.println("hey, thsi is empty..");

    }
    static void sum(int a)
    {
        System.out.println("The number is: "+a);
    }
    static void sum(int a, int b)
    {
        System.out.println("The sum is: "+(a+b));
    }

    //creating the mothod overloding  with vararg
    public static int VaragFunc(int ...array)
    {
        int add=0;
        for (int element:array)
        {
            add=add+element;
        }
        return add;
    }
    public static void main(String[] args)
    {
        //mathod over loding
        //calling the sum
        System.out.println("calling the sum(): ");
        sum();
        //calling the sum(int a)
        System.out.println("Calling the sum(int a): ");
        sum(899);
        //calling the sum(int a, int b)
        System.out.println("Calling the sum(int a, int b): ");
        sum(7577,98578);

        //calling the mathod overloding with the varag
        int a,b,c,d;
        a=VaragFunc();
        b=VaragFunc(86);
        c=VaragFunc(866,96);
        d=VaragFunc(654,69,75);
        System.out.println("The varag fumction is a: "+a+",b: "+b+",c: "+c+" & d: "+d);
    }
}
