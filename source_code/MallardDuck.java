/**
 * MallardDuck represents a specific type of Duck, the Mallard, which is characterized
 * by its typical quacking sound and its ability to fly using its wings.
 * This class extends the Duck class and provides implementations for the Mallard's
 * display behavior.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class MallardDuck extends Duck {

    /**
     * Default constructor. Initializes a new MallardDuck with default behaviors for quacking
     * and flying, and sets the name to "Mallard Duck".
     */
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        this.name = "Mallard Duck";
    }

    /**
     * Constructor with name parameter. Allows setting a custom name for the MallardDuck.
     *
     * @param name The custom name to be given to the MallardDuck.
     */
    public MallardDuck(String name) {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
        this.name = name;
    }

    /**
     * Displays the Mallard duck's appearance. When called, this method prints out
     * a string to the console indicating that the duck is a real Mallard duck.
     */
    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}