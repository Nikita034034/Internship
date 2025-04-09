import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //System.out.println(sumInRange(1, 10));
        //checkNumber(-5);
        //System.out.println(isNegative(-10));
        //printMultiple("hello", 3);
        //System.out.println(isLeapYear(2020));
        //task10();
        //task11();
        //task12();
        //task13(5);
        //System.out.println(Arrays.toString(task14(5, 42)));
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = -17;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void checkNumber(int a) {
        System.out.println(a >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean isNegative(int a) {
        return a < 0;
    }

    public static void printMultiple(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean isLeapYear(int a) {
        return (a % 400 == 0) || (a % 100 != 0 && a % 4 == 0);
    }

    public static void task10() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task11() {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task12() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6){
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void task13(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[] task14(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}