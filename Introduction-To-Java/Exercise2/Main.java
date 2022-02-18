package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = cititor.nextDouble();
        double y1 = cititor.nextDouble();
        double x2 = cititor.nextDouble();
        double y2 = cititor.nextDouble();
        double x3 = cititor.nextDouble();
        double y3 = cititor.nextDouble();
        double side1, side2, side3;
        side1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        side2 = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        side3 = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        double s, area;
        s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        System.out.printf("The area of the triangle is %.2f", area);

    }
}
