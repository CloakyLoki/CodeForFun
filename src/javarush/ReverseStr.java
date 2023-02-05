package javarush;

public class ReverseStr {
    public static void main(String[] args) {
        String string = "Ходит кот задом наперед";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder temp = new StringBuilder(string);
        temp.reverse();
        String result = temp.toString();
        return result;
    }
}
