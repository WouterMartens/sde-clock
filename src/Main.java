public class Main {
    private Console c;
    private Clock clock;

    public static void main(String[] args) {
        // Create a new console to make logging easier
        Console c = new Console();
        // Create a new clock with a given time
        Clock clock = new Clock(23, 10, 40);

        System.out.println("Start clock");

        /**
         * Increments the clock for a given amount
         * and writes the clock to the console
         */
        for (int i = 0; i < 61; i++) {
            clock.count();
            c.write(clock.toString());
        }
    }
}
