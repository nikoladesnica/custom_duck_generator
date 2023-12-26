/**
 * ModelDuck is a subclass of Duck that represents a model duck.
 * Model ducks typically cannot fly, but they can quack. The appearance
 * is defined by the display method which prints a simple description.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class ModelDuck extends Duck {

    /**
     * Default constructor. Initializes a new ModelDuck with non-flying behavior,
     * standard quacking behavior, and the default name "Model Duck".
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        this.name = "Model Duck";
    }

    /**
     * Constructor with name parameter. Allows setting a custom name for the ModelDuck.
     *
     * @param name The custom name to be given to the ModelDuck.
     */
    public ModelDuck(String name) {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
        this.name = name;
    }

    /**
     * Displays the model duck's appearance. When called, this method prints out
     * a string to the console indicating that this duck is a model duck.
     */
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}