package javarush;
//Используя StringTokenizer раздели query на части по разделителю delimiter.
//
//        Пример:
//        getTokens("java.util.stream", "\\.")
//        возвращает массив строк
//        {"java", "util", "stream"}
//
//        Hint: решить задачу поможет метод countTokens().
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {

        StringTokenizer newResult = new StringTokenizer(query, delimiter);
        String[] result = new String[newResult.countTokens()];
        int i = 0;
        while (newResult.hasMoreTokens()){
            result[i] = newResult.nextToken();
            i++;
        }


        return result;
    }
}
