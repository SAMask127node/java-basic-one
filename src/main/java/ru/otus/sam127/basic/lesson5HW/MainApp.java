package ru.otus.sam127.basic.lesson5HW;

import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int iterationCount = 5;
        String iterationText = "Hello";
        nString(iterationCount, iterationText);

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        sumArrGreaterThanFive(arr);

        fillArrWithNumber(5, new int[]{1,2,3});

        increaseArrElementsByNumber(5, new int[]{1,2,3});

        checkHalfSum(arr);
    }
    public static void nString(int length, String text) {
        for (int i=0; i<length; i++){
            System.out.println(text);
        }
    }
    public static void sumArrGreaterThanFive(int[] arr) {
        int sum = 0;
        for (int i=0; i<arr.length; i++){
           if (arr[i]>5){
               sum += arr[i];
           }
        }
        System.out.println(sum);
    }
    public static void fillArrWithNumber(int number, int[] arr) {
        for (int i=0; i<arr.length; i++){
            arr[i] = number;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void increaseArrElementsByNumber(int number, int[] arr) {
        for (int i=0; i<arr.length; i++){
            arr[i] = arr[i]+number;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void checkHalfSum(int[] arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i=0; i<arr.length/2; i++){
            sum1 += arr[i];
        }
        for (int i=arr.length/2; i<arr.length; i++){
            sum2 += arr[i];
        }
        if (sum1 > sum2){
            System.out.println(sum1);
        }
        else{
            System.out.println(sum2);
        }

    }
}
