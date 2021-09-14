public class HomeWorkApp {

    public static boolean checkSum(int digitOne, int digitTwo) {

        if ((digitOne + digitTwo) >= 10 && (digitOne + digitTwo) <= 20)
            return true;
        else
            return false;
    }

    public static void printNumberIsPositiveOrNegative(int number) {

        if (number < 0)
            System.out.println("Число отрицательное");
        else
            System.out.println("Число положительное");
    }

    public static boolean isNumberNegative(int number) {

        if (number < 0)
            return true;
        else
            return false;
    }

    public static void printStringSomeTimes(String stringForPrint, int howManyTimesPrint) {

        for (int i = 0; i < howManyTimesPrint; i++) {
            System.out.println(stringForPrint);
        }
    }

    public static boolean isYearLeap(int year) {

        return ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)));
    }

    public static void main(String[] args) {
        // Проверка работы методов

        //Задание 1
        System.out.println("Задание 1");
        System.out.println(checkSum(4, 5));
        System.out.println(checkSum(5, 5));
        System.out.println(checkSum(6, 5));
        System.out.println(checkSum(10, 10));
        System.out.println(checkSum(10, 11));
        System.out.println();

        //Задание 2
        System.out.println("Задание 2");
        printNumberIsPositiveOrNegative(-1);
        printNumberIsPositiveOrNegative(0);
        printNumberIsPositiveOrNegative(1);
        System.out.println();

        //Задание 3
        System.out.println("Задание 3");
        System.out.println(isNumberNegative(-1));
        System.out.println(isNumberNegative(0));
        System.out.println(isNumberNegative(1));
        System.out.println();

        //Задание 4
        System.out.println("Задание 4");
        printStringSomeTimes("Я изучаю Java", 5);
        System.out.println();

        //Здание 5
        /*
        Для проверки вывел високосные года с 2200 по 2400.
        Года выводятся через 4, т.к. по условию каждый 4-й год считается високосным.
        Не должны выводиться 2200 и 2300, т.к. по условию каждый 100-й год не считается високосным.
        Должен выводиться 2400 год, т.к. по условию каждый 400-й год считается високосным.
         */
        System.out.println("Задание 5");
        for (int i = 2200; i <= 2400; i++) {
            if (isYearLeap(i)) System.out.println(i);
        }
    }
}
