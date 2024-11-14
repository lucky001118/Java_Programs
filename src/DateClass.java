import java.util.Date;
public class DateClass
{
    public static void main(String[] args)
    {
        Date date1 = new Date();
        System.out.println(date1);      //gives the current date

        Date date2 = new Date(2002,9,18);  //taking teh yyyy,mm,dd as argument
        Date date3 = new Date(837673488);     ///tacking the millisecond in argument and the calculates the date with base 1 jan,1970.
        System.out.println(date2);

        boolean a=date2.after(date1);  //compares the date1 is after to the date2 or not
        System.out.println(a);

        boolean b=date1.before(date2);   //compares the date1 is before the date 2 or not
        System.out.println(b);

        boolean c =date2.equals(date1);  //compares that the date1 is equals to date2 or not
        System.out.println(c);

        int d = date2.compareTo(date1);
        System.out.println(d);
        /*
        It returns the value 0 if the argument Date is equal to this Date.
        It returns a value less than 0 if this Date is before the Date argument.
        It returns a value greater than 0 if this Date is after the Date argument.
         */
        System.out.println(date1.getTime());
        System.out.println(date1.getDate());
        System.out.println(date1.getDay());
        System.out.println(date1.getHours());
    }
}
