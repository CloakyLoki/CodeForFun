package javarush;
//Выведи на экран следующий текст в две строки:
//        It's a Windows path: "C:\Program Files\Java\jdk-13.0.0\bin"
//        It's a Java string: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"
public class EscSymbols {
    public static void main(String[] args) {
        String a = "It\'s a Windows path: \"C:\\Program Files\\Java\\jdk-13.0.0\\bin\"";
        String b = "It\'s a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk-13.0.0\\\\bin\\\"";
        System.out.println(a);
        System.out.println(b);


    }
}
