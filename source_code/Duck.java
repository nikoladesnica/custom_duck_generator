/**
 * This abstract class represents the common characteristics of all Duck types.
 * It encapsulates behaviors for flying and quacking, which can be customized through
 * setters for each behavior. It also provides a method to simulate duck swimming.
 *
 * @author Nikola Desnica (ndd2131)
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected String name;

    /**
     * Default constructor for Duck.
     */
    public Duck() {
    }

    /**
     * Retrieves the name of the duck.
     *
     * @return The name of the duck.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Abstract method to display the duck. This method must be implemented by subclasses
     * to handle the duck's display behavior.
     */
    public abstract void display();

    /**
     * Sets the flying behavior of the duck.
     *
     * @param fb The FlyBehavior instance representing the new flying behavior.
     */
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    /**
     * Performs the flying behavior of the duck.
     */
    public void performFly() {
        this.flyBehavior.fly();
    }

    /**
     * Sets the quacking behavior of the duck.
     *
     * @param qb The QuackBehavior instance representing the new quacking behavior.
     */
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }

    /**
     * Performs the quacking behavior of the duck.
     */
    public void performQuack() {
        this.quackBehavior.quack();
    }

    /**
     * Simulates a duck swimming. All ducks float, including decoys.
     */
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}