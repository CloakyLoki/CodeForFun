package leetcode.strings;

public class RomanToInteger {

    public static void main(String[] args) {

        String romanNumber = "IX";
        System.out.println(romanToInt(romanNumber));
    }

    public static int romanToInt(String s) {

        int value;
        int result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I' -> value = 1;
                case 'V' -> value = 5;
                case 'X' -> value = 10;
                case 'L' -> value = 50;
                case 'C' -> value = 100;
                case 'D' -> value = 500;
                case 'M' -> value = 1000;
                default -> value = 0;
            }
            if ((value * 4) < result) {
                result -= value;
            } else {
                result += value;
            }
        }
        return result;
    }
}
