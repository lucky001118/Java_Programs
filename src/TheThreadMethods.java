class M1 extends Thread
{
 public void run()
 {
     int i=0;
     while (i<=400)
     {
         System.out.println("Thank You!");
         try
         {
             Thread.sleep(400);
         }catch (InterruptedException e)
         {
             e.printStackTrace();
         }
         i++;
     }
 }
}
class M2 extends Thread
{
    public void run()
    {
        int i=0;
        while (i<=400)
        {
            System.out.println("Welcome!");
            i++;
        }
    }
}
public class TheThreadMethods
{
    public static void main(String[] args)
    {
        M1 m =new M1();
        M2 m2 = new M2();
        m.start();
       //m.getName();
        m2.start();
        /*try
        {
            m.join();
        }catch (Exception e)
        {
            System.out.println(e);
        }*/

    }
}
