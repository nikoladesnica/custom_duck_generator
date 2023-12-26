/**
 * Quack is a class that implements the quack behavior for ducks with a typical quacking sound.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class Quack implements QuackBehavior {

    /**
     * Performs a quack that mimics the typical sound a duck makes.
     * This method overrides the quack method from the QuackBehavior interface.
     */
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}