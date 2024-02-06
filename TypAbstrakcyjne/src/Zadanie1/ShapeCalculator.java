package Zadanie1;

import java.util.NoSuchElementException;
import java.util.Scanner;

class ShapeCalculator {
    private Scanner sc = new Scanner(System.in);

    public void close()
    {
        sc.close();
    }

    private Rectangle readRectangleData() {
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();

        return new Rectangle(a, b);
    }

    private Circle readCircleData() {
        System.out.println("Podaj informacje o kole.");
        System.out.println("Podaj długość promienia:");
        double r = sc.nextDouble();

        return new Circle(r);
    }

    private Triangle readTriangleData() {
        System.out.println("Podaj informacje o trójkat.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość:");
        double h = sc.nextDouble();

        return new Triangle(a, b, c, h);
    }

    public Shape createShape() {
        int shapeType = sc.nextInt();
        return switch (shapeType)
        {
            case Shape.RECTANGLE -> readRectangleData();
            case Shape.TRIANGLE -> readTriangleData();
            case Shape.CIRCLE -> readCircleData();
            default -> throw new NoSuchElementException();
        };
    }

    public void clearBuffer(){
        sc.nextLine();
    }
}