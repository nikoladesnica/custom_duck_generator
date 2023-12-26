/**
 * A factory class for creating Duck objects of various species. Supports creating ducks
 * with default or custom names based on the species type.
 * The factory pattern is used to encapsulate the instantiation logic.
 *
 * @author Nikola Desnica (ndd2131)
 */
public class DuckFactory {

    /**
     * Enum representing the species of ducks that can be created by this factory.
     */
    public enum Species { MALLARD, REDHEAD, RUBBER, DECOY, MODEL_DUCK, MONK_DUCK }

    /**
     * Creates a duck of the specified species with a default name.
     *
     * @param species The species of the duck to be created.
     * @return A new Duck object of the specified species with a default name.
     */
    public Duck createDuck(Species species) {
        return createDuck(species, null); // Pass null as the name for the default
    }

    /**
     * Overloaded method to create a duck of the specified species with a custom name.
     *
     * @param species The species of the duck to be created.
     * @param name The custom name for the duck, if provided.
     * @return A new Duck object of the specified species with the given name.
     */
    public Duck createDuck(Species species, String name) {
        return switch (species) {
            case MALLARD -> (name != null) ? new MallardDuck(name) : new MallardDuck();
            case REDHEAD -> (name != null) ? new RedheadDuck(name) : new RedheadDuck();
            case RUBBER -> (name != null) ? new RubberDuck(name) : new RubberDuck();
            case DECOY -> (name != null) ? new DecoyDuck(name) : new DecoyDuck();
            case MONK_DUCK -> (name != null) ? new MonkDuck(name) : new MonkDuck();
            case MODEL_DUCK -> (name != null) ? new ModelDuck(name) : new ModelDuck();
            default -> throw new IllegalArgumentException("Unknown species: " + species);
        };
    }
}