package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double rad = scanner.nextInt();
        Circle circle1 = new Circle(rad);
        circle1.areaCircle();
    }
}
