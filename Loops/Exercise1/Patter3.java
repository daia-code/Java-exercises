package ro.ITSchool;

public class Patter3 {
    public static void main(String[] args) {
        System.out.println("Patteer III");
        for (int i = 1; i < 6; i++) {
            if (i == 1) {
                System.out.println("  " + " " + " " + " " + " " + " " + " " + " " + " " + i);
            }
            if (i == 1) {
                System.out.print("  " + " " + " " + " " + " " + " " + " ");
            }
            if (i == 2) {
                System.out.print("  " + " " + " " + " " + " ");
            }
            if (i == 3) {
                System.out.print("  " + " " + " ");
            }
            if (i == 4) {
                System.out.print("  ");
            }
            for (int j = i + 1; j >= 1; j--) {
                System.out.print(j + " ");

            }
            System.out.println();

        }
    }
}
