package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cititor = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000:" + " ");
        int x = cititor.nextInt();
        int a = x % 10;
        int rem = x - a;
        rem = rem / 10;
        int b = rem % 10;
        rem = rem / 10;
        int sum = a + b + rem;
        System.out.println("The sum of the digits is" + " " + sum);


    }
}
