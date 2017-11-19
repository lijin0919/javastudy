import java.util.Calendar;

public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DATE));
        calendar.set(2015,4,6);
        ;
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
    }
}
