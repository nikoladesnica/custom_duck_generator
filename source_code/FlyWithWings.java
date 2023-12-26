/**
 * FlyWithWings provides a concrete implementation of the FlyBehavior interface
 * for ducks that fly using their wings in a traditional manner. This class models
 * the typical flight behavior expected from a bird with wings.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class FlyWithWings implements FlyBehavior {

    /**
     * Simulates flying using wings. This method will output a message to the console
     * indicating that the duck is flying in a natural way, by flapping its wings.
     */
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}