package leetcode.arrays;
//Given an integer x, return true if x is palindrome integer.
public class IsPolinindrome {
    public static void main(String[] args) {
        int num = 121;
        int num2 = 123;
        System.out.println(isPalindrome(num));
        System.out.println(isPalindrome(num2));
    }


    public static boolean isPalindrome(int x) {
        StringBuilder direct = new StringBuilder(Integer.toString(x));
        String direct2 = direct.toString();
        direct.reverse();


        return direct2.equals(direct.toString());
    }
}