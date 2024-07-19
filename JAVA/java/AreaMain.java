import java.util.Scanner;

class ShapeArea {
    
    void area(double r) {
        System.out.println("Area of circle: " + String.format("%.2f", 3.14 * r * r));
    }
    
    void area(float side) {
        System.out.println("Area of square: " + (side * side));
    }
    
    void area(double l, double b) {
        System.out.println("Area of rectangle: " + (l * b));
    }
    
    void area(float b, float h) {
        System.out.println("Area of triangle: " + (0.5 * b * h));
    }
}

public class AreaMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeArea shapeArea = new ShapeArea();

        System.out.print("Enter radius of circle: ");
        double circleRadius = sc.nextDouble();
        shapeArea.area(circleRadius);

        System.out.print("Enter length of side of square: ");
        float squareSide = sc.nextFloat();
        shapeArea.area(squareSide);

        System.out.print("Enter length and breadth of rectangle: ");
        double rectangleLength = sc.nextDouble();
        double rectangleBreadth = sc.nextDouble();
        shapeArea.area(rectangleLength, rectangleBreadth);

        System.out.print("Enter breadth and height of triangle: ");
        float triangleBreadth = sc.nextFloat();
        float triangleHeight = sc.nextFloat();
        shapeArea.area(triangleBreadth, triangleHeight);

        sc.close();
    }
}
