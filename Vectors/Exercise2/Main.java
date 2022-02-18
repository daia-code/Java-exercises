package ro.ITSchool;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        int[] vector = readV();
        System.out.print("The distinct numbers are: ");
        writeD(vector);

    }

    public static int[] readV() {
        Scanner scanner = new Scanner(System.in);
        int[] vector = new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    public static void writeD(int[] vector) {
        Set<Integer> set = new HashSet<>();
        for (int num : vector) {
            set.add(num);
        }
        int l = set.toArray().length;
        var v = set.toArray();
        write2(v, l);

    }

    public static void write2(Object[] v, int l) {
        for (int j = 0; j < l; j++) {
            System.out.print(v[j] + " ");
        }
    }

}