package hw6_7;

public class Homework6 {
    public static void main(String[] args) {
        byte aByte = (byte)88;   //-128 ... 127
        short aShort = Short.MAX_VALUE; // -32768... 32767
        int aInt = Integer.MIN_VALUE;
        int bInt = 900000000;
        long aLong = 1200L;
        float aFloat = 4.2f;
        double aDouble = 2.1;
        char aChar = 'g';
        boolean aTrue = true;
        boolean aFalse = false;
        String testString = "qa_guru";

        System.out.println("aByte + aShort = " + (aByte + aShort));
        System.out.println("aShort - aByte = " + (aShort - aByte));
        System.out.println("aLong / aInt = " + (aLong / aInt));
        System.out.println("aInt % aShort = " + (aInt % aShort));
        System.out.println("aInt + aDouble = " + (aInt + aDouble));
        System.out.println("aInt * aDouble = " + (aInt * aDouble));

        System.out.println("aFloat < aDouble = " + (aFloat < aDouble));
        System.out.println("aTrue && !aFalse = " + (aTrue && !aFalse));
        System.out.println("aTrue || aFalse = " + (aTrue || aFalse));

        if (aByte>aShort) {
            System.out.println(aByte + " > "+ aShort + " = Верно ");
        }
        else {
            System.out.println(aByte + " > "+ aShort + " = Не верно ");
        }

        if (aByte < 106 && aLong > 79) {
            System.out.println("Выполнены оба условия");
        }
        if (aByte < 106 || aLong > 1300) {
            System.out.println("Выполнено одно из условий");
        }

        System.out.println("Переполнение: " + (byte) (aByte + 50));
        System.out.println("Переполнение: " + (aInt + aDouble));

        System.out.println("Index of symbol: " + testString.indexOf(aChar));

    }
}
