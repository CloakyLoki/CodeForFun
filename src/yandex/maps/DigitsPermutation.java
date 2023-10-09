package yandex.maps;

/**
 * Даны два числа X и Y без ведущих нулей.
 * Проверить, можно ли получить второе из первого перестановкой цифр.
 */
public class DigitsPermutation {

    public static void main(String[] args) {
        int x = 2013;
        int y = 1302;
        Boolean res = true;

        int[] digitsX = countDigits(x);
        int[] digitsY = countDigits(y);

        for (int i = 0; i < digitsX.length; i++) {
            if (digitsX[i] != digitsY[i]) res = false;
        }
        System.out.println(res);
    }

    private static int[] countDigits (int num){
        int[] ans = new int[10];
        while (num > 0){
            int lastDigit = num % 10;
            ans[lastDigit]++;
            num /= 10;
        }
        return ans;
    }
}
