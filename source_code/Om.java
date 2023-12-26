/**
 * Om is a class that implements the quack behavior for ducks with a unique quack,
 * representing a meditative "Om" sound.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class Om implements QuackBehavior {

    /**
     * Performs a quack that emulates a meditative "Om" sound. 
     * This method overrides the quack method from the QuackBehavior interface.
     */
    @Override
    public void quack() {
        System.out.println("Ommmmmmm...");
    }
}