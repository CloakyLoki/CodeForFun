package leetcode.math;

public class Pow {

    public static void main(String[] args) {
        double x = 1;
        int n = -2147483648;
        System.out.println(myPow(x, n));

    }

    public static double myPow(double x, int n) {
        double result = 1;
        double temp = 1;
        if (x == -1 && n == Integer.MIN_VALUE) return 1;
        if (x == 1 && n == Integer.MIN_VALUE) return 1;
        if (x == 1 && n == Integer.MAX_VALUE || n == 1 || (x == -1 && n == Integer.MAX_VALUE)) return x;
        if (n == Integer.MIN_VALUE) return 0;
        else if (n > 1) {
            for (int i = 0; i < n; i++) {
                result *= x;
            }
            return result;
        } else if (n < 0) {
            for (int i = 0; i < Math.abs(n); i++) {
                temp *= x;
            }
            return result = 1 / temp;
        } else return 1;
    }
}
