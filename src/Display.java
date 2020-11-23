public class Display {
    private int maxAmount;
    private int amount;
    private Display nextDisplay;

    /**
     * Create a new display for a digital clock
     * @param maxAmount the amount where the display has to turn over
     * @param amount the current value for the display
     * @param nextDisplay the display that has to count on turnover
     */
    public Display(int maxAmount, int amount, Display nextDisplay) {
        this.maxAmount = maxAmount;
        this.amount = amount;
        this.nextDisplay = nextDisplay;
    }

    /**
     * Create a new display for a digital clock
     * @param maxAmount the amount where the display has to turn over
     * @param amount the current value for the display
     */
    public Display(int maxAmount, int amount) {
        this.maxAmount = maxAmount;
        this.amount = amount;
        this.nextDisplay = null;
    }

    /**
     * Increments the display and returns it to zero when it turns over
     * @return Did the display turn over
     */
    public void count() {
        // Increment the display
        this.amount++;
        // If the amount reaches the limit, turn over to zero
        // and increment the next display if it exists
        if (this.amount >= this.maxAmount) {
            this.turnOver();
        }
    }

    /**
     * Resets the display to zero and calls the count of the next display
     */
    private void turnOver() {
        this.reset();
        this.countNextDisplay();
    }

    /**
     * Increments the next display (if it exists) on turnover
     */
    private void countNextDisplay() {
        if (this.nextDisplay != null) {
            this.nextDisplay.count();
        }
    }

    /**
     * Reset the current display
     */
    private void reset() {
        this.amount = 0;
    }

    /**
     * Adds a zero to the value if it is lower than 10
     * @return String value of the display
     */
    public String getValue() {
        return (this.amount < 10 ? "0" : "") + this.amount;
    }
}
