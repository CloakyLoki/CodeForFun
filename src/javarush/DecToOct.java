package javarush;

public class DecToOct {
/*
Восьмеричный конвертер
*/

        public static void main(String[] args) {
            int decimalNumber = 21;
            System.out.println("Десятичное число " + decimalNumber + " равно восьмеричному числу " + toOctal(decimalNumber));
            int octalNumber = 025;
            System.out.println("Восьмеричное число " + octalNumber + " равно десятичному числу " + toDecimal(octalNumber));
        }

        public static int toOctal(int decimalNumber) {
            int octResult = 0;
            int i = 0;

            if (decimalNumber <= 0) return 0;
            while (decimalNumber != 0){
                octResult = octResult + (decimalNumber % 8) * (int)Math.pow(10, i);
                decimalNumber /= 8;
                        i++;
            }
            return octResult;
        }

        public static int toDecimal(int octalNumber) {
            int decResult = 0;
            int i = 0;

            if (octalNumber <=0) return 0;
            while (octalNumber != 0){
                decResult = decResult + (octalNumber % 10) * (int)Math.pow(8,i);
                octalNumber /= 10;
                i++;
            }

            return decResult;
        }

}
