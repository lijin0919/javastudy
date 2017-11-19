import java.time.Clock;

public class ClockDemo {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
    }
}
