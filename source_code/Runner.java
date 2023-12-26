public class Runner {

    public static void main(String[] args) {
        System.out.println("Several tests for each duck creation using DuckFactory:\n");

        System.out.println("\n--- Ducks with default names ---\n");
        DuckFactory duckFactory = new DuckFactory();

        // Create ducks with default names
        Duck mallardDuck = duckFactory.createDuck(DuckFactory.Species.MALLARD);
        Duck redheadDuck = duckFactory.createDuck(DuckFactory.Species.REDHEAD);
        Duck rubberDuck = duckFactory.createDuck(DuckFactory.Species.RUBBER);
        Duck decoyDuck = duckFactory.createDuck(DuckFactory.Species.DECOY);
        Duck monkDuck = duckFactory.createDuck(DuckFactory.Species.MONK_DUCK);

        // Display and test behaviors for ducks with default names
        testDuck(mallardDuck);
        testDuck(redheadDuck);
        testDuck(rubberDuck);
        testDuck(decoyDuck);
        testDuck(monkDuck);

        // Line break for readability in output
        System.out.println("\n--- Ducks with custom names ---\n");

        // Create ducks with custom names
        Duck mallardWithName = duckFactory.createDuck(DuckFactory.Species.MALLARD, "Quacky");
        Duck redheadWithName = duckFactory.createDuck(DuckFactory.Species.REDHEAD, "Buddy");
        Duck rubberWithName = duckFactory.createDuck(DuckFactory.Species.RUBBER, "Squeezy");
        Duck decoyWithName = duckFactory.createDuck(DuckFactory.Species.DECOY, "Red");
        Duck monkWithName = duckFactory.createDuck(DuckFactory.Species.MONK_DUCK, "Zen");

        // Display and test behaviors for ducks with custom names
        testDuck(mallardWithName);
        testDuck(redheadWithName);
        testDuck(rubberWithName);
        testDuck(decoyWithName);
        testDuck(monkWithName);

        System.out.println("Test case: Test DecoyDuck Builder Initialization and Behavior (ID: DD-01)\n");
        DecoyDuck decoy = new DecoyDuck.Name("Fred")
                .bodyColor(java.awt.Color.RED)
                .priceRange(DecoyDuck.PriceRange.EXPENSIVE)
                .flyable(true)
                .quackable(false)
                .build();

        // Perform assertions
        assertValue("Color", java.awt.Color.RED, decoy.getBodyColor());
        assertValue("Price Range", DecoyDuck.PriceRange.EXPENSIVE, decoy.getPriceRange());
        assertValue("Length in CM", 30, decoy.getLengthInCm()); // Assuming default value is 30
        assertValue("Quackable", false, decoy.isQuackable());
        assertValue("Flyable", true, decoy.isFlyable());
        assertValue("Name", "Fred", decoy.getName());

        // Check behavior methods
        System.out.print("Perform Quack: ");
        decoy.performQuack(); // Should not produce any sound

        System.out.print("Perform Fly: ");
        decoy.performFly(); // Should simulate flying action

        System.out.print("Swim: ");
        decoy.swim(); // All ducks should float

        System.out.println("Display: ");
        decoy.display(); // Should print out the details of the duck
    }

    // Primitive assertion method to check values
    private static <T> void assertValue(String attribute, T expected, T actual) {
        if (expected.equals(actual)) {
            System.out.println(attribute + " Test Passed");
        } else {
            System.out.println(attribute + " Test Failed: Expected " + expected + ", but got " + actual);
        }
    }

    private static void testDuck(Duck duck) {
        duck.display();
        duck.performQuack();
        duck.performFly();
        System.out.println(); // Blank line for readability between each duck's tests
    }
}