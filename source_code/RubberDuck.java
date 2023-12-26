/**
 * RubberDuck is a subclass of Duck that models the characteristics
 * and behaviors of a rubber duck. It encapsulates the quack behavior and flying
 * behavior of a rubber duck which can squeak but cannot fly.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class RubberDuck extends Duck {

    /**
     * Constructor for RubberDuck with default properties.
     * Initializes the fly behavior to non-flying and quack behavior to squeak.
     */
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        this.name = "Rubber Duck";
    }

    /**
     * Constructor for RubberDuck with a custom name.
     * Initializes the fly behavior to non-flying and quack behavior to squeak.
     *
     * @param name the custom name to set for this duck
     */
    public RubberDuck(String name) {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        this.name = name;
    }

    /**
     * Displays the rubber duck's type.
     * Overrides the display method from the Duck abstract class.
     */
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}