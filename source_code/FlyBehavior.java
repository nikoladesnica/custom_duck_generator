/**
 * Represents the flying behavior of ducks.
 * Implementing classes define the specific flying behavior.
 *
 * @author Nikola Desnica (ndd2131)
 */
public interface FlyBehavior {

    /**
     * Defines how the duck flies.
     * This method is intended to be overridden to simulate the flying behavior.
     */
    public void fly();
}