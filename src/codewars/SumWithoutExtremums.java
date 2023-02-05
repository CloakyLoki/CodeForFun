package codewars;
//Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
import java.util.Arrays;

public class SumWithoutExtremums {
    public static void main(String[] args) {
        int[] test = {6, -2, -1, 8, 10};
        System.out.println(sum(test));
    }

    public static int sum(int[] numbers)
    {
        if (numbers == null || numbers.length <= 1)
            return 0;
        int sum = 0;
        Arrays.sort(numbers);
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }

}
