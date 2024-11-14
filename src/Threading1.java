class MyTread1 extends Thread
{
    int i=0;
    public void run()
    {
        while (i<=4000)
        {
            System.out.println("This is the MyTread1 enheriet with the Thread..");
            System.out.println("I'm sad!");
            i++;
        }
    }

}
class MyTread2 extends Thread
{
    int j=0;
    public void run()
    {
        while (j<=4000)
        {
            System.out.println();
            System.out.println("This is the MyTread2 enherits with Thread.....");
            System.out.println("I'm Happy!");
            j++;
        }

    }
}

public class Threading1
{
    public static void main(String[] args)
    {
        MyTread1 t1 = new MyTread1();
        MyTread2 t2 = new MyTread2();

        t1.start();
        t2.start();

    }
}
