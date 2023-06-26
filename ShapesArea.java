import java.util.Scanner;

// Shape class (parent class)
class Shape {
    public double area() {
        return 0;
    }
}

// Rectangle class (child class)
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Circle class (child class)
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Square class (child class)
class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}

// Main class
public class ShapesArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Area of the rectangle: " + rectangle.area());

        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area of the circle: " + circle.area());

        System.out.print("Enter the side of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);
        System.out.println("Area of the square: " + square.area());
    }
}

