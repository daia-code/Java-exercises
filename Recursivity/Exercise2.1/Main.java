package ro.ITSchool;

public class Main {

    public static void main(String[] args) {
        int[] fibo = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144};
        int l = 0;
        int n9 = fibo9(fibo, l);
        System.out.println("The 9 element: " + n9);
    }

    public static int fibo9(int[] fibo, int l) {
        if (l == 8) {
            return fibo[l];
        } else {
            l = l + 1;
            return fibo9(fibo, l);
        }
    }
}
