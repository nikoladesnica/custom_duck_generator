/**
 * FlyNoWay provides a concrete implementation of the FlyBehavior interface
 * for ducks that cannot fly.
 * This class is typically used for decoy ducks or any other duck instances
 * that are not supposed to fly.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class FlyNoWay implements FlyBehavior {

    /**
     * Simulates the inability to fly. This method overrides the fly method
     * to indicate that the duck cannot fly.
     */
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}