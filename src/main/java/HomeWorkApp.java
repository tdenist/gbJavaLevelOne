import java.util.Arrays;

public class HomeWorkApp {

    /*
    Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    public static void changeArrayElements() {

        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i =0; i < array.length; i++){
            if (array[i] == 1){
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    /*
    Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
     */
    public static void arrayFilling(){

        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
    }

    /*
    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2
     */
    public static void multiplicationByTwoArrayElementsLessThanSix() {

        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6){
                array[i] = array[i]*2;
            }
            System.out.print(array[i] + " ");
        }
    }

    /*
    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     */
    public static void diagonallyArrayFilling(int arraySize) {

        int[][] array = new int[arraySize][arraySize];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i == j) {
                    array[i][j] = 1;
                }
                if (i+j == arraySize-1){
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*
    Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue
     */
    public static int[] initArray(int len, int initialValue) {

        int[] array = new int[len];
        for (int i =0; i < array.length; i++){
            array[i] = initialValue;
        }
        return array;
    }

    /*
    Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
    public static void printMinAndMaxElement(int ... array){

        int minValueIndex = 0;
        int maxValueIndex = 0;
        int minValue = array[minValueIndex];
        int maxValue = array[maxValueIndex];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
            if (array[i] < minValue) {
                minValue = array[i];
                minValueIndex = i;
            }
        }
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Минимальный элемент массива: значение = " + minValue + ", индекс = " + minValueIndex);
        System.out.println("Максимальны элемент массива: значение = " + maxValue + ", индекс = " + maxValueIndex);
    }

    /*
    Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     */
    public static boolean checkBalance(int ... array) {

        boolean check = false;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++){
            for (int n = 0; n < i; n++){
                leftSum += array[n];
            }
            for (int m = array.length-1; m >=i; m--){
                rightSum += array[m];
            }
            //System.out.println(Arrays.toString(array) + " " + leftSum + " " + rightSum);
            if (leftSum == rightSum) {
                check = true;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }
        return check;
    }

    public static void main(String[] args) {

        changeArrayElements();
        System.out.println("\n");

        arrayFilling();
        System.out.println("\n");

        multiplicationByTwoArrayElementsLessThanSix();
        System.out.println("\n");

        diagonallyArrayFilling(5);
        System.out.println();

        System.out.println(Arrays.toString(initArray(5,10)));
        System.out.println();

        printMinAndMaxElement(1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9);
        System.out.println();

        System.out.println(checkBalance(2, 2, 2, 1, 2, 2, 10, 1));
        System.out.println(checkBalance(1, 1, 1, 2, 10));
    }
}
