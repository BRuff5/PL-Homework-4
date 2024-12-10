package geometry.Geometry2D.java;

/**
 * Represents a 2D Circle geometry.
 */
class Circle extends Geometry2D {
    private double radius;

    /**
     * Constructor for Circle.
     *
     * @param radius Radius of the circle.
     */
    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    /**
     * Calculates the area of the circle.
     *
     * @return Area of the circle.
     */
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return String representation.
     */
    @Override
    public String toString() {
        return String.format("%s [Radius: %.2f, Area: %.2f]", 
                name, radius, calculateArea());
    }
}
