class MyRunnable1 implements Runnable
{
    int i =0;
    public  void run()
    {
        while (i<=400)
        {
            System.out.println("This is the MyRunnable class which impliments Runnable");
            System.out.println();
            i++;
        }
    }
}
class MyRunnable2 implements Runnable
{
    int j=0;
    public void run()
    {
        while (j<=400)
        {
            System.out.println("This the MyRunneable2 class which implements Runnable");
            j++;
        }
    }
}
public class RunnableThread1
{
    public static void main(String[] args)
    {
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);
        gun1.start();

        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun2.start();
    }
}
