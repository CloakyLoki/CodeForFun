package leetcode.math;

public class PalindromStr {

    public static void main(String[] args) {
        String value = "1211";
        if (isPalindrom(value)) {
            System.out.println("Выражение является палиндромом");
        } else {
            System.out.println("Выражение не является палиндромом");
        }
        }

    private static boolean isPalindrom(String value){
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) != value.charAt(value.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
