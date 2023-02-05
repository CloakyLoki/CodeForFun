package codewars;

import java.util.Arrays;

//Convert number to reversed array of digits

public class ReversedArrayDigits {
    public static void main(String[] args) {
        long n = 2601992564L;
        //2601992564

        System.out.println(Arrays.toString(digitize(n)));
    }

    public static int[] digitize(long n) {
    int lenght = (int)Math.ceil(Math.log10(Math.abs(n) + 0.5));
    if (lenght < 1){
        lenght = 1;
    }
    int[] result = new int[lenght];
        for (int i = lenght - 1; i >= 0 ; i--) {
            result[lenght - i - 1] = (int) n % 10;
            n /= 10;
        }
    return result;
    }
//public static int[] digitize(long n){
//        StringBuilder result = new StringBuilder(Long.toString(n));
//        result.reverse();
//        int[] resultarr = new int[result.length()];
//    for (int i = 0; i < resultarr.length; i++) {
//        resultarr[i] = (int) (result.charAt(i));
//    }
    //return resultarr;
//}

    }
