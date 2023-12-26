/**
 * MonkDuck is a subclass of Duck that represents a monk duck.
 * Monk ducks have unique behaviors: they can levitate instead of regular flying
 * and they make an 'Om' sound instead of quacking. Their display is
 * unique and mystical as described by the display method.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class MonkDuck extends Duck {

    /**
     * Default constructor. Initializes a new MonkDuck with levitating behavior,
     * Om quack behavior, and the default name "Monk Duck".
     */
    public MonkDuck() {
        quackBehavior = new Om();
        flyBehavior = new FlyLevitating();
        this.name = "Monk Duck";
    }

    /**
     * Constructor with name parameter. Allows setting a custom name for the MonkDuck.
     *
     * @param name The custom name to be given to the MonkDuck.
     */
    public MonkDuck(String name) {
        quackBehavior = new Om();
        flyBehavior = new FlyLevitating();
        this.name = name;
    }

    /**
     * Displays the monk duck's mystical appearance. When called, this method prints out
     * a string to the console that conveys a mystical presence.
     */
    @Override
    public void display() {
        System.out.println("<< Angels singing as Monk Duck reveals itself >>");
    }
}