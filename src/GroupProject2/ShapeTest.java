package GroupProject2;


    public class ShapeTest {
        public static void main(String[] args) {
            // Test Circle
            Circle circle = new Circle(5);
            System.out.println("Circle Area: " + circle.calculateArea());
            System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

            // Test Square
            Square square = new Square(4);
            System.out.println("Square Area: " + square.calculateArea());
            System.out.println("Square Perimeter: " + square.calculatePerimeter());
        }

    }

