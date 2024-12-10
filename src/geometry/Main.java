package geometry;

/**
 * Abstract base class representing a general Geometry.
 */
abstract class Geometry {
    protected String name;

    /**
     * Constructor for Geometry.
     *
     * @param name Name of the geometry.
     */
    public Geometry(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the geometry.
     *
     * @return The name of the geometry.
     */
    public String getName() {
        return name;
    }

    /**
     * Calculates the area of the geometry.
     * To be implemented by subclasses.
     *
     * @return Area of the geometry.
     */
    public abstract double calculateArea();

    /**
     * Returns a string representation of the geometry.
     *
     * @return String representation.
     */
    public abstract String toString();

    public void setName(String name) {
        this.name = name;
    }
}

/**
 * Abstract class for 2D geometries.
 */
abstract class Geometry2D extends Geometry {
    /**
     * Constructor for Geometry2D.
     *
     * @param name Name of the geometry.
     */
    public Geometry2D(String name) {
        super(name);
    }
}

/**
 * Abstract class for 3D geometries.
 */
abstract class Geometry3D extends Geometry {
    /**
     * Constructor for Geometry3D.
     *
     * @param name Name of the geometry.
     */
    public Geometry3D(String name) {
        super(name);
    }

    /**
     * Calculates the volume of the geometry.
     * To be implemented by subclasses.
     *
     * @return Volume of the geometry.
     */
    public abstract double calculateVolume();
}
