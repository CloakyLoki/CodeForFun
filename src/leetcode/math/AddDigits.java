package leetcode.math;

/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2
Since 2 has only one digit, return it.
 */

public class AddDigits {
    public static void main(String[] args) {
       int num = 385;
       int num1 = 0;

        System.out.println(addDigits(num));
        System.out.println(addDigits(num1));
    }

    public static int addDigits(int num){
       Integer result = num;
//       int digitsNum = 0;
       int sum = 0;
       int len = result.toString().length();
       while (result > 1){
           for (int i = 0; i < len; i++) {
               sum += result % 10;
               result /= 10;

           }
       }

       return result;
    }
}
