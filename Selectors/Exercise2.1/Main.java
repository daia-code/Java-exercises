package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double d1 = Math.pow((0 - x), 2);
        double d2 = Math.pow((0 - y), 2);
        double s = Math.sqrt(d1 + d2);
        System.out.print("Point (" + x + " , " + y + ")" + " is ");
        if (s <= 10) {
            System.out.print("in the circle ");
        } else
            System.out.print("not in the circle ");

    }
}
