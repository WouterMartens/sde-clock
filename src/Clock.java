public class Clock {
    private Display hours, minutes, seconds;
    private Console c;

    /**
     * Initializes a normal digital clock with displays
     * @param hours Current hour
     * @param minutes Current minute
     * @param seconds Current second
     */
    public Clock(int hours, int minutes, int seconds) {
        this.hours = new Display(24, hours);
        this.minutes = new Display(60, minutes, this.hours);
        this.seconds = new Display(60, seconds, this.minutes);
    }

    /**
     * Increment the clock
     */
    public void count() {
        this.seconds.count();
    }

    /**
     * Builds the display of the clock with the created displays
     * @return The display of the clock
     */
    @Override
    public String toString() {
        String sec = this.seconds.getValue();
        String min = this.minutes.getValue();
        String hr = this.hours.getValue();
        return hr + ":" + min + ":" + sec;
    }
}
