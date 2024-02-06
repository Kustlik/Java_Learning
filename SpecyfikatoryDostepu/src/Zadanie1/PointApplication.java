package Zadanie1;

import Zadanie1.Point.Point;
import Zadanie1.PointController.PointController;

import java.util.Scanner;

public class PointApplication
{
    public static void main(String[] args)
    {
        PointController pointC = new PointController();
        Scanner scanner = new Scanner(System.in);

        Point a = new Point(3, 7);
        Point b = new Point(-4, 2);

        System.out.println("Choose point - a or b");
        switch(scanner.nextLine())
        {
            case "a" ->
            {
                showOptions(pointC, scanner, a);
            }
            case "b" ->
            {
                showOptions(pointC, scanner, b);
            }
        }

        a.showPosition();
        b.showPosition();
        pointC.addX(a);
        a.showPosition();
        pointC.addX(a);
        a.showPosition();
        pointC.minusX(a);
        a.showPosition();
        pointC.addX(b);
        b.showPosition();
        pointC.addX(b);
        b.showPosition();
        pointC.addY(a);
        a.showPosition();
        pointC.minusX(a);
        a.showPosition();
    }

    private static void showOptions(PointController pointC, Scanner scanner, Point p) {
        System.out.println("""
                Choose option:\s
                1 - Add x\s
                2 - Minus x\s
                3 - Add y\s
                4 - Minus y""");
        switch(scanner.nextLine())
        {
            case "1" -> pointC.addX(p);
            case "2" -> pointC.minusX(p);
            case "3" -> pointC.addY(p);
            case "4" -> pointC.minusY(p);
        }
    }
}
