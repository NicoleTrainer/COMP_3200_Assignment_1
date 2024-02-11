/**
 * Represents an oval, with horizontal radius and vertical radius.
 */
class COval extends CShape {
    private int horizontalRadius;
    private int verticalRadius;

    /**
     * Constructs an oval with specified horizontal radius and vertical radius.
     * @param horizontalRadius The horizontal radius of the oval.
     * @param verticalRadius The vertical radius of the oval.
     */

    public COval(int horizontalRadius, int verticalRadius) {
        this.horizontalRadius = horizontalRadius;
        this.verticalRadius = verticalRadius;
    }

    /**
     * Gets the horizontal radius of the oval.
     *
     * @return the horizontal radius of the oval.
     */

    public int getHorizontalRadius() {
        return horizontalRadius;
    }

    /**
     * Gets the vertical radius of the oval.
     *
     * @return the vertical radius of the oval.
     */
    public int getVerticalRadius() {
        return verticalRadius;
    }


}
