public class TheDateAndTime
{
    public static void main(String[] args)
    {
        System.out.println("The milliseconds since 1 jan 1970 is: "+System.currentTimeMillis());
        System.out.println("The seconds since 1 jan 1970 is: "+System.currentTimeMillis()/1000);
        System.out.println("The minutes since 1 jan 1970 is: "+System.currentTimeMillis()/1000/60);
        System.out.println("The hours since 1 jan 1970 is: "+System.currentTimeMillis()/1000/60/60);
        System.out.println("The days since 1 jan 1970 is: "+System.currentTimeMillis()/1000/60/60/24);
        System.out.println("The months since 1 jan 1970 is: "+System.currentTimeMillis()/1000/60/60/24/12);
        System.out.println("The years since 1 jan 1970 is: "+System.currentTimeMillis()/1000/60/60/24/365);
    }
}
