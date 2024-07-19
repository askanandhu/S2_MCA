import java.util.Scanner;

public class Shapes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            // Read a shape from the user and display its area and perimeter
            System.out.print("Enter 1 for Circle, 2 for Rectangle, 5 to exit: ");
            int shape = sc.nextInt();
            switch (shape) {
                case 1:
                    System.out.print("Enter the radius: ");
                    Circle c = new Circle(sc.nextInt());
                    System.out.println("Area: " + c.area());
                    System.out.println("Perimeter: " + c.perimeter());
                    break;
                case 2:
                    System.out.print("Enter the length and breadth: ");
                    Rectangle r = new Rectangle(sc.nextInt(), sc.nextInt());
                    System.out.println("Area: " + r.area());
                    System.out.println("Perimeter: " + r.perimeter());
                    break;
                case 5:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
        
    }

}

interface Metrics {

    // Abstract Methods
    double area();    
    double perimeter();

}

class Circle implements Metrics {

    int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    // Overriding Abstract Methods
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}

class Rectangle implements Metrics {

    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding Abstract Methods
    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }

}
