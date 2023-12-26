/**
 * FlyLevitating provides a concrete implementation of FlyBehavior
 * representing a levitation flying style, typically for a "Monk Duck"
 * where the duck levitates without moving its wings.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class FlyLevitating implements FlyBehavior {

    /**
     * Simulates levitating flight. This method overrides the fly method
     * to display a unique levitating flying behavior.
     */
    @Override
    public void fly() {
        System.out.println("<< Monk duck suddenly lifts off the ground, but its wings aren't moving >>");
    }
}
