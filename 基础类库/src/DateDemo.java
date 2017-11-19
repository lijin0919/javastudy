import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        Date date1 = new Date(System.currentTimeMillis()+2000);//1970的时间差
        System.out.println(date1);
        System.out.println(date.compareTo(date1));
        System.out.println(date.before(date1));
    }
}
