import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.GregorianCalendar;

public class CalenderClass
{
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.getTime());
        System.out.println(cal.getTimeZone());
        System.out.println();
        System.out.println("Current year is :"+ cal.get(Calendar.YEAR));
        System.out.println("Current month is :"+ cal.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ cal.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ cal.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ cal.get(Calendar.SECOND));

        System.out.println("Current date is : " + cal.getTime());
        cal.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ cal.getTime());
        cal.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ cal.getTime());
        cal.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ cal.getTime());

        System.out.println();
        System.out.println(cal.getWeeksInWeekYear());

        System.out.println();
        System.out.println(" The maximum no. of weeks in a year : " + cal.getMaximum(Calendar.WEEK_OF_YEAR));


    }
}
