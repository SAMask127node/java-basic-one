package ru.otus.sam127.basic.lesson14HW;

public class MainApp {
    public static void main(String[] args) {

        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int a = sumOfElementsOf2DArray(arr);
            System.out.println(a);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arrCheckDimension = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
                {"13", "14", "15", "16"}
        };

        try {
            int a = sumOfElementsOf2DArray(arrCheckDimension);
            System.out.println(a);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

        String[][] arrCheckData = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "sdvsdv", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int a = sumOfElementsOf2DArray(arrCheckData);
            System.out.println(a);
        } catch (AppArraySizeException | AppArrayDataException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int sumOfElementsOf2DArray(String[][] strArray) {
        if (strArray.length != 4) {
            throw new AppArraySizeException();
        }
        for (String[] strings : strArray) {
            if (strings.length != 4) {
                throw new AppArraySizeException();
            }
        }

        int sum = 0;
        int currentElement;


        for (int i = 0; i < strArray.length - 1; i++) {
            for (int j = 0; j < strArray[i].length - 1; j++) {
                try {
                    currentElement = Integer.parseInt(strArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException(i+1, j+1);
                }
                sum += currentElement;
            }
        }

        return sum;
    }
}
