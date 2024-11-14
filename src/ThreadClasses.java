class Mythr extends Thread
{
    public Mythr(String name)
    {
        super(name);
    }
    public void run()
    {
        int i=34;
        System.out.println("Thank you!");
    }
}
public class ThreadClasses
{
    public static void main(String[] args)
    {
        Mythr m1 = new Mythr("Lucky");
        Mythr m2 = new Mythr("Lucky_Manikpuri");
        m1.start();
        m2.start();

        System.out.println("The ID of Thread m1 is: "+m1.getId());
        //System.out.println(m1.threadId());  //both getID() and ThreadID() gives same
        System.out.println("The name of the Thread m1 is: "+m1.getName());
        System.out.println("The Thread group is: "+m1.getThreadGroup());  // tells the related group

        System.out.println();
        System.out.println("The ID of Thread m2 is: "+m2.threadId());
        System.out.println("The name of Thread m2 is: "+m2.getName());
        System.out.println("The class of Thread m2 is: "+m2.getClass());  //telling us the inherit class

    }
}
