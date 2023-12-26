/**
 * MuteQuack is a class that implements the quack behavior for ducks that do not quack,
 * simulating silence (a mute duck).
 *
 * @author Nikola Desnica (ndd2131)
 */
public class MuteQuack implements QuackBehavior {

    /**
     * Performs a "quack" which is silent, effectively representing a duck that cannot quack.
     * This is an override of the quack method from the QuackBehavior interface.
     */
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}