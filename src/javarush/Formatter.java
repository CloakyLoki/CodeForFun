package javarush;

//Сделай так, чтобы метод format(String name, int salary) возвращал строку в таком виде:
//        Меня зовут <name>. Я буду зарабатывать $<salary> в месяц.
//
//        Для этого используй метод String.format().

public class Formatter {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        String result = String.format("Меня зовут %s. Я буду зарабатывать $%d в месяц.", name, salary);
        return result;
    }
}
