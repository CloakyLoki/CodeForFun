package javarush;
//путь — "/usr/java/jdk1.8/bin/"
//        версия jdk — "jdk-13"
//
//        Метод changePath(путь, версия jdk) должен вернуть путь — "/usr/java/jdk-13/bin/".
public class ReplaceDomain {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";
        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        int startI = path.indexOf("jdk");
        String firstPart = path.substring(0, startI);
        String temp = path.substring(startI);
        int endI = temp.indexOf("/");
        String lastPart = temp.substring(endI);
        String result = firstPart + jdk + lastPart;
        return result;
    }

}
