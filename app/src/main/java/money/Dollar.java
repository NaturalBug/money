/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package money;

public class Dollar extends Money {
    private String currency;

    public Dollar(int amount) {
        this.amount = amount;
        currency = "USD";
    }

    public Dollar times(int multiplier) {
        return new Dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return currency;
    }
}
