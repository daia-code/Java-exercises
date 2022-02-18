package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter r1's center,x-,y-coordinates,width, and height: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double w1 = scanner.nextDouble();
        double h1 = scanner.nextDouble();
        System.out.println("Enter r2's center,x-,y-coordinates,width, and height: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double w2 = scanner.nextDouble();
        double h2 = scanner.nextDouble();
        if (h2 < h1 && w2 < w1) {
            System.out.println("r2 is inside r1");
        } else if ( (x1 <= w1 && y1 <= h1 && x2 <= w2 && y2 <= h2)) {
            System.out.println("r2 overlaps r1");
        } else {
            System.out.println("r2  does not overlap r1");
        }


    }
}
