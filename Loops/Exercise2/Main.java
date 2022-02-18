package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double percent = scanner.nextDouble();
        System.out.print("Enter maturity period(no. of months): ");
        int period = scanner.nextInt();
        System.out.println();
        System.out.println("Month " + "    " + "    " + "CD Value");
        for (int i = 1; i <= period; i++) {
            amount = amount + (amount * (percent / 1200));
            if (i >= 10) {
                System.out.printf(i + "      " + "      %.2f \n", amount);
            } else {
                System.out.printf(" " + i + "      " + "      %.2f \n", amount);
            }


        }
    }
}
