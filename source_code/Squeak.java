/**
 * Squeak is a class that implements the quack behavior for ducks with a squeaking sound,
 * traditionally associated with rubber ducks.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class Squeak implements QuackBehavior {

    /**
     * Performs a squeak sound typically associated with rubber ducks.
     * This method overrides the quack method from the QuackBehavior interface.
     */
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}