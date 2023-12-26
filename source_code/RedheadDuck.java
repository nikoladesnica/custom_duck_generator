/**
 * RedheadDuck is a subclass of Duck that models the characteristics
 * and behaviors of a Redhead duck.
 * It encapsulates the quack behavior and flying behavior of a typical Redhead duck.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class RedheadDuck extends Duck {

    /**
     * Constructor for RedheadDuck with a default name.
     * Initializes the quack and fly behaviors to their appropriate types.
     */
    public RedheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        this.name = "Redhead Duck";
    }

    /**
     * Constructor for RedheadDuck with a custom name.
     * Initializes the quack and fly behaviors to their appropriate types.
     *
     * @param name the custom name to set for this duck
     */
    public RedheadDuck(String name) {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        this.name = name;
    }

    /**
     * Displays the Redhead duck's appearance.
     * Overrides the display method from the Duck abstract class.
     */
    @Override
    public void display() {
        System.out.println("I'm a real Redhead duck");
    }
}