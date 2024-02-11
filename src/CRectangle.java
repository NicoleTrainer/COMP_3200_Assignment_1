/**
 * For shape rectangle, with length and width.
 */

class CRectangle extends CShape {
    private int length;
    private int width;

    /**
     * Constructs a rectangle with specified length and width.
     * @param length The length of the rectangle.
     * @param width The width of the rectangle.
     */
    public CRectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    /**
     * Gets length of rectangle.
     *
     * @return length of rectangle.
     */
    public int getLength() {
        return length;
    }

    /**
     * Gets width of rectangle.
     *
     * @return The width of rectangle.
     */

    public int getWidth() {
        return width;
    }

}
