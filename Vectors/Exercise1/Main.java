package ro.ITSchool;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] array = create();
        int index;
        index = indexOfSmallestElement(array);
        System.out.println("The Smallest Element index is " + index);

    }

    public static double[] create() {
        Scanner scanner = new Scanner(System.in);
        double[] array = new double[5];
        System.out.print("Enter 5 numbers: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static int indexOfSmallestElement(double[] array) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    min = j;
                } else {
                    min = i;
                }
            }
        }

        return min;
    }
}
