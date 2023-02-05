package codewars;

public class FatherSon {

    public static void main(String[] args) {
        double sonAge = 9;
        double fatherAge = 37;
        printDoubleFatherAge(sonAge, fatherAge);
    }
    public static void printDoubleFatherAge(double sonAge, double fatherAge) {
        double years = 0;
        double tempSonAge = sonAge;
        double tempFatherAge = fatherAge;
        boolean past = false;
        for (int i = 0; i < tempSonAge; i++) {
            if (fatherAge / 2 == sonAge) {
                years = i;
                past = true;
                break;
            } else {
                fatherAge--;
                sonAge--;
            }
        }
        if (years == 0) {
            fatherAge = tempFatherAge;
            sonAge = tempSonAge;
            for (int i = 0; i < 100; i++) {
                if (fatherAge / 2 == sonAge) {
                    years = i;
                    break;
                } else {
                    fatherAge++;
                    sonAge++;
                }
            }
        }
        if (past) {
            System.out.println("Отец был в два раза старше сына " + years + " лет назад");
        } else {
            System.out.println("Отец будет в два раза больше сына через " + years + " лет");
        }
    }
}