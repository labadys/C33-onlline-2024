package lesson_9.Tasks_2;

public class ShapesDemo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Triangle(3, 4, 5), // A right-angled triangle
                new Rectangle(4, 6),  // Rectangle
                new Circle(5),        // Circle
                new Triangle(5, 5, 8),// Isosceles triangle
                new Rectangle(3, 7)   // Another rectangle
        };

        double totalPerimeter = 0;

        for (Shape shape : shapes) {
            totalPerimeter += shape.getPerimeter();
        }

        System.out.printf("The sum of the perimeters of all shapes: %.2f%n", totalPerimeter);
    }
}