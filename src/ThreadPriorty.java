class MyPriorty1 extends Thread
{
   public MyPriorty1(String name)
   {
       super(name);
   }
   public void run()
   {
       int i=0;
       while (i<=400)
       {
           System.out.println("Thank You "+this.getName());
           i++;
       }
   }
}
public class ThreadPriorty
{
    public static void main(String[] args)
    {
        MyPriorty1 p1 =new MyPriorty1("Lucky1");
        MyPriorty1 p2 =new MyPriorty1("Lucky2");
        MyPriorty1 p3 =new MyPriorty1("Lucky3");
        MyPriorty1 p4 =new MyPriorty1("Lucky4 (Most Important to run first)");
        p1.setPriority(Thread.MIN_PRIORITY);
        p1.start();
        p2.setPriority(Thread.NORM_PRIORITY);
        p2.start();
        p3.setPriority(Thread.NORM_PRIORITY);
        p3.start();
        p4.setPriority(Thread.MAX_PRIORITY);
        p4.start();
    }
}
