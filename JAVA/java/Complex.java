import java.util.Scanner;

public class Complex {
    double a;
    double b;

    Complex(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return a + " + " + b + "i";
    }

    public static Complex add(Complex c1, Complex c2) {
        return new Complex(c1.a + c2.a, c1.b + c2.b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter real part of c1: ");
        double c1Real = sc.nextDouble();
        System.out.print("Enter imaginary part of c1: ");
        double c1Imaginary = sc.nextDouble();
        Complex c1 = new Complex(c1Real, c1Imaginary);
        
        System.out.print("Enter real part of c2: ");
        double c2Real = sc.nextDouble();
        System.out.print("Enter imaginary part of c2: ");
        double c2Imaginary = sc.nextDouble();
        Complex c2 = new Complex(c2Real, c2Imaginary);
        
        sc.close();

        Complex res = add(c1, c2);
        System.out.println("c1:\t" + c1);
        System.out.println("c2:\t" + c2);
        System.out.println("c1 + c2:\t" + res);
    }
}
