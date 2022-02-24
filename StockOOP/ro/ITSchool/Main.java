package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the simbol: ");
        String simbol = scanner.nextLine();
        System.out.println("Enter the stock: ");
        String stock = scanner.nextLine();
        System.out.println("Enter the closing Price: ");
        double closingPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter the current Price: ");
        double currentPrice = scanner.nextDouble();
        scanner.nextLine();
        Stock stock1 = new Stock(simbol, stock, closingPrice, currentPrice);
        double change = stock1.getChangePercent();
        System.out.printf("The procent is %.2f ", change);
    }
}
