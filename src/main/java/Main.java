public class Main {
    public static int processArray(String[][] array) throws MyArrayDataException, MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен иметь 4 строки.");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format("Строка %d имеет длину %d (Ожидается 4)", i, array[i].length));
            }
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("Неверные данные в ячейке [%d][%d]: %s", i, j, array[i][j]));
                }
            }
        }
        return sum;
    }

    public static void generateException() {
        try {
            int[] arr = new int[5];
            int value = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Поймано исключние ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] DataExceptionArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "abc"}
        };

        String[][] SizeExceptionArray = {
                {"1", "2", "3"},
                {"5", "6", "7"},
                {"9", "10", "11"},
                {"9", "10", "11"}
        };

        String[][][] allArrays = {correctArray, DataExceptionArray, SizeExceptionArray};
        for (String[][] array : allArrays) {
            try {
                System.out.println("Сумма массива: " + processArray(array));
            } catch (MyArraySizeException e) {
                System.out.println("Ошибка размера массива: " + e.getMessage());
            } catch (MyArrayDataException e) {
                System.out.println("Ошибка данных в массиве: " + e.getMessage());
            }
        }

        generateException();
    }
}

