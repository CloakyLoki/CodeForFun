package leetcode.math;

/*
    Given an integer n, return the number of prime numbers that are strictly less than n.
*/
public class CountPrimes {

    public static void main(String[] args) {
        int n = 1500000;
        System.out.println(countPrimes(n));
    }

    public static int countPrimes(int n) {
        //Eratosthenes Solution - excluding multiplies of the number
        boolean[] seen = new boolean[n];
        int result = 0;
        for (int num = 2; num < n; num++) {
            if (seen[num]) continue;
            result += 1;
            for (long mult = (long) num * num; mult < n; mult += num)
                seen[(int) mult] = true;
        }
        return result;
    }
}
