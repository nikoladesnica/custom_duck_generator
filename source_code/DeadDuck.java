/**
 * DeadDuck is a subclass of Duck that implements the Null Object pattern.
 * It provides do-nothing behavior for the methods of a duck.
 * This class is useful to avoid null checks and provide a default behavior
 * when a duck is expected but not available (e.g., dead).
 *
 * @author Nikola Desnica (ndd2131)
 */
public class DeadDuck extends Duck {

    /**
     * Constructor for DeadDuck. It sets the duck's behaviors to null behaviors.
     */
    public DeadDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        this.name = "Dead Duck";
    }

    /**
     * Provides a do-nothing `display` method as DeadDucks should not be displayed.
     */
    @Override
    public void display() {
        // Do nothing. Dead ducks do not display.
    }

    /**
     * Overrides the Duck's `performFly` method with do-nothing behavior.
     */
    @Override
    public void performFly() {
        // Do nothing. Dead ducks do not fly.
    }

    /**
     * Overrides the Duck's `performQuack` method with do-nothing behavior.
     */
    @Override
    public void performQuack() {
        // Do nothing. Dead ducks do not quack.
    }

    /**
     * Overrides the Duck's `swim` method with do-nothing behavior.
     */
    @Override
    public void swim() {
        // Do nothing. Dead ducks do not swim.
    }
}
