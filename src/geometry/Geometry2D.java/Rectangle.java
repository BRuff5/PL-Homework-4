package geometry.Geometry2D.java;

/**
 * Represents a 2D Rectangle geometry.
 */
class Rectangle extends Geometry2D {
    private double width;
    private double height;

    /**
     * Constructor for Rectangle.
     *
     * @param width  Width of the rectangle.
     * @param height Height of the rectangle.
     */
    public Rectangle(double width, double height) {
        super("Rectangle");
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return Area of the rectangle.
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        return String.format("%s [Width: %.2f, Height: %.2f, Area: %.2f]", 
                name, width, height, calculateArea());
    }
}
