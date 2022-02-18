package ro.ITSchool;

public class Patter4 {
    public static void main(String[] args) {
        System.out.println("Patteer IV");
        for (int i = 6; i >= 1; i--) {
            if (i == 5) {
                System.out.print("  ");
            }
            if (i == 4) {
                System.out.print("  " + "  ");
            }
            if (i == 3) {
                System.out.print("  " + "  " + "  ");
            }
            if (i == 2) {
                System.out.print("  " + "  " + "  " + "  ");
            }
            if (i == 1) {
                System.out.print("  " + "  " + "  " + "  " + "  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

        }
    }
}
