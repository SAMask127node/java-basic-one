package ru.otus.sam127.basic.lesson7HW;

public class MainApp {
    public static void main(String[] args) {
        /*int[][] blobArray = new int[4][5];
        for (int i = 0; i < blobArray.length; i++) {
            for (int j = 0; j < blobArray[i].length; j++) {
                blobArray[i][j] = (int) (Math.random() * 10);
            }
        }*/
        System.out.println("Задание 1:");
        int[][] blobArray = create2DArray(4, 5);
        print2DArray(blobArray);
        System.out.println("The Sum of array elements(>0) = " + sumOfPositiveElements(blobArray));

        System.out.println("Задание 2:");
        drawSquare(5);

        System.out.println("Задание 3:");
        System.out.println("Initial array:");
        int[][] squareArray = create2DArray(5, 5);
        print2DArray(squareArray);
        System.out.println("With 0 diagonal elements:");
        print2DArray(zeroDiagonalElements(squareArray));

        System.out.println("Задание 4:");
        System.out.println(findMax(squareArray));

        System.out.println("Задание 5:");
        System.out.println("Array with rows > 1:");
        int[][] arrWithRowsGr1 = create2DArray(5, 5);
        print2DArray(arrWithRowsGr1);
        System.out.println("Sum of elements of the second row:");
        System.out.println(row2Sum(arrWithRowsGr1));
        System.out.println("Array with rows = 1:");
        int[][] arrWithRowsEq1 = create2DArray(1, 5);
        print2DArray(arrWithRowsEq1);
        System.out.println("The result is:");
        System.out.println(row2Sum(arrWithRowsEq1));
    }

    public static int sumOfPositiveElements(int[][] arr2D) {
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > 0) {
                    sum += arr2D[i][j];
                }
            }
        }
        return sum;
    }

    public static void drawSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*" + "  ");
            }
            System.out.println();
        }
    }

    public static int[][] zeroDiagonalElements(int[][] arr2D) {
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j) {
                    arr2D[i][j] = 0;
                }
            }
        }
        return arr2D;
    }
    public static int findMax(int[][] arr2D) {
        int max = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (arr2D[i][j] > max){
                    max = arr2D[i][j];
                }
            }
        }
        return max;
    }
    public static int row2Sum(int[][] arr2D) {
        if (arr2D.length < 2){
            return -1;
        }

        int i =1;
        int sum = 0;
        for (int j = 0; j < arr2D[i].length; j++) {
            sum += arr2D[i][j];
        }
        return sum;
    }
    public static int[][] create2DArray(int x, int y) {
        int[][] blobArray = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                blobArray[i][j] = (int) (Math.random() * 10);
            }
        }
        return blobArray;
    }

    public static void print2DArray(int[][] arr2D) {
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}