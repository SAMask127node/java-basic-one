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
        int numberOfRows = strArray.length;
        int numberOfColumns = strArray[0].length;

        if (!(numberOfRows == 4 && numberOfColumns == 4)) {
            throw new AppArraySizeException();
        }
        int sum = 0;
        int rowNumber = 0, columnNumber = 0;
        int currentElement;
        try {

            for (int i = 0; i < numberOfRows - 1; i++) {
                for (int j = 0; j < numberOfColumns - 1; j++) {
                    rowNumber = i + 1;
                    columnNumber = j + 1;
                    currentElement = Integer.parseInt(strArray[i][j]);
                    sum += currentElement;
                }
            }
        } catch (NumberFormatException e) {
            throw new AppArrayDataException(rowNumber, columnNumber);
        }
        return sum;
    }
}
