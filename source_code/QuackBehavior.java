/**
 * The QuackBehavior interface defines a common behavior for quacking
 * that all ducks (or classes representing ducks) can implement. This interface
 * is a part of the strategy pattern which allows dynamic changing of the
 * quacking behavior at runtime.
 *
 * @author Nikola Desnica (ndd2131)
 */
public interface QuackBehavior {
    /**
     * The quack method is used to simulate duck quacking.
     * The implementation of this method will provide the specific sound
     * or behavior associated with the quack.
     */
    void quack();
}