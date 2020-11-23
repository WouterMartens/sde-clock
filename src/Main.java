import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private Console c;
    private Clock clock;
    private Timer t;

    public static void main(String[] args) {
        // Create a new console to make logging easier
        Console c = new Console();
        // Create a new timer to increment every second
        Timer t = new Timer();
        // Create a new clock with a given time
        Clock clock = new Clock(23, 10, 40);

        System.out.println("Start clock");

        // Increment the clock every second
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                clock.count();
                c.write(clock.toString());
            }
        }, 0, 1000);
    }
}
