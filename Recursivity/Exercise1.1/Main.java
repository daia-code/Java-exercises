package ro.ITSchool;

public class Main {

    public static void main(String[] args) {
        int[] arr = {20, 45, 34, 66, 89, 90};
        int l = arr.length;
        int sum = sumRecurse(arr, l);
        System.out.println("Sum is " + sum);
    }

    public static int sumRecurse(int[] arr, int l) {
        l = l - 1;
        if (l == -1) {
            return 0;
        } else {
            return arr[l] + sumRecurse(arr, l);
        }
    }
}
