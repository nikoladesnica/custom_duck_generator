import java.awt.Color;

/**
 * Represents a decoy duck with customizable features such as color and behaviors.
 * This subclass of Duck disables quacking and flying by default.
 * It includes a builder for easy construction of instances with various attributes.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class DecoyDuck extends Duck {
    private Color bodyColor = Color.YELLOW;
    private int lengthInCm = 30;
    private PriceRange priceRange = PriceRange.MIDRANGE;
    private boolean quackable = false;
    private boolean flyable = false;

    /**
     * Enum for categorizing the price range of the decoy duck.
     */
    public enum PriceRange {
        CHEAP, MIDRANGE, EXPENSIVE
    }

    /**
     * Default constructor for DecoyDuck. Initializes the duck with mute quack and no fly behaviors.
     */
    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        this.name = "Decoy Duck";
    }

    /**
     * Constructor for DecoyDuck with a custom name. Initializes the duck with mute quack and no fly behaviors.
     *
     * @param name The custom name to be assigned to the duck.
     */
    public DecoyDuck(String name) {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
        this.name = name;
    }

    /**
     * Private constructor used by the builder to create a decoy duck with specific attributes.
     *
     * @param builder The builder instance containing the attributes for the duck.
     */
    private DecoyDuck(Name builder) {
        this.name = builder.name;
        this.bodyColor = builder.bodyColor;
        this.lengthInCm = builder.lengthInCm;
        this.priceRange = builder.priceRange;
        this.quackable = builder.quackable;
        this.flyable = builder.flyable;

        this.flyBehavior = this.flyable ? new FlyWithWings() : new FlyNoWay();
        this.quackBehavior = this.quackable ? new Quack() : new MuteQuack();
    }

    /**
     * Displays the duck's characteristics.
     */
    @Override
    public void display() {
        System.out.println(this.toString());
    }

    /**
     * Returns a string representation of the decoy duck's characteristics.
     *
     * @return A string detailing the duck's attributes.
     */
    @Override
    public String toString() {
        return  "Name: " + name + "\n" +
                "Color: " + bodyColor + "\n" +
                "Length: " + lengthInCm + " cm\n" +
                "Price Range: " + priceRange + "\n" +
                "Quackable: " + quackable + "\n" +
                "Flyable: " + flyable;
    }

    /**
     * Gets the color of the decoy duck's body.
     *
     * @return The Color object representing the body color of the duck.
     */
    public Color getBodyColor() {
        return bodyColor;
    }

    /**
     * Retrieves the length of the decoy duck in centimeters.
     *
     * @return The length in centimeters of the duck.
     */
    public int getLengthInCm() {
        return lengthInCm;
    }

    /**
     * Provides the price range category for the decoy duck.
     *
     * @return The price range of the duck as a PriceRange enum.
     */
    public PriceRange getPriceRange() {
        return priceRange;
    }

    /**
     * Checks if the decoy duck is quackable.
     *
     * @return True if the duck can quack, false otherwise.
     */
    public boolean isQuackable() {
        return quackable;
    }

    /**
     * Checks if the decoy duck is capable of flying.
     *
     * @return True if the duck can fly, false otherwise.
     */
    public boolean isFlyable() {
        return flyable;
    }

    /**
     * The builder class for DecoyDuck, providing a fluent interface for constructing a decoy duck.
     */
    public static class Name {
        // Builder fields with default values
        private String name = "Decoy Duck";
        private Color bodyColor = Color.YELLOW;
        private int lengthInCm = 30;
        private PriceRange priceRange = PriceRange.MIDRANGE;
        private boolean quackable = false;
        private boolean flyable = false;

        /**
         * Default constructor for the builder with pre-set defaults.
         */
        public Name() {}

        /**
         * Overloaded constructor for the builder allowing to set the duck's name.
         *
         * @param name The name to be set for the decoy duck.
         */
        public Name(String name) {
            this.name = name;
        }

        /**
         * Sets the body color of the decoy duck.
         *
         * @param color The Color object for the duck's body.
         * @return The builder object for chaining method calls.
         */
        public Name bodyColor(Color color) {
            this.bodyColor = color;
            return this;
        }

        /**
         * Sets the length of the decoy duck.
         *
         * @param length The length in centimeters.
         * @return The builder object for chaining method calls.
         */
        public Name lengthInCm(int length) {
            this.lengthInCm = length;
            return this;
        }

        /**
         * Specifies the price range of the decoy duck.
         *
         * @param range The price range category.
         * @return The builder object for chaining method calls.
         */
        public Name priceRange(PriceRange range) {
            this.priceRange = range;
            return this;
        }

        /**
         * Sets whether the decoy duck can quack.
         *
         * @param quackable True if the duck should be quackable, false otherwise.
         * @return The builder object for chaining method calls.
         */
        public Name quackable(boolean quackable) {
            this.quackable = quackable;
            return this;
        }

        /**
         * Sets whether the decoy duck can fly.
         *
         * @param flyable True if the duck should be able to fly, false otherwise.
         * @return The builder object for chaining method calls.
         */
        public Name flyable(boolean flyable) {
            this.flyable = flyable;
            return this;
        }

        /**
         * Builds and returns a DecoyDuck instance with the properties set in the builder.
         *
         * @return A new instance of DecoyDuck with the desired attributes.
         */
        public DecoyDuck build() {
            return new DecoyDuck(this);
        }
    }
}