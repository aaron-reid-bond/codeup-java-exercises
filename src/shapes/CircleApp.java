package shapes;

import java.util.Scanner;

public class CircleApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        System.out.printf("Circumference: %.2f%n", circle.getCircumference());

        System.out.printf("Area: %.2f%n", circle.getArea());

        scanner.close();
    }
}
