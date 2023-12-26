/**
 * FlyRocketPowered provides a concrete implementation of the FlyBehavior interface
 * for ducks that are powered by a rocket. This class represents a behavior where
 * ducks can achieve flight using a rocket mechanism, which is generally an unusual
 * method for a duck to fly and suggests a non-natural enhancement.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class FlyRocketPowered implements FlyBehavior {

    /**
     * Simulates flying with the aid of a rocket. This method overrides the fly method
     * to represent rocket-powered flight, typically indicating an extraordinary
     * flying capability for a duck.
     */
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}