/**
 * Represents a generic shape.
 */
abstract class CShape {

    private static int counter = 0; //Counter for generating shape ID's.
    private int id; //ID of the shape.

    /**
     * Constructs a shape and assigns unique ID.
     */
    public CShape() {
        this.id = counter++; //Increment counter and assign value to ID.
    }

    /**
     * Gets ID of Shape.
     * @return The shape ID.
     */
    public int getId() {
        return id;
    }
}
