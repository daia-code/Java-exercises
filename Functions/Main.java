package ro.ITSchool;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti un nr: ");
        int nr = scanner.nextInt();
        int rezultat = reverse(nr);
        System.out.println(rezultat);
    }

    public static int reverse(int nr) {
        int r = 0;
        while (nr != 0) {
            int rem = nr % 10;
            r = r * 10 + rem;
            nr = nr / 10;
        }
        return r;
    }
}
