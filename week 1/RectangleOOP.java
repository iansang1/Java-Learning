
// Object-oriented approach: data and methods are bundled together in a class.
public class RectangleOOP {

    // Private fields (attributes).
    private double length;
    private double width;

    // Constructor.
    public RectangleOOP(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length.
    public double getLength() {
        return length;
    }

    // Getter for width.
    public double getWidth() {
        return width;
    }

    // Calculate area.
    public double getArea() {
        return length * width;
    }

    // Calculate perimeter.
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Main method.
    public static void main(String[] args) {

        // Create an object.
        RectangleOOP rect = new RectangleOOP(5.0, 3.0);

        // Display results.
        System.out.println("OOP Approach:");
        System.out.println("Length: " + rect.getLength());
        System.out.println("Width: " + rect.getWidth());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}
